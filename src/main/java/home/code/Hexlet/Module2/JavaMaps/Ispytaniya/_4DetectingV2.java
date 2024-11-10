package home.code.Hexlet.Module2.JavaMaps.Ispytaniya;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;


class App4_1 {
    // BEGIN
    public static List<Map<String, String>> findWhere(List<Map<String, String>> data, Map<String, String> items) {

        var result = new ArrayList<Map<String, String>>();

        for (var item : data) {
            boolean find = true;

            for (var entry : items.entrySet()) {
                var itemValue = item.getOrDefault(entry.getKey(), "");
                if (!itemValue.equals(entry.getValue())) {
                    find = false;
                }
            }

            if (find) {
                result.add(item);
            }
        }

        return result;
    }
    //END
}

public class _4DetectingV2 {
    public static void main(String[] args) {
        var books = new ArrayList<Map<String, String>>();

        var book1 = Map.of("title", "Cymbeline", "author", "Shakespeare", "year", "1611");
        var book2 = Map.of("title", "Book of Fooos", "author", "FooBar", "year", "1111");
        var book3 = Map.of("title", "The Tempest", "author", "Shakespeare", "year", "1611");
        var book4 = Map.of("title", "Book of Foos Barrrs", "author", "FooBar", "year", "2222");
        var book5 = Map.of("title", "Still foooing", "author", "FooBar", "year", "3333");
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);

        var where = Map.of(
                "author", "Shakespeare",
                "year", "1611"
        );

        var result = App4_1.findWhere(books, where);

        System.out.println(result); // =>
            // [
            //     {title=Cymbeline, year=1611, author=Shakespeare},
            //     {title=The Tempest, year=1611, author=Shakespeare}
            // ]
    }
}
