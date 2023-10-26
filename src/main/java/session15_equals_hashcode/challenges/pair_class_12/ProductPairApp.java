package session15_equals_hashcode.challenges.pair_class_12;

public class ProductPairApp {

    public static void main(String[] args) {
        ProductPair productPair1 = new ProductPair<>("Baloons", 12);
        System.out.println(productPair1);
        System.out.println("product1 key: " + productPair1.getKey());
        System.out.println("product1 value: " + productPair1.getValue());
    }
}
