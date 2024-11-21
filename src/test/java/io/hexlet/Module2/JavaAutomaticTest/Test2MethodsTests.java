package io.hexlet.Module2.JavaAutomaticTest;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import static io.hexlet.Module2.JavaAutomaticTest.Methods2.take;

public class Test2MethodsTests {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        take(numbers, 1); // [1]
        take(numbers, 2); // [1, 2]
        take(numbers, 9); // [1, 2, 3]

        int[] emptyNumbers = {};
        take(emptyNumbers, 2); // []
    }

    @Test
    public void testTake() {
        //BEGIN (write your solution here)
        int[] numbers = {1, 2, 3};
        int[] numbers1 = {1, 2};
        assert Arrays.equals(numbers1, take(numbers, 2));

        int[] numbers2 = {1};
        assert Arrays.equals(numbers2, take(numbers, 1));

        int[] numbers3 = {1, 2, 3};
        assert Arrays.equals(numbers3, take(numbers, 9));

        int[] emptyNumbers = {};
        int[] emptyNumbers1 = {};
        assert Arrays.equals(emptyNumbers1, take(emptyNumbers, 2));

        int[] emptyNumbers2 = {1, 2, 3};
        int[] emptyNumbers3 = {};
        assert Arrays.equals(emptyNumbers3, take(emptyNumbers2, 0));
        //END
    }
}
