package Hexlet.Module2.JavaLists;

import java.util.ArrayList;
import java.util.List;

class App {

    public static String getOrDefault(List<String> list, int index, String def) {
        if (index < 0 || index > list.size() - 1) {
            return def;
        }
        return list.get(index);
    }
}

public class _1Lists {
    public static void main(String[] args) {

        var capitals = List.of("london", "berlin", "tokio");

        System.out.println(App.getOrDefault(capitals, 1, "")); // "berlin"
        System.out.println(App.getOrDefault(capitals, 2, "")); // "tokio"
        System.out.println(App.getOrDefault(capitals, 5, "1")); // ""
        System.out.println(App.getOrDefault(capitals, -2, "1")); // ""
    }
}
