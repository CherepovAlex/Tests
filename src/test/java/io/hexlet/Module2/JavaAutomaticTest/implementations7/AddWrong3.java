package io.hexlet.Module2.JavaAutomaticTest.implementations7;

import java.util.List;

public class AddWrong3 {
    public static <T> boolean add(List<T> coll, T element) {
        return coll.add(element);
    }

    public static <T> boolean add(List<T> coll, T element, int index) {
        return coll.add(element);
    }
}