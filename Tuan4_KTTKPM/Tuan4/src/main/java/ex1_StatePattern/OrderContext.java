package ex1_StatePattern;

public class OrderContext {
    private OrderState state;

    public OrderContext() {
        this.state = new NewOrderState(); // Mặc định bắt đầu với trạng thái Mới tạo
    }

    public void setState(OrderState state) {
        this.state = state;
    }

    public void processOrder() {
        state.handleOrder(this);
    }
}
