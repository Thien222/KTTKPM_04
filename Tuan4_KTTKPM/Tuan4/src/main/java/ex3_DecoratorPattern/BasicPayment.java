package ex3_DecoratorPattern;

public class BasicPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Thanh toán số tiền: " + amount);
    }
}

