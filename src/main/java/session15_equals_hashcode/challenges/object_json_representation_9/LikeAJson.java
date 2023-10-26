package session15_equals_hashcode.challenges.object_json_representation_9;

public class LikeAJson {

    public static <E> void printObjectLikeAJson(E object){
//        System.out.println(object.toString().split(" ")[0]);
        StringBuilder result = new StringBuilder();
        String[] objString = object.toString().split(" ");

        for(int index = 0; index < objString.length - 1; index++){
            result.append(objString[index]).append(" : " ).append(objString[index + 1]).append("\n");
            if(index + 1 < objString.length - 1) index++;
        }
        System.out.println(result.toString());
    }
}
