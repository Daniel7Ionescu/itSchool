package session14_collections.challenges.frequent_purchased_items.log_purchases.services;

import session14_collections.challenges.frequent_purchased_items.log_purchases.models.ShoppingCart;
import session14_collections.challenges.frequent_purchased_items.log_purchases.models.UserLog;

import java.util.List;

public interface ShoppingCartService {

    ShoppingCart createShoppingCart();
    void randomPopulateCartWithItems(List<String> productList, ShoppingCart cart);
    void removeItemFromCart(String item, ShoppingCart cart);
    void confirmPurchase(UserLog userLog, ShoppingCart shoppingCart);
}
