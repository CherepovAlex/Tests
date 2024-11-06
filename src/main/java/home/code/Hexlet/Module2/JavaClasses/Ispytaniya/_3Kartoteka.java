package Hexlet.Module2.JavaClasses.Ispytaniya;

import Hexlet.Module2.JavaClasses.Ispytaniya.model.Book;
import org.apache.commons.lang3.ArrayUtils;

class App {
    public static Book[] find (Book[] library, Book book) {
        Book[] newBook = new Book[0];
        for (Book element: library){
            if (book.equals(element)){
                newBook = ArrayUtils.add(newBook, book);
            }
        }
        return newBook;
    }
}


public class _3Kartoteka {
    public static void main(String[] args) {
        Book[] library = {
            new Book("The Great Gatsby", "F. Scott Fitzgerald", 1922),
            new Book("Twenty Thousand Leagues Under the Sea", "Jules Verne", 2000),
            new Book("Moby Dick", "Herman Melville", 1998),
            new Book("The Great Gatsby", "F. Scott Fitzgerald", 2012),
            new Book("The Great Gatsby", "Noname", 2012)
        };


        var book = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1922);

        var result = App.find(library, book);
        System.out.println(result.toString());

    }
}
