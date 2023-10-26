package session14_collections.challenges.frequent_purchased_items.log_purchases.services;

import session14_collections.challenges.frequent_purchased_items.log_purchases.models.ShoppingCart;
import session14_collections.challenges.frequent_purchased_items.log_purchases.models.UserLog;

import java.util.*;

public class UserLogServiceImpl implements UserLogService{

    @Override
    public UserLog createUserLog() {
        return new UserLog();
    }

    @Override
    public void logPurchase(UserLog userLog, ShoppingCart shoppingCart) {
        List<String> itemsInCart = new ArrayList<>(shoppingCart.getItemsList());
        for(String item : itemsInCart){
            userLog.getFavItems().put(item, userLog.getFavItems().getOrDefault(item, 0) + 1);
        }
    }

    @Override
    public Map<String, Integer> getFrequentPurchases(UserLog userLog, int numOfProducts) {
        //get a list of all user purchases
        List<Map.Entry<String, Integer>> userPurchaseLog = new ArrayList<>(userLog.getFavItems().entrySet());
        //sort the list
        userPurchaseLog.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        //add in a linked hash map, so they keep the order, items up to a limit - numOfProducts
        Map<String, Integer> userFavItems= new LinkedHashMap<>();
        for(Map.Entry<String, Integer> entry : userPurchaseLog.subList(
                0, numOfProducts > userPurchaseLog.size() ? userPurchaseLog.size() : numOfProducts)){
            userFavItems.put(entry.getKey(), entry.getValue());
        }

        return userFavItems;
    }
}
