package io.hexlet.Module2.JavaAutomaticTest;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.catchThrowable;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static io.hexlet.Module2.JavaAutomaticTest.implementations10.Methods10.fill;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class Test10MethodsTest {
    // BEGIN (write your solution here)

    List<String> coll = new ArrayList<>();

    @BeforeEach
    public void beforeEach() {
        coll.addAll(Arrays.asList("a", "b", "c", "d"));
    }

    @Test
    public void testFillEmpty() {
        List<String> coll1 = new ArrayList<>();
        coll1.addAll(Arrays.asList());
        fill(coll1, "*", 1, 3);
        assertTrue(coll1.isEmpty());
        fill(coll1, "*", 1);
        assertTrue(coll1.isEmpty());
        fill(coll1, "*");
        assertTrue(coll1.isEmpty());
    }

    @Test
    public void testFillContains() {
        fill(coll, "*", 1, 3);
        assertTrue(coll.contains("*"));
        assertFalse(coll.get(0).equals("*"));
        assertTrue(coll.get(1).equals("*"));
        assertTrue(coll.get(2).equals("*"));
        assertFalse(coll.get(3).equals("*"));

    }

    @Test
    public void testFillAll() {
        fill(coll, "*");
        assertTrue(coll.contains("*"));
        assertTrue(coll.get(0).equals("*"));
        assertTrue(coll.get(1).equals("*"));
        assertTrue(coll.get(2).equals("*"));
        assertTrue(coll.get(3).equals("*"));
    }

    @Test
    public void testFillStart() {
        fill(coll, "*", 2);
        assertTrue(coll.contains("*"));
        assertFalse(coll.get(1).equals("*"));
        assertTrue(coll.get(2).equals("*"));
        assertTrue(coll.get(3).equals("*"));
    }

    @Test
    public void testFillEnd() {
        fill(coll, "*", 2, 2);
        assertFalse(coll.contains("*"));
    }


    @Test
    public void testFillNone() {
        var thrown = catchThrowable(() -> fill(coll, "*", 4, 6));
        assertFalse(coll.contains("*"));
        assertFalse(coll.get(0).equals("*"));
        assertFalse(coll.get(3).equals("*"));
        assertThat(thrown).isInstanceOf(IndexOutOfBoundsException.class);
    }

    @Test
    public void testFillExtra() {
        var thrown = catchThrowable(() -> fill(coll, "*", 0, 10));
        assertTrue(coll.contains("*"));
        assertTrue(coll.get(0).equals("*"));
        assertTrue(coll.get(3).equals("*"));
        assertThat(thrown).isInstanceOf(IndexOutOfBoundsException.class);
    }

    @Test
    public void testFillNegative() {
        var thrown = catchThrowable(() -> fill(coll, "*", -2, 2));
        assertThat(thrown).isInstanceOf(IndexOutOfBoundsException.class);
        var thrown1 = catchThrowable(() -> fill(coll, "*", -2));
        assertThat(thrown1).isInstanceOf(IndexOutOfBoundsException.class);
    }

    // END
    public static void main(String[] args) {
        var coll = Arrays.asList("a", "b", "c", "d");

        // Все вызовы нужно рассматривать, как независимые
        fill(coll, "*", 1, 3);
        System.out.println(coll); // => ["a", "*", "*", "d"]

        fill(coll, "*");
        System.out.println(coll); // => ["*", "*", "*", "*"]

        fill(coll, "*", 4, 6);
        System.out.println(coll); // => ["a", "b", "c", "d"]

        fill(coll, "*", 0, 10);
        System.out.println(coll); // => ["*", "*", "*", "*"]

        fill(coll, "*", 2);
        System.out.println(coll); // => ["a", "b", "*", "*"]

    }

}
