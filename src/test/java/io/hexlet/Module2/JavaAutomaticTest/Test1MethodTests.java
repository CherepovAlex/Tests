package io.hexlet.Module2.JavaAutomaticTest;

import org.junit.jupiter.api.Test;

import static io.hexlet.Module2.JavaAutomaticTest.Methods.get;


public class Test1MethodTests {
    public static void main(String[] args) {
        String[] strings = {"hello", "world"};
        get(strings, 1, "value"); // "world"
        get(strings, 5, "value"); // "value"

    }
    @Test
    public void testGet() {
        String[] strings = {"hello", "world"};
        if (!"world".equals(get(strings, 1, "value"))) {
            throw new AssertionError("Метод работает неверно!");
        }
        if (!"value".equals(get(strings, 5, "value"))) {
            throw new AssertionError("Метод работает неверно!");
        }
        if (!"value".equals(get(strings, -1, "value"))) {
            throw new AssertionError("Метод работает неверно!");
        }
    }
}
