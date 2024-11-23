package io.hexlet.Module2.JavaAutomaticTest.implementations10;

import io.hexlet.Module2.JavaAutomaticTest.Fill;

import java.util.List;

public class Methods10 {
    private static String implementation = "usersImplementation";

    public static void setImplementation(String implementationName) {
        implementation = implementationName;
    }

    public static <T> void fill(List<T> coll, T element, int begin, int end) {
        switch (implementation) {
            case "right" -> FillRight.fill(coll, element, begin, end);
            case "wrong1" -> FillWrong1.fill(coll, element, begin, end);
            case "wrong2" -> FillWrong2.fill(coll, element, begin, end);
            case "wrong3" -> FillWrong3.fill(coll, element, begin, end);
            default -> Fill.fill(coll, element, begin, end);
        }
    }

    public static <T> void fill(List<T> coll, T element, int begin) {
        switch (implementation) {
            case "right" -> FillRight.fill(coll, element, begin);
            case "wrong1" -> FillWrong1.fill(coll, element, begin);
            case "wrong2" -> FillWrong2.fill(coll, element, begin);
            case "wrong3" -> FillWrong3.fill(coll, element, begin);
            default -> Fill.fill(coll, element, begin);
        }
    }

    public static <T> void fill(List<T> coll, T element) {
        switch (implementation) {
            case "right" -> FillRight.fill(coll, element);
            case "wrong1" -> FillWrong1.fill(coll, element);
            case "wrong2" -> FillWrong2.fill(coll, element);
            case "wrong3" -> FillWrong3.fill(coll, element);
            default -> Fill.fill(coll, element);
        }
    }
}