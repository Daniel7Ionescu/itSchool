package session17_stream_optional.challenges.books_15;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Book {

    private String title;
    private String author;
    private int publishYear;

    @Override
    public String toString() {
        return title + " by " + author + " : " + publishYear;
    }
}
