package session14_collections.challenges.frequent_purchased_items.log_purchases.models;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private String id;
    private List<String> itemsList;

    public ShoppingCart(){
        itemsList = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<String> getItemsList() {
        return itemsList;
    }

    public void setItemsList(List<String> itemsList) {
        this.itemsList = itemsList;
    }
}
