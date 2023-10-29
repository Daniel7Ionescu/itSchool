package session17_stream_optional.challenges.stream_text_file_11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Comparator;

public class MethodHelper {

    static String getLongestWordFromText(Path textPath) throws IOException {
            return Files.lines(textPath)
                    .flatMap(line -> Arrays.stream(line.split(" ")))
                    .max(Comparator.comparing(String::length))
                    .orElse("Error bro");
    }

}
