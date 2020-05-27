package kodilla.library;

import java.time.LocalDate;

public class Book {
    String title;
    String author;
    LocalDate publishedDate;

    public Book(String title, String author, int yearOfPublished, int monthOfPublished, int dayOfPublished) {
        this.title = title;
        this.author = author;
        this.publishedDate = LocalDate.of(yearOfPublished, monthOfPublished, dayOfPublished);
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public LocalDate getPublishedDate() {
        return publishedDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (title != null ? !title.equals(book.title) : book.title != null) return false;
        if (author != null ? !author.equals(book.author) : book.author != null) return false;
        return publishedDate != null ? publishedDate.equals(book.publishedDate) : book.publishedDate == null;
    }

    @Override
    public int hashCode() {
        int result = title != null ? title.hashCode() : 0;
        result = 31 * result + (author != null ? author.hashCode() : 0);
        result = 31 * result + (publishedDate != null ? publishedDate.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Title: '" + title + '\'' +
                ", author='" + author + '\'' +
                ", publishedDate: " + publishedDate;
    }
}
