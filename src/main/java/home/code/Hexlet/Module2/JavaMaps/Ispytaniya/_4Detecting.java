package home.code.Hexlet.Module2.JavaMaps.Ispytaniya;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

class App4 {
    public static List<Map<String, String>> findWhere(List<Map<String, String>> list, Map<String, String> dict) {

        List<Map<String, String>> newList = new ArrayList<>();

        for (Map<String, String> map : list) {
            var entries1 = map.entrySet();
            var entries2 = dict.entrySet();

            int capDict = dict.size();
            int count = 0;

            for (var entry2 : entries2) {
                for (var entry1 : entries1) {
                    if ((entry2.getKey().equals(entry1.getKey())) && (entry2.getValue().equals(entry1.getValue()))) {
                        count++;
                        if (count == capDict) {
                            newList.add(map);
                        }
                    }
                }
            }
        }
        return newList;
    }
}

public class _4Detecting {
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

        var result = App4.findWhere(books, where);

        System.out.println(result); // =>
// [
//     {title=Cymbeline, year=1611, author=Shakespeare},
//     {title=The Tempest, year=1611, author=Shakespeare}
// ]
    }
}
