package module_2_3;

public class LibraryMain {

    public static void main(String[] args) {
        Book book1 = new Book(
                "Mikä liberalismia vaivaa",
                "Pontus Purokuru",
                2020
        );

        Book book2 = new Book(
                "Elämän tarkoitus",
                "Frank Martela",
                2018
        );

        Book book3 = new Book(
                "Hyvän elämän opas",
                "Päivi Kannisto",
                2019
        );

        Library library = new Library();

        // uusi lukija Ksenia
        User user1 = new User("Ksenia", 29);
        library.addUser(user1);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        // näytetään kirjaston kirjat
        library.displayBooks();

        // etsitään kirjat tietyltä kirjailijalta
        library.findBooksByAuthor("Päivi Kannisto");

        // Ksenia lainaa kirjan
        Book borrowedBook = library.borrowBook("Hyvän elämän opas", user1);
        System.out.println("\nThe book \"" + borrowedBook.getTitle() + "\" has been borrowed.\n");
        library.displayBooks();

        // tarkistetaan onko kirja saatavilla
        boolean isAvailable;

        String checkTitle1 = "Elämän tarkoitus";
        isAvailable = library.isBookAvailable(checkTitle1);

        if (isAvailable) {
            System.out.println("\nThe book \"" + checkTitle1 + "\" is available.");
        } else {
            System.out.println("\nThe book \"" + checkTitle1 + "\" is not available.");
        }

        String borrowedTitle = borrowedBook.getTitle();
        isAvailable = library.isBookAvailable(borrowedTitle);

        if (isAvailable) {
            System.out.println("\nThe book \"" + borrowedTitle + "\" is available.");
        } else {
            System.out.println("\nThe book \"" + borrowedTitle + "\" is not available.");
        }

        // näytetään Ksenian tiedot ja lainatut kirjat
        System.out.println("\nUser:");
        System.out.println("Name: " + user1.getName());
        System.out.println("Age: " + user1.getAge());

        System.out.println("Borrowed books:");
        if (user1.getBorrowedBooks().size() == 0) {
            System.out.println("No borrowed books.");
        } else {
            for (int i = 0; i < user1.getBorrowedBooks().size(); i++) {
                Book book = user1.getBorrowedBooks().get(i);
                System.out.println("\"" + book.getTitle() + "\"");
            }
        }

        // Ksenia palauttaa kirjan
        library.returnBook(borrowedBook, user1);
        System.out.println("\nThe book \"" + borrowedBook.getTitle() + "\" has been returned.\n");
        library.displayBooks();

        isAvailable = library.isBookAvailable("Hyvän elämän opas");

        if (isAvailable) {
            System.out.println("\nThe book \"Hyvän elämän opas\" is available.");
        } else {
            System.out.println("\nThe book \"Hyvän elämän opas\" is not available.");
        }

        // lisätään arviot ja kommentit kirjoille
        book1.setRating(1.3);
        book1.addReview("I didn't understand anything :(");

        book2.setRating(4.0);
        book2.addReview("Very motivating.");

        book3.setRating(4.9);
        book3.addReview("Easy to read.");
        book3.addReview("Good introduction.");

        // lasketaan keskiarvo ja suosituin kirja
        double averageBookRating = library.getAverageBookRating();
        System.out.printf("\nAverage book rating: %.2f%n", averageBookRating);

        Book mostReviewedBook = library.getMostReviewedBook();

        if (mostReviewedBook != null) {
            String title = mostReviewedBook.getTitle();
            int reviewsCount = mostReviewedBook.getReviews().size();

            System.out.println("Most reviewed book: \"" + title +  "\" with " + reviewsCount + " reviews.");
        }
    }
}
