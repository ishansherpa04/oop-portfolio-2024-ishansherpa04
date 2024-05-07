package Book;

public class Book {
    private String title;
    private String author;
    private String publisher;
    private int copyrightDate;

    // Constructor
    public Book(String title, String author, String publisher, int copyrightDate) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.copyrightDate = copyrightDate;
    }

    // Getter and setter methods for title
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // Getter and setter methods for author
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    // Getter and setter methods for publisher
    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    // Getter and setter methods for copyrightDate
    public int getCopyrightDate() {
        return copyrightDate;
    }

    public void setCopyrightDate(int copyrightDate) {
        this.copyrightDate = copyrightDate;
    }

    // toString method to return a nicely formatted, multiline description of the book
    @Override
    public String toString() {
        return "Title: " + title + "\nAuthor: " + author + "\nPublisher: " + publisher + "\nCopyright Date: " + copyrightDate;
    }
}
