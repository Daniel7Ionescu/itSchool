package session17_stream_optional.challenges.stream_text_file_11;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Comparator;

import static session17_stream_optional.challenges.stream_text_file_11.MethodHelper.*;

public class StreamTextFileApp {

    public static void main(String[] args) throws IOException {
        Path textPath = Path.of("D:\\cursJava_itSchool\\coding\\itSchoolSessions\\src\\main\\java\\session17_stream_optional\\challenges\\stream_text_file_11\\secretSquirrelFile.txt");


        //challenge 11
        String longestWord = getLongestWordFromText(textPath);
        System.out.println("The longest word is: " + longestWord);


    }

}
