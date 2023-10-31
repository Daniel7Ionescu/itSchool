package session17_stream_optional.challenges.highest_average_product_category_price_14;

import session17_stream_optional.challenges.best_paying_department_12.Department;
import session17_stream_optional.challenges.best_paying_department_12.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class HighestAverageCategoryPrice {

    public static void main(String[] args) {
        //Given a list of products with attributes: name, category, and price;
        // find the category with the highest average price
        Product productSparkle = new Product("Fresh Sparkles", "Drinks", 7.50);
        Product productPurpleDrink = new Product("Purple Drink", "Drinks", 9.50);
        Product productFancyTapWater = new Product("Fancy Tap Water", "Fun", 12.50);
        Product productTheDragon = new Product("The Dragon", "Fun", 25.49);
//        Product productMidnightDanger = new Product("Midnight Danger", Category.BIG_TOYS, 49.50);
//        Product productSnackAttack = new Product("Snack Attack", Category.FOOD, 3.79);
//        Product productNotRoundPizza = new Product("Not Round Pizza", Category.FOOD, 14.50);

        List<Product> productList = Arrays.asList(productSparkle, productPurpleDrink, productTheDragon,
                 productFancyTapWater);

        //to do: break this awful thing in more variables/methods?
        String categoryListMap = productList.stream()
                //list to map <Categories, List<Product>>
                .collect(Collectors.groupingBy(Product::getCategory, Collectors.averagingDouble(Product::getPrice)))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse("NO prod");
        // to map <Category, Double> average as double
//                        .collect(Collectors.toMap(element -> element.getKey(),
//                                                  element -> element.getValue().stream()
//                                                          .mapToDouble(product -> product.getPrice())
//                                                          .average()
//                                                          //<Category, Double>
//                                                          .getAsDouble()))
//                                                                //stream in the resulting map
//                                                                .entrySet().stream()
//                                                                //compare each entry by value and get the max
//                                                                .max(Map.Entry.comparingByValue())
//                                                                //map data to string
//                                                                .map(element -> element.getKey() + " : " + element.getValue())
//                                                                .toString();
        System.out.println(categoryListMap);

    }
}
