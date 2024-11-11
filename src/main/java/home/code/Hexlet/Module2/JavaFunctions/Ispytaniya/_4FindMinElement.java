package home.code.Hexlet.Module2.JavaFunctions.Ispytaniya;

import home.code.Hexlet.Module2.JavaFunctions.model.Book1;

import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

import java.util.function.Function;

class App4 {
    public static Book1 getMinValueBy(List<Book1> list, Function<Book1, Integer> fn) {
        var arrayList1 = new ArrayList<>(list);
        arrayList1.sort(Comparator.comparing(fn));
        return arrayList1.getFirst();
    }
}

public class _4FindMinElement {
    public static void main(String[] args) {
        var books = List.of(
                new Book1("Anna Karenina", "Leo Tolstoy", 1890, 543),
                new Book1("Crime and Punishment", "Fyodor Dostoevsky", 1864, 231),
                new Book1("The Lord of the Rings", "J. R. R. Tolkien", 1920, 1000),
                new Book1("The Adventures of Huckleberry Finn", "Mark Twain", 1901, 120),
                new Book1("Invisible Man", "Ralph Ellison", 1920, 1000),
                new Book1("Frankenstein", "Mary Shelley", 1920, 245)
        );

        // Так можно получить книну, в которой меньше всего страниц
        var shortestBook = App4.getMinValueBy(books, Book1::getPagesCount);
        System.out.println(shortestBook);
        // => Book(title=The Adventures of Huckleberry Finn, author=Mark Twain, published=1901, pagesCount=120)

        // А так книгу, написанную раньше остальных
        var oldestBook = App4.getMinValueBy(books, Book1::getPublished);
        System.out.println(oldestBook);
        // => Book(title=Crime and Punishment, author=Fyodor Dostoevsky, published=1864, pagesCount=231)
    }
}
