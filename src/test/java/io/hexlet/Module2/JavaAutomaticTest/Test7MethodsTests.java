package io.hexlet.Module2.JavaAutomaticTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static io.hexlet.Module2.JavaAutomaticTest.Methods7.add;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.catchThrowable;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

class Test7MethodsTests {

    // BEGIN (write your solution here)
    List<Integer> coll = new ArrayList<>();

    @BeforeEach
    public void beforeEach() {
        coll.addAll(Arrays.asList(1, 2, 3, 4));
    }

    @Test
    public void testAdd1() {
        add(coll, 5);
        assertTrue(coll.contains(5));
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        assertEquals(coll, numbers);
    }

    @Test
    public void testAdd2() {
        add(coll, 5, 1);
        assertEquals(coll.get(1), 5);
        assertEquals(coll.size(), 5);
    }

    @Test
    public void testAdd3() {
        add(coll, 5, 4);
        assertEquals(coll.get(4), 5);
        assertEquals(coll.size(), 5);
    }

    @Test
    public void testAdd4() {
        add(coll, 2, 1);
        assertEquals(coll.get(4), 4);
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4);
        assertEquals(coll, numbers);
        assertEquals(coll.size(), 5);
    }

    @Test
    public void testAdd5() {
        add(coll, 5);
        assertEquals(true, add(coll, 5));
        assertEquals(coll.get(4), 5);
        assertEquals(coll.size(), 6);
    }

    @Test
    public void testAdd6() {
        add(coll, null, 4);
        assertTrue(coll.contains(null));
        assertEquals(coll.size(), 5);
    }

    @Test
    public void testAdd7() {
        var thrown = catchThrowable(() -> add(coll, 2, -1));
        assertThat(thrown).isInstanceOf(IndexOutOfBoundsException.class);
    }

    @Test
    public void testAdd8() {
        var thrown = catchThrowable(() -> add(coll, 2, 5));
        assertThat(thrown).isInstanceOf(IndexOutOfBoundsException.class);
    }

    @Test
    public void testAdd9() {
        var thrown = catchThrowable(() -> add(coll, 2, 15));
        assertThat(thrown).isInstanceOf(IndexOutOfBoundsException.class);
    }

    // END
}

class ArrayListTest {
    public static void main(String[] args) {

        List<Integer> coll = Arrays.asList(1, 2, 3, 4);

        // Все вызовы нужно рассматривать, как независимые
        add(coll, 5); // true
        System.out.println(coll); // => [1, 2 ,3, 4, 5]

        add(coll, 5, 1); // true
        System.out.println(coll); // => [1, 5, 2 ,3, 4]

        add(coll, 5, 4); // true
        System.out.println(coll); // => [1, 2 ,3, 4, 5]
    }
}