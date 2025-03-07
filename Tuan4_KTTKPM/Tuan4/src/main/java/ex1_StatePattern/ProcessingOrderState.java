package ex1_StatePattern;

public class ProcessingOrderState implements OrderState {
    @Override
    public void handleOrder(OrderContext context) {
        System.out.println("Đóng gói và vận chuyển đơn hàng.");
        context.setState(new DeliveredOrderState()); // Chuyển sang trạng thái đã giao
    }
}
