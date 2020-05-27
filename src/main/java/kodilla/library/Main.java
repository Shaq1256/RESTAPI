package kodilla.library;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Thinking in Java", "Bruce Eckel", 2018, 5, 10);
        Book book2 = new Book("Matrix", "Neo", 2011, 2, 19);
        Book book3 = new Book("Potop", "Henryk Sienkiewicz", 2014, 10, 22);
        Book book4 = new Book("Sensacje XX wieku", "Boguslaw Woloszanski", 2011, 9, 30);
        Book book5 = new Book("Rusz glowa - Python", "Barry Jones", 2020, 1, 10);

        HashSet<Book> library = new HashSet<Book>();

        library.add(book1);
        library.add(book2);
        library.add(book3);
        library.add(book4);
        library.add(book5);

        for (Book theBook : library) {
            if (theBook.publishedDate.getYear() >= 2015) {
                System.out.println(theBook);
            }
        }
    }
}
