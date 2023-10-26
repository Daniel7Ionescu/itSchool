package session6_core_api.practice;

public class StringMethods {

    public static void main(String[] args) {
        String name = "Jane Swallow";
        printStringLength("Cow");
        printCharAtIndex("Alice", 1);
        printStringIndexAt("Alice", "i");
        printSubstring("Hello World", 6, 11);

        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        System.out.println(name + " contains Swallow: " + name.contains("Swallow"));
        System.out.println("Replace 'e' from Hello: " + "Hello".replace('e', 'x'));

        String email = "user@gmail.com";
        String domain = email.substring(email.indexOf('@') + 1);
        System.out.println(domain);

    }

    private static void printStringLength(String string){
        System.out.println("String " + string + " has length of: " + string.length());
    }

    private static void printCharAtIndex(String string, int index){
        System.out.println("The char at index " + index + " is: " + string.charAt(index));
    }

    private static void printStringIndexAt(String string, String target){
        System.out.println("The index of target is: " + string.indexOf(target));
    }

    private static void printSubstring(String string, int startIndex, int endIndex){
        System.out.println("Substring is " + string.substring(startIndex, endIndex));
    }
}
