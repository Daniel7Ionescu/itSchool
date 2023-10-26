package session15_equals_hashcode.challenges.simulate_a_cache_of_objects_8;

import java.util.HashMap;
import java.util.Map;

public class ProductCacheApp {

    public static void main(String[] args) {
        Product product1 = new Product("Shower gel", "Very bubbly");
        Product product2 = new Product("Pet food", "Tasty bits");
        Product product3 = new Product("Shower gel", "Very bubbly");
        Product product4 = new Product("Plumbus", "Very useful");
        Product product5 = new Product("Shower gel", "Very bubbly");

        Map<Product, Integer> productsCache = new HashMap<>();

        productsCache.put(product1, productsCache.getOrDefault(product1, 0) +1);
        productsCache.put(product2, productsCache.getOrDefault(product2, 0) +1);
        productsCache.put(product3, productsCache.getOrDefault(product3, 0) +1);
        productsCache.put(product4, productsCache.getOrDefault(product4, 0) +1);
        productsCache.put(product5, productsCache.getOrDefault(product5, 0) +1);

        System.out.println(productsCache);
    }
}
