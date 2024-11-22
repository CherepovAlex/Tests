package io.hexlet.Module2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static io.hexlet.Module2.JavaAutomaticTest.Methods9.indexOf;

import java.util.List;


public class Test9IndexOfTest {

    @Test
    public void testIndexOf() {
        var coll1 = List.of(1, 2, 3, 2, 4);
        var actual = indexOf(coll1, 2, 2);
        assertEquals(3, actual);

        // BEGIN (write your solution here)
        var coll2 = List.of();
        var actual4 = indexOf(coll2, 1);
        assertEquals(-1, actual4);
        var actual5 = indexOf(coll2, 1, 1);
        assertEquals(-1, actual5);
        var actual1 = indexOf(coll1, 2);
        assertEquals(1, actual1);
        var actual2 = indexOf(coll1, 2, -3);
        assertEquals(3, actual2);
        var actual3 = indexOf(coll1, 7);
        assertEquals(-1, actual3);
        var actual6 = indexOf(coll1, 2, -7);
        assertEquals(1, actual6);
        var coll3 = List.of(1);
        var actual7 = indexOf(coll3, 2, 1);
        assertEquals(-1, actual7);
        // END
    }

    public static void main(String[] args) {
        var coll = List.of(1, 2, 3, 2, 5);

        indexOf(coll, 2, 2); // 3
        indexOf(coll, 2); // 1
        indexOf(coll, 2, -3); // 3
        indexOf(coll, 7); // -1
    }

}
