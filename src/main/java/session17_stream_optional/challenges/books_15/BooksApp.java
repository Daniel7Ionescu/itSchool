package session17_stream_optional.challenges.books_15;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static session17_stream_optional.challenges.books_15.MapBooksByAuthor.*;

public class BooksApp {

    public static void main(String[] args) {

        List<Book> bookList = Arrays.asList(
                new Book("Return of the King", "J. R. R. Tolkien", 1955),
                new Book("Matilda", "Roald Dahl", 1988),
                new Book("The Fellowship of the Ring", "J. R. R. Tolkien", 1954),
                new Book("The Blade Itself", "Joe Abercrombie", 2006));

        Map<String, List<Book>> authorBooksMap = filterBooksByYearAndArrangeByAuthor(bookList, 2000);
        System.out.println(authorBooksMap);
    }


}
