import database.CustomerDAO;
import database.DBContext;
import junit.framework.TestCase;
import model.Customer;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import service.CustomerService;
import service.impl.CustomerServiceImpl;

import java.sql.Date;
import java.util.List;

public class TestCustomer extends TestCase {

    private final CustomerService customerService = new CustomerServiceImpl();

    private final CustomerDAO customerDAO = new CustomerDAO();

    @Before
    public void setUp() {
        DBContext.url = "jdbc:mysql://localhost:33068/quanlybanhang";
    }

    @After
    public void tearDown() {

    }

    /**
     * Hàm này kiểm tra số luượng customer lấy ra có đúng với số lương customer active không
     * Kiểm tra thêm tất cả customer có cột customer name không null và !empty
     * */
    @Test
    public void testGetAllCustomer() {
        int count = customerService.countUserActive();

        List<Customer> customers = customerService.getAllCustomers();

        assertTrue(customers.stream().allMatch(customer -> customer.getCustomerName() != null && !customer.getCustomerName().isEmpty()));
        assertEquals(count, customers.size());
    }

    /**
     * Hàm này kiểm tra thêm thành công một customer
     * */
    @Test
    public void testAddCustomer() {
        // Setup
        // Tạo customer mới
        Customer customer1 = new Customer(0, "Dung Sobin1", "Nam", new Date(2001, 7, 14), "0963846561", "dungsobin102@gmail.com", "Thach That Ha Noi");

        // Run
        int countBefore = customerService.countUserActive();
        // Thêm customer vừa tạo vào database
        boolean success = customerService.addCustomer(customer1);
        int countAfter = customerService.countUserActive();

        // Compare
        // check thêm thành công
        assertTrue(success);
        // số lượng tăng thêm 1
        assertEquals(countBefore + 1, countAfter);
    }

    /**
     * Hàm này kiểm tra tính đúng đắn dữ liệu sau khi thêm vào
     * */
    @Test
    public void testTinhDungDanAddCustomer() {
        Customer customer = new Customer(0, "Dũng Sobin", "Nam", new Date(2001, 7, 14), "0963846561", "dungsobin102@gmail.com", "Thach That Ha Noi");
        int id = customerDAO.addCustomerReturnId(customer);
        Customer justGet = customerService.getCustomerById(id);
        assertEquals("Nam", justGet.getGender());
        assertEquals("Dũng Sobin", justGet.getCustomerName());
        assertEquals("2001-07-14", justGet.getDateOfBirth());
        assertEquals("0963846561", justGet.getPhoneNumber());
        assertEquals("dungsobin102@gmail.com", justGet.getEmail());
        assertEquals("Thach That Ha Noi", justGet.getAddress());
    }


    /**
     * Hàm này kiểm tra thêm thất bại một customer đã trùng số điện thoại với 1 customer trước đó
     * Check cột phone phải là unique key not null
     * */
    public void testAddFailCustomer() {
        // Lấy ra customer có sẵn mang ID = 1
        Customer customer = customerService.getCustomerById(1);
        // gán số điện thoại của customer cũ cho customer mới
        Customer newCus = new Customer(0, "Dung Sobin1", "Nam", new Date(2001, 7, 14), customer.getPhoneNumber(), "dungsobin102@gmail.com", "Thach That Ha Noi");
        // thêm
        boolean isAddSuccess = customerService.addCustomer(newCus);
        assertFalse(isAddSuccess);
    }


    /**
     * Hàm này kiểm tra update customer có thành công hay không
     * */
    @Test
    public void testUpdateSuccessCustomer() {
        // vào database bảng customer tìm ID của một customer có sẵn
        // hoặc truy vấn câu lệnh "SELECT * FROM Customer;
        int id = 4;

        // ban đầu tìm customer có ID = id
        Customer customer = customerService.getCustomerById(id);
        // cập nhật lại tên khách hàng = "Đỗ Đăng Dũng"
        customer.setCustomerName("Đỗ Đăng Dũng");
        // thực hiện update
        boolean isSuccess = customerService.updateCustomer(customer);

        assertNotNull(customer);
        assertTrue(isSuccess);
        // lấy thông tin khách hàng có ID = id lại để kiểm tra
        Customer updatedCustomer = customerService.getCustomerById(id);
        assertNotNull(updatedCustomer);
        assertEquals("Đỗ Đăng Dũng", updatedCustomer.getCustomerName());
    }

    /**
     * Hàm này kiểm tra update customer thất bại check xem update số điện thoại có đang cho trùng nhau hay không
     * */
    @Test
    public void testUpdateFailCustomer() {
        // vào database bảng customer tìm ID của một customer có sẵn
        // hoặc truy vấn câu lệnh "SELECT * FROM Customer;
        int id = 4;

        // ban đầu tìm customer có ID = id
        Customer customer = customerService.getCustomerById(id);
        // cập nhật lại tên khách hàng = "Đỗ Đăng Dũng"
        customer.setPhoneNumber("0963846561"); // set 1 số điện thoại đã có SELECT * FROM Customer để lấy sđt có ID khác id
        // thực hiện update
        boolean isSuccess = customerService.updateCustomer(customer);
        // lấy thông tin khách hàng có ID = id lại để kiểm tra
        Customer updatedCustomer = customerService.getCustomerById(id);

        assertNotNull(customer);
        assertFalse(isSuccess);
        assertNotNull(updatedCustomer);
        assertEquals("Đỗ Đăng Dũng", updatedCustomer.getCustomerName());
    }

    /**
     * Hàm này test xóa thành công một Customer đã có trong database
     * */
    @Test
    public void testDeleteSuccessCustomer() {
        // SELECT * FROM Customer trong database để tìm customer muốn xóa có status = 1 là đang active
        // giả sử tìm thấy id = 9
        int id = 9;

        int countBefore = customerService.countUserActive();
        boolean isSuccess = customerService.removeCustomer(id);
        Customer customer = customerService.getCustomerById(id);
        int countAfter = customerService.countUserActive();

        assertTrue(isSuccess);
        // SELECT * FROM Customer where ID = id true nếu status = 0;
        assertTrue(true);
        assertEquals(countBefore - 1, countAfter);
    }

    /**
     * Hàm này test xóa thất bại một Customer đã có trong database
     * */
    @Test
    public void testDeleteFailCustomer() {
        // SELECT * FROM Customer trong database để tìm customer muốn xóa một customer chưa có
        // giả sử cho id = 100000
        int id = 100000;

        int countBefore = customerService.countUserActive();
        boolean isSuccess = customerService.removeCustomer(id);
        int countAfter = customerService.countUserActive();
        Customer customer = customerService.getCustomerById(id);

        assertFalse(isSuccess);
        // SELECT * FROM Customer where ID = id true nếu status = 0;
        assertTrue(true);
        // số lượng user active không thay đổi
        assertEquals(countBefore, countAfter);
    }
}
