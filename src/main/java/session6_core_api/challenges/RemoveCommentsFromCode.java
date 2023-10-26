package session6_core_api.challenges;

public class RemoveCommentsFromCode {

    public static void main(String[] args) {
        //need to refactor checking for /* */
        String code1 = "//Test" +
                "\npublic class Comments {" +
                "\n/* Comment */" +
                "\npublic static void main(String[] args) {" +
                "\nint num = 2; //comment after code" +
                "\n/* comment line 1" +
                "\ncomment line2 */" +
                "\n }" +
                "\n}";

        System.out.println(commentsBGone(code1));
    }

    private static String commentsBGone(String input) {
        StringBuilder cleanStr = new StringBuilder();
        boolean flag = true;
        String[] inputArr = input.split("\n");

        for (String line : inputArr) {

            for (int index = 0; index < line.length(); index++) {
                //check for // at start of line
                if (line.charAt(0) == '/' && line.charAt(1) == '/') {
                    continue;
                }
                //check for // after some code
                if (index + 1 < line.length() - 1) {
                    if (line.charAt(index) == '/' && line.charAt(index + 1) == '/') {
                        break;
                    }
                }
                //check for /*
                if (index + 1 < line.length()) {
                    //at start of line
                    if (line.charAt(0) == '/' && line.charAt(1) == '*') {
                        flag = false;
//                        break;
                    }
                    //at end of line
                    if (line.charAt(index) == '*' && line.charAt(index + 1) == '/') {
                        flag = true;
                        index++;
                        continue;
                    }
                }

                if (flag) {
                    cleanStr.append(line.charAt(index));
                }
            }
            cleanStr.append("\n");
        }
        return cleanStr.toString();
    }
}