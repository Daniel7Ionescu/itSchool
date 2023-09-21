package session6CoreApi;

public class BalancedParethesisChecker {

    public static void main(String[] args) {
        String str = "a{abc[xyz(hello)...]?}2";
        System.out.println(isParenthesisBalanced(str));

        //maybe for an ASCII solution?
//        System.out.println("{ " + (int)'{' + " - " + (int)'}' + " }");
//        System.out.println("[ " + (int)'[' + " - " + (int)']' + " ]");
//        System.out.println("( " + (int)'(' + " - " + (int)')' + " )");
    }

    private static boolean isParenthesisBalanced(String input){
        StringBuilder holder = new StringBuilder();

        //adding opening brackets to holder
        for(int index = 0; index < input.length(); index++){
            //check if char is opening bracket
            if(input.charAt(index) == '{' || input.charAt(index) == '[' || input.charAt(index) == '('){
                holder.append(input.charAt(index));
            }

            //check if char is closing bracket and matches last element in holder
            if(input.charAt(index) == '}' && holder.charAt(holder.length() - 1) == '{'){
                holder.deleteCharAt(holder.length() - 1);
            }
            else if(input.charAt(index) == ']' && holder.charAt(holder.length() - 1) == '['){
                holder.deleteCharAt(holder.length() - 1);
            }
            else if(input.charAt(index) == ')' && holder.charAt(holder.length() - 1) == '('){
                holder.deleteCharAt(holder.length() - 1);
            }
        }
        //check what i have in holder
        System.out.println(holder.toString());
        return holder.isEmpty();
    }
}
