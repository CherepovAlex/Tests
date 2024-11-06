package home.code.Hexlet.Module2.JavaLists;

import java.util.List;

class App4 {
    public static int countBooks(List<Book> list, String authorName, String genre) {
        var count = 0;
        for (Book elList : list) {
            if (elList.getAuthorName().equals(authorName) && (elList.getGenre().equals(genre))) {
                count++;
            }
        }
        return count;
    }
}

class Book {
    private final String name;
    private final String authorBook;
    private final String genre;

    public Book(String name, String authorBook, String genre) {
        this.name = name;
        this.authorBook = authorBook;
        this.genre = genre;
    }

    public String getAuthorName() {
        return authorBook;
    }

    public String getGenre() {
        return genre;
    }
}

public class _4AuthorBook {
    public static void main(String[] args) {
        var books = List.of(
                new Book("Death on the Nile", "Agatha Christie", "Detective"),
                new Book("Murder on the Orient Express", "Agatha Christie", "Detective"),
                new Book("The Raven", "Edgar Allan Poe", "Poem")
        );

        System.out.println(App4.countBooks(books, "Agatha Christie", "Detective")); // 2
    }
}
