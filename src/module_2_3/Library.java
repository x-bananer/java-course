package module_2_3;

import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<User> users = new ArrayList<>();

    public boolean isBookAvailable(String selectedTitle) {
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            String title = book.getTitle();

            if (title.equals(selectedTitle)) {
                return true;
            }
        }
        return false;
    }

    public double getAverageBookRating() {
        if (books.size() == 0) {
            return 0;
        }
        double total = 0;

        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            total = total + book.getRating();
        }

        return total / books.size();
    }

    public Book getMostReviewedBook() {
        Book mostReviewedBook = books.get(0);

        for (int i = 1; i < books.size(); i++) {
            Book book = books.get(i);

            if (book.getReviews().size() > mostReviewedBook.getReviews().size()) {
                mostReviewedBook = book;
            }
        }

        return mostReviewedBook;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void displayBooks() {
        System.out.println("Library Catalog:");

        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            System.out.println(
                    (i + 1) + ". Title: \"" + book.getTitle() +
                    "\", Author: \"" + book.getAuthor() +
                    "\", Year: " + book.getYear()
            );
        }
    }

    public void findBooksByAuthor(String selectedAuthor) {
        System.out.println();
        System.out.println("Books by Author \"" + selectedAuthor + "\":");

        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            String author = book.getAuthor();

            if (author.equals(selectedAuthor)) {
                int year = book.getYear();
                System.out.println("Title: \"" + book.getTitle() + "\", Year: " + year);
            }
        }
    }

    public Book borrowBook(String selectedTitle, User user) {
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            String title = book.getTitle();

            if (title.equals(selectedTitle)) {
                books.remove(i);
                user.borrowBook(book);
                return book;
            }
        }
        return null;
    }

    public void returnBook(Book book, User user) {
        user.returnBook(book);
        books.add(book);
    }
}