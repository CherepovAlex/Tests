package io.hexlet.Module2.JavaAutomaticTest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static io.hexlet.Module2.JavaAutomaticTest.Methods6.without;

public class Test6WithoutTests {

    //BEGIN (write your solution here)
    @Test
    public void testWithout() {
        int[] numbers = {1, 2, 3, 4, 5};
        int[] values = {2, 3};
        int[] expected = {1, 4, 5};
        int[] actual = Methods6.without(numbers, values);
        assertArrayEquals(expected, actual);

        int[] numbers1 = {};
        int[] values1 = {3, 4, 5};
        int[] expected1 = {};
        int[] actual1 = Methods6.without(numbers1, values1);
        assertArrayEquals(expected1, actual1);

        int[] numbers2 = {1, 2, 2, 2, 5};
        int[] values2 = {2};
        int[] expected2 = {1, 5};
        int[] actual2 = Methods6.without(numbers2, values2);
        assertArrayEquals(expected2, actual2);

        int[] numbers3 = {1, 2, 5};
        int[] values3 = {5};
        int[] expected3 = {1, 2};
        int[] actual3 = Methods6.without(numbers3, values3);
        assertArrayEquals(expected3, actual3);

        int[] numbers4 = {5};
        int[] values4 = {5};
        int[] expected4 = {};
        int[] actual4 = Methods6.without(numbers4, values4);
        assertArrayEquals(expected4, actual4);

        int[] numbers5 = {1, 2, 3, 4};
        int[] values5 = {1, 4};
        int[] expected5 = {2, 3};
        int[] actual5 = Methods6.without(numbers5, values5);
        assertArrayEquals(expected5, actual5);

        int[] numbers6 = {1, 2};
        int[] values6 = {1, 3, 4};
        int[] expected6 = {2};
        int[] actual6 = Methods6.without(numbers6, values6);
        assertArrayEquals(expected6, actual6);
    }
    //END

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        without(numbers, 2, 3); // [1, 4, 5]

        int[] emptyNumbers = {};
        without(emptyNumbers, 3, 4, 5); // []

        int[] withDuplicateNumbers = {1, 2, 2, 2, 5};
        without(withDuplicateNumbers, 2); // [1, 5]
    }

}