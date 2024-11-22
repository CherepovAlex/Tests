package io.hexlet.Module2.JavaAutomaticTest.implementations9;

import java.util.List;

public class Wrong1 {

    public static <T> int indexOf(List<T> coll, T value, int fromIndex) {
        var collLength = coll.size();

        if (collLength == 0) {
            return 0;
        }

        var normalisedIndex = fromIndex;

        if (normalisedIndex < 0) {
            if (-normalisedIndex > collLength) {
                normalisedIndex = 0;
            } else {
                normalisedIndex += collLength;
            }
        }

        var index = -1;

        for (int i = normalisedIndex; i < collLength; i++) {
            var current = coll.get(i);
            if (current.equals(value)) {
                return i;
            }
        }

        return index;
    }

    public static <T> int indexOf(List<T> coll, T value) {

        if (coll.size() == 0) {
            return 0;
        }

        return coll.indexOf(value);
    }
}