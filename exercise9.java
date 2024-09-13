// create a library managemnet system that is capable of issuing books to the students. 
// every book should have infor like:
// * book name
// * book author
// * issued to
// * issued on
// users should be able to:
// * add books
// * issue books 
// * return issued books
// assume that all the users are registered with their names in tthe central database.

import java.util.ArrayList;

class Book {

    public String name;
    public String author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" + "name='" + name + '\'' + ", author='" + author + '\'' + '}';
    }
}

class MyLibrary {

    public ArrayList<Book> books;

    public MyLibrary(ArrayList<Book> books) {
        this.books = books;
    }

    public void addBook(Book book) {
        System.out.println("book added");
        this.books.add(book);
    }

    public void issueBook(Book book, String issued_to) {
        System.out.println("book issued to: " + issued_to);
        this.books.remove(book);
    }

    public void returnBook(Book book) {
        System.out.println("book returned");
        this.books.add(book);
    }

}

public class exercise9 {

    public static void main(String[] args) {
        ArrayList<Book> bk = new ArrayList<>();
        Book b1 = new Book("book1", "me1");
        bk.add(b1);

        Book b2 = new Book("book2", "me2");
        bk.add(b2);

        Book b3 = new Book("book3", "me3");
        bk.add(b3);

        Book b4 = new Book("book4", "me4");
        bk.add(b4);
        MyLibrary lib = new MyLibrary(bk);
        lib.addBook(new Book("book5", "me5"));
        System.out.println(lib.books);
        lib.issueBook(b3, "justme");
        System.out.println(lib.books);
        lib.returnBook(b3);
        System.out.println(lib.books);

    }
}
