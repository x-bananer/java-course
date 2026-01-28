package module_3_3.library;

import module_3_3.library.model.Book;
import module_3_3.library.model.LibraryMember;
import module_3_3.library.system.Library;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("In search of Schrodinger's cat", "John Gribbin", "9780553342536");
        Book book2 = new Book("Kvanttikilpajuoksu", "Tommi Tenkanen", "9789520470494");

        LibraryMember member1 = new LibraryMember("Ksenia", 1);

        library.addBook(book1);
        library.addBook(book2);

        library.addMember(member1);

        library.reserveBook(member1, book1);
        library.reserveBook(member1, book2);
        library.displayReservedBooks(member1);

        library.cancelReservation(member1, book1);
        library.displayReservedBooks(member1);
    }
}
