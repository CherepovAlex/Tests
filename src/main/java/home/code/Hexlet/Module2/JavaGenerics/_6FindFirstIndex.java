package home.code.Hexlet.Module2.JavaGenerics;

import home.code.Hexlet.Module2.JavaGenerics.model.*;

import java.util.ArrayList;
import java.util.List;

class ListUtils {
    public static <T> int findFirstIndex(List<? extends Human> human, String prefix) {
        for(var people: human) {
            if (people.getName().substring(0, prefix.length()).equals(prefix))
            return human.indexOf(people);
        }
        return -1;
    }
}

public class _6FindFirstIndex {
    public static void main(String[] args) {
        var people = new ArrayList<>(List.of(
                new Woman("Anna"),
                new Woman("Gina"),
                new Woman("Nina")
        ));

        System.out.println(ListUtils.findFirstIndex(people, "G")); // 1
        System.out.println(ListUtils.findFirstIndex(people, "O")); // -1
    }
}
