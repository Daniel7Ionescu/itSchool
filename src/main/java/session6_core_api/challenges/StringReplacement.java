package session6_core_api.challenges;

public class StringReplacement {

    public static void main(String[] args) {
        String str = "The brown cow and the blue cow are waiting for the white cow";
        System.out.println(replaceTargetWithString(str, "cow", "duck"));
    }

    private static String replaceTargetWithString(String input, String target, String newValue) {
        StringBuilder updatedString = new StringBuilder();
        String[] mainArr = input.split(" ");

        for (int index = 0; index < mainArr.length; index++) {
            if (mainArr[index].equals(target)) {
                updatedString.append(newValue + " ");
                continue;
            }
            updatedString.append(mainArr[index] + " ");
        }
        return updatedString.toString();
    }
}