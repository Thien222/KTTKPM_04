package ex3_DecoratorPattern;

public class DiscountDecorator extends PaymentDecorator {
    public DiscountDecorator(Payment wrappedPayment) {
        super(wrappedPayment);
    }

    @Override
    public void pay(double amount) {
        double discount = amount * 0.1; // Giảm giá 10%
        System.out.println("Áp dụng mã giảm giá: " + discount);
        super.pay(amount - discount);
    }
}
