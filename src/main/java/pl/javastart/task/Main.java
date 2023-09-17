package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Category category1 = new Category("wyroby cukiernicze", "ciastka z nadzieniem");
        Category category2 = new Category("wyroby cukiernicze", "ciasta");

        Product product1 = new Product("Delicje", 10.00,
                "okrągłe ciastka z galaretką", category1);
        Product product2 = new Product("Rurka z kremem", 25.00,
                "podłużne ciastka z kremem", category1);
        Product product3 = new Product("Sernik", 50.0, "Ciasto z serem", category2);
        Product product4 = new Product("Galaretki", 45.0,
                "Cukierki z galaretką", null);

        SpecialOffer specialOffer = new SpecialOffer(product1, "oferta weekendowa",
                "Sobota-Niedziela", 20);

        product1.showInfo();
        product2.showInfo();
        product3.showInfo();
        product4.showInfo4();

        System.out.println(specialOffer.description + " " + specialOffer.validityPeriod
                + ": " + product1.name + " "
                + specialOffer.getDiscount(product1.price) + "zł");
    }
}
