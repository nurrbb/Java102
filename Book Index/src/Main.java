import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("The Catcher in the Rye", "J.D. Salinger", 277, 1951));
        books.add(new Book("To Kill a Mockingbird", "Harper Lee", 281, 1960));
        books.add(new Book("1984", "George Orwell", 328, 1949));
        books.add(new Book("Pride and Prejudice", "Jane Austen", 432, 1813));
        books.add(new Book("The Great Gatsby", "F. Scott Fitzgerald", 180, 1925));
        books.add(new Book("Moby Dick", "Herman Melville", 585, 1851));
        books.add(new Book("War and Peace", "Leo Tolstoy", 1225, 1869));
        books.add(new Book("The Hobbit", "J.R.R. Tolkien", 310, 1937));
        books.add(new Book("Fahrenheit 451", "Ray Bradbury", 160, 1953));
        books.add(new Book("Jane Eyre", "Charlotte Brontë", 500, 1847));

        Map<String, String> bookMap = books.stream()
                .collect(Collectors.toMap(Book::getTitle, Book::getAuthor));

        System.out.println("Book Map:");
        bookMap.forEach((title, author) -> System.out.println(title + " - " + author));

        List<Book> filteredBooks = books.stream()
                .filter(book -> book.getPageCount() > 100)
                .collect(Collectors.toList());

        System.out.println("\nFiltered Books (Page Count > 100):");
        filteredBooks.forEach(System.out::println);
    }
}