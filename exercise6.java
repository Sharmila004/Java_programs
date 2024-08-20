// You have to implement a library using Java Class "Library"

// Methods: addBook, issueBook, returnBook, showAvailableBooks
// Properties: Array to store the available books,
// Array to store the issued books
import java.util.Scanner;

class Library {

    String[] books;
    int no_of_books;

    Library() {
        this.books = new String[100];
        this.no_of_books = 0;
    }

    void addBook(String book) {
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println(book + " has been added!");
    }

    void showAvailableBooks() {
        System.out.println("Available Books are:");
        for (String book : this.books) {
            if (book == null) {
                continue;
            }
            System.out.println("* " + book);
        }
    }

    void issueBook(String book) {
        for (int i = 0; i < this.books.length; i++) {
            if (this.books[i] != null && this.books[i].equals(book)) {
                System.out.println("The book " + book + " has been issued!");
                this.books[i] = null;
                return;
            }
        }
        System.out.println("This book does not exist");
    }

    void returnBook(String book) {
        addBook(book);
    }

}

public class exercise6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Library lib = new Library();

        System.out.println("Enter the number of books you want to add: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter the name of book " + i + ":");
            String bookName = sc.nextLine();
            lib.addBook(bookName);
        }

        lib.showAvailableBooks();

        System.out.println("Enter the name of the book to issue:");
        String issueBook = sc.nextLine();
        lib.issueBook(issueBook);

        lib.showAvailableBooks();

        System.out.println("Enter the name of the book to return:");
        String returnBook = sc.nextLine();
        lib.returnBook(returnBook);

        lib.showAvailableBooks();
    }
}
