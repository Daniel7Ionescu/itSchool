package session14_collections.challenges.frequent_purchased_items.log_purchases.services;

import session14_collections.challenges.frequent_purchased_items.log_purchases.models.ShoppingCart;
import session14_collections.challenges.frequent_purchased_items.log_purchases.models.UserLog;

import java.util.Map;

public interface UserLogService {

    UserLog createUserLog();
    void logPurchase(UserLog userLog, ShoppingCart shoppingCart);
    Map<String, Integer> getFrequentPurchases(UserLog userLog, int numOfProducts);
}
