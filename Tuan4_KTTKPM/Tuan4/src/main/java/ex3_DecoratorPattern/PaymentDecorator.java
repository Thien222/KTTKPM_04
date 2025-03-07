package ex3_DecoratorPattern;

public abstract class PaymentDecorator implements Payment {
    protected Payment wrappedPayment;

    public PaymentDecorator(Payment wrappedPayment) {
        this.wrappedPayment = wrappedPayment;
    }

    @Override
    public void pay(double amount) {
        wrappedPayment.pay(amount);
    }
}
