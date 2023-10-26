package session14_collections.challenges.frequent_purchased_items.log_purchases.services;

import session14_collections.challenges.frequent_purchased_items.log_purchases.models.ShoppingCart;
import session14_collections.challenges.frequent_purchased_items.log_purchases.models.UserLog;

import java.util.List;
import java.util.Random;

public class ShoppingCartImpl implements ShoppingCartService {

    UserLogService userLogService;

    public ShoppingCartImpl(UserLogService userLogService){
        this.userLogService = userLogService;
    }
    @Override
    public ShoppingCart createShoppingCart() {
        return new ShoppingCart();
    }

    @Override
    public void randomPopulateCartWithItems(List<String> productList, ShoppingCart cart) {
        //will roll the number of items to be added and the items to be picked
        Random random = new Random();
        //number of items they would add to a cart
        int numberOfItems = random.nextInt(1, 6);

        while(numberOfItems > 0){
            //picking a random item from the store
            int productIndex = random.nextInt(0, productList.size());
            cart.getItemsList().add(productList.get(productIndex));
            numberOfItems--;
        }
    }

    @Override
    public void removeItemFromCart(String item, ShoppingCart cart) {
        if(cart.getItemsList().contains(item)){
            cart.getItemsList().remove(item);
        }else {
            System.out.println("Item: " + item + " not found in shopping cart.");
        }
    }

    @Override
    public void confirmPurchase(UserLog userLog, ShoppingCart shoppingCart) {
        userLogService.logPurchase(userLog, shoppingCart);
    }
}
