package ex2_StrategyPattern;
public class TaxCalculationDemo {
    public static void main(String[] args) {
        Product laptop = new Product("Laptop", 1000, new VATTax());
        laptop.displayPrice();

        Product diamond = new Product("Kim cương", 5000, new LuxuryTax());
        diamond.displayPrice();

        Product book = new Product("Sách", 200, new NoTax());
        book.displayPrice();
    }
}
