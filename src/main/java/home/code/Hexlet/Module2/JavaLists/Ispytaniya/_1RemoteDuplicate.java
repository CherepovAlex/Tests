package home.code.Hexlet.Module2.JavaLists.Ispytaniya;

import java.util.ArrayList;
import java.util.List;

class App1 {
    public static List<String> removeDuplicates(List<String> list) {
        List<String> newList = new ArrayList<>();
        for (String str: list){
            if (!newList.contains(str)){
                newList.add(str);
            }
        }
        return newList;
    }
}

public class _1RemoteDuplicate {
    public static void main(String[] args) {

        var words = List.of("a", "a", "b", "c", "c");
        var uniqWords = App1.removeDuplicates(words);
        System.out.println(uniqWords); // => [a, b, c]

    }
}
