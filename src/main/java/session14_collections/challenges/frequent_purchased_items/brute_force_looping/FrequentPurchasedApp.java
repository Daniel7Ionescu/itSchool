package session14_collections.challenges.frequent_purchased_items.brute_force_looping;

import java.util.*;

import static session14_collections.challenges.frequent_purchased_items.brute_force_looping.CartHelper.*;

public class FrequentPurchasedApp {

    public static void main(String[] args) {
        String[] shopProducts = {"Soap", "Fruits", "Pet Food", "Meat Products", "Sweets", "Sports Wear", "Plumbus"};
        List<String> cart1 = createShoppingCartV1(shopProducts);
        List<String> cart2 = createShoppingCartV1(shopProducts);
        List<String> cart3 = createShoppingCartV1(shopProducts);

        System.out.println("Shopping cart1: " + cart1);
        System.out.println("Shopping cart2: " + cart2);
        System.out.println("Shopping cart3: " + cart3);

        List<List<String>> carts = new ArrayList<>();
        carts.add(cart1);
        carts.add(cart2);
        carts.add(cart3);

        Map<String, Integer> frequentPurchases = getFrequentKProducts(carts, 3);
        System.out.println("Frequent purchases: " + frequentPurchases);
    }
}
