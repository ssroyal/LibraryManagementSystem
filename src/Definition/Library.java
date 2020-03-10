package Definition;

import Adt.LibraryAdt;

import java.util.Scanner;

public class Library implements LibraryAdt {
    private int totalBooks;
    private int issuedBooks;
    private MyList<Book> stock;

    @Override
    public int issueBook(Book book, Student student) {
        return 0;
    }

    @Override
    public void returnBook(Student student, Book book) {
    }

    @Override
    public int addBook() {
        char type = selectBookType();
        switch (type) {
            case '1':
        }
        return 0;
    }

    @Override
    public Book discardBook() {
        return null;
    }

    private static char selectBookType() {
        Scanner sc = new Scanner(System.in);
        String response;
        char res;
        while (true) {
            System.out.println("Enter the type of Book");
            System.out.println("1. Academic");
            System.out.println("2. Other");
            System.out.println("0.Exit");
            response = sc.next();
            res = response.charAt(0);
            if (response.length() == 1 && res == '1' || res == '2' || res == '0') {
                break;
            } else {
                System.out.println("Enter a valid input");
            }
        }
        sc.close();
        System.out.println(res);

        return res;

    }

    private static SubjectBook enterSubBookDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter book details:-");
        System.out.println("Enter The Subject of the book");
        String subName = sc.next();
        System.out.println("Enter the name of the book");
        String name = sc.next();
        System.out.println("Enter the author of the book");
        String author = sc.next();
        System.out.println("Enter the Book Edition");
        int Edition = sc.nextInt();
        System.out.println("Enter the Book ID");
        int bookId = sc.nextInt();
        System.out.println("Enter the number of copies to be added");
        int noOfCopies = sc.nextInt();
        SubjectBook newSubBook = new SubjectBook(name, author, noOfCopies, bookId, subName, Edition);
        return newSubBook;


    }
}