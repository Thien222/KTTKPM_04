package ex1_StatePattern;

public class DeliveredOrderState implements OrderState {
    @Override
    public void handleOrder(OrderContext context) {
        System.out.println("Cập nhật trạng thái đơn hàng là đã giao.");
    }
}
