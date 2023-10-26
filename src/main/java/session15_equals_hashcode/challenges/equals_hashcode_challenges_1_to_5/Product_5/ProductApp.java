package session15_equals_hashcode.challenges.equals_hashcode_challenges_1_to_5.Product_5;

public class ProductApp {

    public static void main(String[] args) {
        Product product1 = new Product("p01", "Cool new product", 49.99);
        Product product2 = new Product("p01", "Cool new product", 49.99);

        System.out.println("product1 hashcode: " + product1.hashCode());
        System.out.println("product2 hashcode: " + product2.hashCode());
        System.out.println("product1 equals product2: " + product1.equals(product2));

        product2.setId("p02");
        System.out.println("After changing id of product2");
        System.out.println("product1 hashcode: " + product1.hashCode());
        System.out.println("product2 hashcode: " + product2.hashCode());
        System.out.println("product1 equals product2: " + product1.equals(product2));
    }
}
