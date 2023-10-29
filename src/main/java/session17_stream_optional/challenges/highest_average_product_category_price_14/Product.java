package session17_stream_optional.challenges.highest_average_product_category_price_14;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {
    //name, category, and price
    private String name;
    private Category category;
    private double price;
}
