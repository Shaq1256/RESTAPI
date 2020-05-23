package kodilla.averageDegree;

public class Book {
    String title;
    Integer yearOfPublication;

    public Book(String title, Integer yearOfPublication) {
        this.title = title;
        this.yearOfPublication = yearOfPublication;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYearOfPublication() {
        return yearOfPublication;
    }

    @Override
    public String toString() {
        return "Book title: '" + title + '\'' +
                ", yearOfPublication: " + yearOfPublication;
    }
}
