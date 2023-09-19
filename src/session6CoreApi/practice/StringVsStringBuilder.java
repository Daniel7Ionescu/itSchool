package session6CoreApi.practice;

public class StringVsStringBuilder {

    public static void main(String[] args) {
        //Using String
        String str = "";
        for (int index = 0; index < 10; index++) {
            str += "word" + index + " ";
        }
        System.out.println(str);

        //Using StringBuilder
        StringBuilder stringBuilder = new StringBuilder();
        for (int index = 0; index < 10; index++) {
            stringBuilder.append("word").append(index).append(" ");
        }

        System.out.println(stringBuilder);
    }
}
