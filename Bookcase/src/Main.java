import java.util.*;

public class Main {
    public static void main(String[] args) {

        Set<Book> booksByTitle = new TreeSet<>();
        booksByTitle.add(new Book("The Catcher in the Rye", "J.D. Salinger", 277, new GregorianCalendar(1951, Calendar.JULY, 16).getTime()));
        booksByTitle.add(new Book("Brave New World", "Aldous Huxley", 311, new GregorianCalendar(1932, Calendar.AUGUST, 30).getTime()));
        booksByTitle.add(new Book("Fahrenheit 451", "Ray Bradbury", 249, new GregorianCalendar(1953, Calendar.OCTOBER, 19).getTime()));
        booksByTitle.add(new Book("The Hobbit", "J.R.R. Tolkien", 310, new GregorianCalendar(1937, Calendar.SEPTEMBER, 21).getTime()));
        booksByTitle.add(new Book("The Odyssey", "Homer", 384, new GregorianCalendar(-800, Calendar.JANUARY, 1).getTime()));

        System.out.println("Books sorted by title: ");
        for (Book book: booksByTitle ){
            System.out.println(book);
        }

        Set<Book> booksByPageCount = new TreeSet<>(Comparator.comparingInt(Book::getPageCount));
        booksByPageCount.addAll(booksByTitle);

        System.out.println("\nBooks sorted by page count: ");
        for (Book book: booksByPageCount){
            System.out.println(book);
        }

        Set<Book> booksByAuthor = new TreeSet<>(Comparator.comparing(Book::getAuthor));
        booksByAuthor.addAll(booksByTitle);

        System.out.println("\nBooks sorted by author: ");

        for (Book book: booksByAuthor){
            System.out.println(book);
        }

        Set<Book> booksPublicationDate = new TreeSet<>(Comparator.comparing(Book::getPublicationDate));
        booksPublicationDate.addAll(booksByTitle);

        System.out.println("\nBooks sorted by publication date: ");

        for (Book book:booksPublicationDate){
            System.out.println(book);
        }



    }
}