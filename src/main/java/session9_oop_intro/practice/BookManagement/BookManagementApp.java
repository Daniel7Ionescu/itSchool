package session9_oop_intro.practice.BookManagement;

public class BookManagementApp {

    public static void main(String[] args) {
        Author authorAlice = new Author("Alice");
        Book book1 = new Book("Smart book", authorAlice);

        System.out.println("Book title: " + book1.getTitle());
        System.out.println("Book author: " + book1.getAuthorName());
    }
}
