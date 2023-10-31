package session17_stream_optional.challenges.books_15;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapBooksByAuthor {

    static Map<String, List<Book>> filterBooksByYearAndArrangeByAuthor(List<Book> bookList, int maxYear) {
        return bookList.stream()
                //filter by input year
                .filter(e -> Integer.valueOf(e.getPublishYear()) < maxYear)
                //they key of the map will be the author
                .collect(Collectors.toMap(
                        Book::getAuthor,
                        //for the value, a list of books
                        book -> {
                            List<Book> list = new ArrayList<>();
                            list.add(book);
                            return list;
                        },
                        //if the author exists in the map as key,
                        // the existing list adds the element of the list that gets created with the author
                        (existing, replacer) -> {
                            existing.add(replacer.get(0));
                            return existing;
                        }));
    }
}
