import java.util.*;

public class Main {
    public static void main(String[] args) {

        Set<Book> booksByTitle = new TreeSet<>();
        booksByTitle.add(new Book("The Great Gatsby", "F. Scott Fitzgerald", 180, new GregorianCalendar(1925, Calendar.APRIL, 10).getTime()));
        booksByTitle.add(new Book("To Kill a Mockingbird", "Harper Lee", 281, new GregorianCalendar(1960, Calendar.JULY, 11).getTime()));
        booksByTitle.add(new Book("1984", "Harper Lee", 328, new GregorianCalendar(1949, Calendar.JUNE, 8).getTime()));
        booksByTitle.add(new Book("Moby Dick", "Herman Melville", 585, new GregorianCalendar(1851, Calendar.OCTOBER, 18).getTime()));
        booksByTitle.add(new Book("Pride and Prejudice", "Jane Austen", 279, new GregorianCalendar(1813, Calendar.JANUARY, 28).getTime()));

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




    }
}