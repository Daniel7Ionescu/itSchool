package session14_collections.challenges.frequent_purchased_items.log_purchases.models;

import java.util.HashMap;
import java.util.Map;

public class UserLog {

    private String userID;
    private Map<String, Integer> favItems;

    public UserLog(){
        userID = "testUser01";
        favItems = new HashMap<>();
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public Map<String, Integer> getFavItems() {
        return favItems;
    }

    public void setFavItems(Map<String, Integer> favItems) {
        this.favItems = favItems;
    }
}
