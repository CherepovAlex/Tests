package io.hexlet.Module2.JavaAutomaticTest;

import java.util.List;
import io.hexlet.Module2.JavaAutomaticTest.implementations9.Right;
import io.hexlet.Module2.JavaAutomaticTest.implementations9.Wrong1;
import io.hexlet.Module2.JavaAutomaticTest.implementations9.Wrong2;
import io.hexlet.Module2.JavaAutomaticTest.implementations9.Wrong3;
import io.hexlet.Module2.JavaAutomaticTest.implementations9.Wrong4;

public class Methods9 {
    private static String implementation = "right";

    public static void setImplementation(String implementationName) {
        implementation = implementationName;
    }

    public static <T> int indexOf(List<T> coll, T value, int fromIndex) {
        return switch (implementation) {
            case "wrong1" -> Wrong1.indexOf(coll, value, fromIndex);
            case "wrong2" -> Wrong2.indexOf(coll, value, fromIndex);
            case "wrong3" -> Wrong3.indexOf(coll, value, fromIndex);
            case "wrong4" -> Wrong4.indexOf(coll, value, fromIndex);
            default -> Right.indexOf(coll, value, fromIndex);
        };
    }

    public static <T> int indexOf(List<T> coll, T value) {
        return switch (implementation) {
            case "wrong1" -> Wrong1.indexOf(coll, value);
            case "wrong2" -> Wrong2.indexOf(coll, value);
            case "wrong3" -> Wrong3.indexOf(coll, value);
            case "wrong4" -> Wrong4.indexOf(coll, value);
            default -> Right.indexOf(coll, value);
        };
    }
}
