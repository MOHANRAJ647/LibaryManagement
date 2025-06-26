package books;

import java.util.*;

public class Library {
    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void issueBook(String title, User user) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title) && !book.isIssued()) {
                book.issue();
                System.out.println(user.getName() + " has issued: " + title);
                return;
            }
        }
        System.out.println("Book not available or already issued.");
    }

    public void returnBook(String title, User user) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title) && book.isIssued()) {
                book.returned();
                System.out.println(user.getName() + " has returned: " + title);
                return;
            }
        }
        System.out.println("Book not found or not issued.");
    }

    public void displayBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }
}

