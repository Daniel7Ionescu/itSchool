package session14_collections.challenges.frequent_purchased_items.brute_force_looping;

import java.util.*;

public class CartHelper {

    protected static Map<String, Integer> getFrequentKProducts(List<List<String>> carts, int k){
        Map<String, Integer> result = new HashMap<>();

        //look in the list of carts
        for(List<String> cart : carts){
            //look in each cart
            for(String item : cart){
                //put the item, if no value exists, it will be 0, + 1
                result.put(item, result.getOrDefault(item, 0) + 1);
            }
        }
        //sorting in descending order using a list
        List<Map.Entry<String, Integer>> resultList = new ArrayList<>(result.entrySet());
        resultList.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
//        System.out.println("Result list:");
//        System.out.println(resultList);

        //at this point all the items, from all the carts are in the list
        //keeping the elements in order with a linkedHashMap
        //using a sublist with the limit of k
        Map<String, Integer> resultToLimit= new LinkedHashMap<>();
        //k might be greater than the size of our list
        for(Map.Entry<String, Integer> entry : resultList.subList(0, k > resultList.size() ? resultList.size() : k)){
            resultToLimit.put(entry.getKey(), entry.getValue());
        }
        return resultToLimit;
    }

    protected static List<String> createShoppingCartV1(String[] productList){
        //will return a cart and will roll the number of items to be added and the items to be picked
        List<String> cart = new ArrayList<>();
        Random random = new Random();
        //number of items they would add to a cart
        int numberOfItems = random.nextInt(1, 6);

        while(numberOfItems > 0){
            //picking a random item from the store
            int productIndex = random.nextInt(0, productList.length);
            cart.add(productList[productIndex]);
            numberOfItems--;
        }
        return cart;
    }
}
