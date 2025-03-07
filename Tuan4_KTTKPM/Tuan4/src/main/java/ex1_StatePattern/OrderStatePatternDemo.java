package ex1_StatePattern;

public class OrderStatePatternDemo {
    public static void main(String[] args) {
        OrderContext order = new OrderContext();
        order.processOrder(); // Mới tạo -> Đang xử lý
        order.processOrder(); // Đang xử lý -> Đã giao
        order.setState(new CancelledOrderState()); // Hủy đơn hàng
        order.processOrder(); // Xử lý trạng thái hủy
    }
}
