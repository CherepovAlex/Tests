package home.code.Hexlet.Module2.JavaClasses;

class Book {
    String title;
    String author;
    int published;

    public Book(String title, String author, int published) {
        this.title = title;
        this.published = published;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book \"" + title + "\" written by " + author + " published in " + published;
    }
}

public class _2BookClass {
    public static void main(String[] args) {
        var book = new Book("First Folio", "William Shakespeare", 1623);
        System.out.println(book); //=> Book "First Folio" written by William Shakespeare published in 1623
    }
}
