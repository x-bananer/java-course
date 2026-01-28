package module_3_3.library.system;

import module_3_3.library.model.Book;
import module_3_3.library.model.LibraryMember;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<LibraryMember> members;

    public Library() {
        books = new ArrayList<>();
        members = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void addMember(LibraryMember member) {
        members.add(member);
    }

    public void borrowBook(LibraryMember member, Book book) {
        if (!book.isBorrowed()) {
            book.setBorrowed(true);
            member.getBorrowedBooks().add(book);
        }
    }

    public void returnBook(LibraryMember member, Book book) {
        if (member.getBorrowedBooks().contains(book)) {
            book.setBorrowed(false);
            member.getBorrowedBooks().remove(book);
        }
    }

    public void reserveBook(LibraryMember member, Book book) {
        if (!book.isReserved()) {
            book.setReserved(true);
            member.addReservedBook(book);
            System.out.println("Book reserved: " + book.getTitle());
        } else {
            System.out.println("Book already reserved: " + book.getTitle());
        }
    }

    public void cancelReservation(LibraryMember member, Book book) {
        if (book.isReserved() && member.hasReservedBook(book)) {
            book.setReserved(false);
            member.removeReservedBook(book);
            System.out.println("Reservation cancelled: " + book.getTitle());
        }
    }

    public void displayReservedBooks(LibraryMember member) {
        System.out.println("Reserved books for " + member.getName() + ":");
        for (Book book : member.getReservedBooks()) {
            System.out.println(book.getTitle());
        }
    }
}
