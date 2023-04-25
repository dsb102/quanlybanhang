import database.DBContext;
import database.OrderDAO;
import model.OrderDetail;
import model.Orders;
import model.Product;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import service.*;
import service.impl.*;

import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.*;

public class TestOrderAndOrderDetail {

    private final OrderService orderService = new OrderServiceImpl();

    private final OrderDAO orderDAO = new OrderDAO();

    private final CustomerService customerService = new CustomerServiceImpl();

    private final EmployeeService employeeService = new EmployeeServiceImpl();

    private final OrderDetailService orderDetailService = new OrderDetailServiceImpl();

    private final ProductService productService = new ProductServiceImpl();


    @Before
    public void setUp() {
        DBContext.url = "jdbc:mysql://localhost:33068/quanlybanhang";
    }

    @After
    public void tearDown() {

    }

    /**
     * Hàm này test thêm giỏ hàng thành công
     * */
    @Test
    public void addOrderSuccess() {
        // setup
        Orders orders = new Orders(1, 1);

        // run
        int totalBef = orderService.countTotal();
        int id = orderService.createOrder(orders);
        int totalAft = orderService.countTotal();

        // tạo thành công khi tổng đơn hàng tăng lên
        assertEquals(totalBef + 1, totalAft);

        // tạo thành công
        assertNotEquals(-1, id);
    }

    @Test
    public void checkDoChinhXacDuLieuDonHang() {
        // setup data
        // tạo đơn hàng trống
        Orders orders = new Orders(1, 1);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        // run
        int id = orderService.createOrder(orders);
        Orders newOrder = orderService.findById(id);

        // check đúng ID khách hàng
        assertEquals(1, orders.getCustomerId());
        // check đúng ID nhân viên
        assertEquals(1, orders.getEmployeeId());
        // format dung ngay yyyy-MM-dd
        assertEquals(sdf.format(new Date()), newOrder.getOrderDate().toString());
        // chua thanh toan
        assertFalse(newOrder.isPayment());
        // check tổng đơn hàng bằng 0
        assertEquals(0, newOrder.getTotalPrice());
    }

    /**
     * Hàm này test chức năng update Order đúng dữ liệu không
     * */
    @Test
    public void checkUpdateSuccessDonHang() {
        Orders orders = new Orders(1, 1);

        int id = orderService.createOrder(orders);
        Orders orderUpdate = orderService.findById(id);
        orderUpdate.setCustomerId(2);
        orderUpdate.setEmployeeId(2);
        boolean isUpdateSuccess = orderService.updateOrder(orderUpdate);
        Orders justUpdate = orderService.findById(id);
        assertEquals(2, justUpdate.getEmployeeId());
        assertEquals(2, justUpdate.getCustomerId());
        assertTrue(isUpdateSuccess);
    }

    /**
     * Hàm này test chức năng update fail cho trường hợp đã thanh toán rồi thì không thể updat
     * */
    @Test
    public void testUpdateFailForCaseBought() {
        // setup order
        Orders orders = new Orders(1, 1);

        // add order
        int id = orderService.createOrder(orders);
        // payment order
        boolean isPayment = orderDAO.updateOrder(id, 1);
        Orders orderUpdate = orderService.findById(id);
        orderUpdate.setEmployeeId(2);
        boolean isUpdateSuccess = orderService.updateOrder(orders);

        assertTrue(isPayment);
        // đã thanh toán thì không thể update đơn hàng
        assertFalse(isUpdateSuccess);
    }

    /**
     * Hàm này test chức năng xóa đơn hàng thành công khi đơn hàng chưa thanh toán
     * */
    @Test
    public void testRemoveSuccessOrder() {
        Orders orders = new Orders(1, 1);

        int id = orderService.createOrder(orders);
        boolean isRemove = orderService.removeOrder(id);

        assertTrue(isRemove);
    }

    /**
     * Hàm này test chức năng xóa đơn hàng thất bại khi đơn hàng đã được thanh toán
     * */
    @Test
    public void testRemoveOrderFail() {
        // setup order
        Orders orders = new Orders(1, 1);

        // add order
        int id = orderService.createOrder(orders);
        // payment order
        boolean isPayment = orderDAO.updateOrder(id, 1);
        // remove order
        boolean isRemove = orderService.removeOrder(id);

        assertTrue(isPayment);
        assertFalse(isRemove);
    }

    @Test
    public void testAddProductToOrder() {
        // setup order
        Orders orders = new Orders(1, 1);

        int orderId = orderService.createOrder(orders);
        Product product = productService.findById(2);
        assertNotNull(product);
        int quantityBefore = product.getQuantity();
        OrderDetail orderDetail = new OrderDetail(product.getProductId(), orderId, 1, product.getUnitPrice());
        int idDetail  = orderDetailService.createOrderDetail(orderDetail);
        Orders ordersAfter = orderService.findById(orderId);
        product = productService.findById(2);
        int quantityAfter = product.getQuantity();

        // tạo thành công
        assertNotEquals(-1, idDetail);
        // số tiền đơn hàng được cập nhật
        assertEquals(50.0, ordersAfter.getTotalPrice(), 0);
        // số lượng sau thêm phải giảm xuống
        assertEquals(quantityBefore - 1, quantityAfter);
    }

    @Test
    public void testRemoveOrderDetail() {
        // setup order
        Orders orders = new Orders(1, 1);

        int orderId = orderService.createOrder(orders);
        Product product = productService.findById(2);
        assertNotNull(product);
        int quantityBefore = product.getQuantity();
        OrderDetail orderDetail = new OrderDetail(product.getProductId(), orderId, 3, product.getUnitPrice());
        int idDetail  = orderDetailService.createOrderDetail(orderDetail);
        Orders ordersAfter = orderService.findById(orderId);
        product = productService.findById(2);
        int quantityAfter = product.getQuantity();

        // tạo thành công
        assertNotEquals(-1, idDetail);
        // số tiền đơn hàng được cập nhật
        assertEquals(50.0, ordersAfter.getTotalPrice(), 0);
        // số lượng sau thêm phải tăng lên
        assertEquals(quantityBefore + 1, quantityAfter);
    }
}