package session15_equals_hashcode.challenges.no_equal_entities_7;

import java.util.HashSet;
import java.util.Set;

public class AnotherProductApp {

    public static void main(String[] args) {
        Product product1 = new Product("Soap");
        Product product2 = new Product("Soap");
        Product product3 = new Product("Soap");

        Set<Product> productSet = new HashSet<>();
        productSet.add(product1);
        productSet.add(product2);
        productSet.add(product3);

        System.out.println("Product list size: " + productSet.size());
    }
}
