package io.hexlet.Module2.JavaAutomaticTest.implementations10;

import java.util.List;

class FillWrong2 {

    public static <T> void fill(List<T> coll, T element, int begin, int end) {

        var collLength = coll.size();

        if (begin >= collLength) {
            coll.add(element);
            return;
        }

        var normalizedEnd = end > collLength ? collLength : end;

        for (var i = begin; i < normalizedEnd; i++) {
            coll.set(i, element);
        }
    }

    public static <T> void fill(List<T> coll, T element, int begin) {
        fill(coll, element, begin, coll.size());
    }

    public static <T> void fill(List<T> coll, T element) {
        fill(coll, element, 0, coll.size());
    }
}
