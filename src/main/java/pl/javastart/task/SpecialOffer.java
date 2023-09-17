package pl.javastart.task;

public class SpecialOffer {
    Product product;
    String description;
    String validityPeriod;
    double discount;

    public SpecialOffer(Product product, String description, String validityPeriod, double discount) {
        this.product = product;
        this.description = description;
        this.validityPeriod = validityPeriod;
        this.discount = discount;
    }

    double getDiscount(double price) {
        return price * 0.8;
    }
}
