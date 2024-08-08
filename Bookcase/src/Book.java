import java.text.SimpleDateFormat;
import java.util.Date;

public class Book implements Comparable<Book> {

    private final String title;
    private final String author;
    private final int pageCount;
    private final Date publicationDate;

    public Book(String title, String author, int pageCount, Date publicationDate) {
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
        this.publicationDate = publicationDate;
    }
    @Override
    public int compareTo(Book o) {
        return this.title.compareTo(o.title);
    }
    private String getFormattedDate() {
        SimpleDateFormat formatter = new SimpleDateFormat("MM/yyyy");
        return formatter.format(publicationDate);
    }
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPageCount() {
        return pageCount;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    @Override
    public String toString() {
        return
                "Title: " + title + '\'' +
                ", Author: " + author + '\'' +
                ", Page Count: " + pageCount +
                ", Publication Date: " + getFormattedDate();
    }
}
