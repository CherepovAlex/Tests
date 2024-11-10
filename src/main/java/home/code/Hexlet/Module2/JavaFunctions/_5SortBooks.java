package home.code.Hexlet.Module2.JavaFunctions;

import home.code.Hexlet.Module2.JavaFunctions.model.Book;
import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

class App5 {
    public static ArrayList<Book> sortBooks(List<Book> list) {
        var newList = new ArrayList<Book>(list);
        newList.sort(Comparator.comparing(Book::getTitle).reversed());
//        newList.sort((v1, v2) -> v2.getTitle().compareTo(v1.getTitle()));
        return newList;
    }
}


public class _5SortBooks {
    public static void main(String[] args) {
        var books = new ArrayList<>(
                List.of(
                        new Book("Dubliners", "James Joyce"),
                        new Book("Moby-Dick", "Herman Melville"),
                        new Book("The Great Gatsby", "F. Scott Fitzgerald")
                )
        );

        var sortedBooks = App5.sortBooks(books);
        System.out.println(sortedBooks);
        // => [The Great Gatsby - F. Scott Fitzgerald, Moby-Dick - Herman Melville, Dubliners - James Joyce]
    }
}
