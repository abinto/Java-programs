import java.util.Scanner;

public class Book {

    private int bookId;
    private String title;
    private String author;

    public void setBook() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Book ID: ");
        bookId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Title: ");
        title = sc.nextLine();

        System.out.print("Enter Author: ");
        author = sc.nextLine();
    }

    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}

public class BookUtility {

    public static void displayBook(Book b) {

        System.out.println("Book ID : " + b.getBookId());
        System.out.println("Title : " + b.getTitle());
        System.out.println("Author : " + b.getAuthor());
        System.out.println();
    }
}
public class Main {

    public static void main(String[] args) {

        Book book1 = new Book();
        Book book2 = new Book();

        System.out.println("Enter Details of Book 1");
        book1.setBook();

        System.out.println();

        System.out.println("Enter Details of Book 2");
        book2.setBook();

        System.out.println();

        System.out.println("Book Details");

        BookUtility.displayBook(book1);
        BookUtility.displayBook(book2);
    }
}