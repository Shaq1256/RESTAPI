package kodilla.averageDegree;

import java.util.LinkedList;
import java.util.List;

public class BookLibrary {
    public BookLibrary() {
        List<Book> library = new LinkedList<>();

        library.add(new Book("Marketplace", 2004));
        library.add(new Book("Database", 2011));
        library.add(new Book("Hibernate", 2009));
        library.add(new Book("Spring in action", 2018));
        library.add(new Book("Thinking in Java", 1998));

        for (Book book : library) {
            if(book.yearOfPublication > 2000) {
                System.out.println(book);
            }
        }
    }
}
