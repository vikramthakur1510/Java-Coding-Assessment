class Book {
    String bookTitle;
    String author;
    boolean isAvailable;

    public Book(String title, String author) {
        this.bookTitle = title;
        this.author = author;
        this.isAvailable = true; // Initially available
    }

    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Success: You have borrowed '" + bookTitle + "'");
        } else {
            System.out.println("Error: '" + bookTitle + "' is already borrowed.");
        }
    }

    public void returnBook() {
        isAvailable = true;
        System.out.println("Success: You have returned '" + bookTitle + "'. It is now available.");
    }
}

public class LibraryTask {
    public static void main(String[] args) {
        Book myBook = new Book("Core Java Basics", "Herbert Schildt");

        // Test borrowing
        myBook.borrowBook();
        // Test borrowing again (should show error)
        myBook.borrowBook(); 
        // Test returning
        myBook.returnBook();
    }
}