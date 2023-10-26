package session14_collections.challenges.frequent_purchased_items.log_purchases;

import session14_collections.challenges.frequent_purchased_items.log_purchases.models.ShoppingCart;
import session14_collections.challenges.frequent_purchased_items.log_purchases.models.UserLog;
import session14_collections.challenges.frequent_purchased_items.log_purchases.services.ShoppingCartService;
import session14_collections.challenges.frequent_purchased_items.log_purchases.services.ShoppingCartImpl;
import session14_collections.challenges.frequent_purchased_items.log_purchases.services.UserLogService;
import session14_collections.challenges.frequent_purchased_items.log_purchases.services.UserLogServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class FreqPurchasesApp {

    public static void main(String[] args) {
        UserLogService userLogService = new UserLogServiceImpl();
        UserLog userLog = userLogService.createUserLog();
        ShoppingCartService shoppingCartService = new ShoppingCartImpl(userLogService);

        List<String> itemsInStore = new ArrayList<>(List.of("Pet Food", "Sweets", "Sports Wear", "Plumbus", "Snacks", "Meat Products"));
        //3 empty shopping carts
        ShoppingCart shoppingCart1 = shoppingCartService.createShoppingCart();
        ShoppingCart shoppingCart2 = shoppingCartService.createShoppingCart();
        ShoppingCart shoppingCart3 = shoppingCartService.createShoppingCart();

        //randomly adding items to each cart
        shoppingCartService.randomPopulateCartWithItems(itemsInStore, shoppingCart1);
        shoppingCartService.randomPopulateCartWithItems(itemsInStore, shoppingCart2);
        shoppingCartService.randomPopulateCartWithItems(itemsInStore, shoppingCart3);

        //confirming the purchase and logging the items in the cart
        shoppingCartService.confirmPurchase(userLog, shoppingCart1);
        shoppingCartService.confirmPurchase(userLog, shoppingCart2);
        shoppingCartService.confirmPurchase(userLog, shoppingCart3);

        System.out.println("Items in cart1: " + shoppingCart1.getItemsList());
        System.out.println("Items in cart2: " +shoppingCart2.getItemsList());
        System.out.println("Items in cart3: " +shoppingCart3.getItemsList());

//
        System.out.println("Full purchase log of user: " + userLog.getFavItems());
        System.out.println("User fav items: ");
        System.out.println(userLogService.getFrequentPurchases(userLog, 3));
    }
}
