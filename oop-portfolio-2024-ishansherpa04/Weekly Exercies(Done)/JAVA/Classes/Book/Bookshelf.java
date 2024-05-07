package Book;

public class Bookshelf {
    public static void main(String[] args) {
        // Instantiating Book objects
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "Scribner", 1925);
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "J. B. Lippincott & Co.", 1960);

        // Updating the title of book1
        book1.setTitle("1984");

        // Displaying information about book1 and book2
        System.out.println("Book 1:\n" + book1 + "\n");
        System.out.println("Book 2:\n" + book2);
    }
}
