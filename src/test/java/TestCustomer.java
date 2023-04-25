import database.CustomerDAO;
import database.DBContext;
import junit.framework.TestCase;
import model.Customer;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.sql.Date;

public class TestCustomer extends TestCase {

    private CustomerDAO customerDAO = new CustomerDAO();

    @Before
    public void setUp() {
//        DBContext.url = "jdbc:mysql://localhost:33068/quanlybanhang_test";
    }

    @After
    public void tearDown() {

    }

    /**
     * Hàm này kiểm tra thêm thành công một customer
     * */
    @Test
    public void testaddCustomer() {
        // Setup
        Customer customer1 = new Customer(0, "Dung Sobin1", "Nam", new Date(2001, 7, 14), "0963846561", "dungsobin102@gmail.com", "Thach That Ha Noi");

        // Run
        boolean success = customerDAO.addCustomer(customer1);

        // Compare
        assertTrue(success);
    }


    /**
     * Hàm này kiểm tra update customer có thành công hay không
     * */
    @Test
    public void testUpdateCustomer() {
        // ban đầu tìm customer có ID = 8
        Customer customer = customerDAO.findCustomerById(8);
        // cập nhật lại tên khách hàng = "Đỗ Đăng Dũng"
        customer.setCustomerName("Đỗ Đăng Dũng");
        // thực hiện update
        boolean isSuccess = customerDAO.updateCustomer(customer);
        assertNotNull(customer);
        assertTrue(isSuccess);
        // lấy thông tin khách hàng có ID = 8 lại để kiểm tra
        Customer updatedCustomer = customerDAO.findCustomerById(8);
//        assertNotNull(updatedCustomer);
        assertEquals("Đỗ Đăng Dũng", updatedCustomer.getCustomerName());
    }

    @Test
    public void testDeleteCustomer() {
        boolean isSuccess = customerDAO.removeCustomer(30);
        Customer customer = customerDAO.findCustomerById(30);
        assertTrue(isSuccess);
        assertNull(customer);
    }
}
