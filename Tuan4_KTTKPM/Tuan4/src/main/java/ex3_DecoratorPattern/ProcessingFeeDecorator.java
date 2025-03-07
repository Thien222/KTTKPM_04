package ex3_DecoratorPattern;

public class ProcessingFeeDecorator extends PaymentDecorator {
    public ProcessingFeeDecorator(Payment wrappedPayment) {
        super(wrappedPayment);
    }

    @Override
    public void pay(double amount) {
        double fee = amount * 0.02; // Phí xử lý 2%
        System.out.println("Thêm phí xử lý: " + fee);
        super.pay(amount + fee);
    }
}
