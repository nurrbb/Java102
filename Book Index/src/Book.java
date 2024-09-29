import java.time.Year;

public class Book {

    private String title;
    private String author;
    private int pageCount;
    private Year publicationYear;

    public Book(String title,String author, int pageCount, int publicationYear)
    {
        this.title =title;
        this.author = author;
        this.pageCount = pageCount;
        this.publicationYear = Year.of(publicationYear);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public Year getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(Year publicationYear) {
        this.publicationYear = publicationYear;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", pageCount=" + pageCount +
                ", publicationYear=" + publicationYear +
                '}';
    }
}
