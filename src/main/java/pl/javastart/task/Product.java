package pl.javastart.task;

public class Product {
    String name;
    double price;
    String description;
    Category category;

    public Product(String name, double price, String description, Category category) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
    }

    void showInfo() {
        System.out.println("Produkt: " + category.description + " , " + category.name
                + " , " + name + " , " + description + ", cena: " + price + "zł");
    }

    void showInfo4() {
        System.out.println("Produkt: " + name + " , " + description + ", cena: " + price + "zł");
    }
}
