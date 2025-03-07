package ex3_DecoratorPattern;

public class PaymentDemo {
    public static void main(String[] args) {
        Payment basicPayment = new BasicPayment();

        // Thanh toán với phí xử lý
        Payment paymentWithFee = new ProcessingFeeDecorator(basicPayment);
        paymentWithFee.pay(100);

        System.out.println("-----------------------");

        // Thanh toán với mã giảm giá
        Payment paymentWithDiscount = new DiscountDecorator(basicPayment);
        paymentWithDiscount.pay(200);

        System.out.println("-----------------------");

        // Thanh toán với cả phí xử lý và mã giảm giá
        Payment fullDecoratedPayment = new DiscountDecorator(new ProcessingFeeDecorator(basicPayment));
        fullDecoratedPayment.pay(300);
    }
}
