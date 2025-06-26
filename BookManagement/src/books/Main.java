package books;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Add books
        library.addBook(new Book("Java Basics", "John Doe"));
        library.addBook(new Book("Spring Boot", "Jane Smith"));

        // Create user
        User user = new User("Mohan Raj", 101);

        // Display books
        System.out.println("Available Books:");
        library.displayBooks();

        // Issue a book
        library.issueBook("Java Basics", user);

        // Try to issue the same book again
        library.issueBook("Java Basics", user);

        // Return book
        library.returnBook("Java Basics", user);

        // Final display
        System.out.println("\nBooks after operations:");
        library.displayBooks();
    }
}
