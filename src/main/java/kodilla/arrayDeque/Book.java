package kodilla.arrayDeque;

public class Book {
    String title;
    String author;
    Integer year;

    public Book(String title, String author, Integer year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Integer getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Book " + "title: '" + title + '\'' +
                ", author: '" + author + '\'' +
                ", year: " + year;
    }
}
