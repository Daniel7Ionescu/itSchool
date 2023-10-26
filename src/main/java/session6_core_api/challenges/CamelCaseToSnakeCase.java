package session6_core_api.challenges;

public class CamelCaseToSnakeCase {

    public static void main(String[] args) {
        String camel = "camelGoesMoo";
        System.out.println("Camel case: " + camel + " as snake: " + camelToSnake(camel));
    }

    private static String camelToSnake(String str) {
        StringBuilder snakeStr = new StringBuilder();

        for (int index = 0; index < str.length(); index++) {
            if (Character.isUpperCase(str.charAt(index))) {
                snakeStr.append(("_" + Character.toLowerCase(str.charAt(index))));
                continue;
            }
            snakeStr.append(str.charAt(index));
        }
        return snakeStr.toString();
    }
}