package home.code.Hexlet.Module2.JavaMaps;

import java.util.*;

class App3 {
    public static HashMap<Character, List<String>> buildIndex(String text) {
        if (text.equals("")) {
            return new HashMap<Character, List<String>>();
        }
        var words = text.split(" ");
        var wordsFrequency = new HashMap<Character, List<String>>();
        for (var word : words)
            if (wordsFrequency.containsKey(word.charAt(0))) {
                var list = wordsFrequency.get(word.charAt(0));
                list.add(word);
                String[] array = new String[list.size()];
                list.toArray(array);
                wordsFrequency.put(word.charAt(0), new ArrayList<>(Arrays.asList(array)));
            } else {
                wordsFrequency.put(word.charAt(0), new ArrayList<>(Arrays.asList(word)));
            }
        return wordsFrequency;
    }
}

public class _3DifferentWords {
    public static void main(String[] args) {

        var text = "java and javascript are different languages";

        var index = App3.buildIndex(text);
        System.out.println(index); // => {a=[and, are], d=[different], j=[java, javascript], l=[languages]}

        var index2 = App3.buildIndex("");
        System.out.println(index2); // => {}

    }
}
