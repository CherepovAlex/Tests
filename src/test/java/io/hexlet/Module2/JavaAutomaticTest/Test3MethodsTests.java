package io.hexlet.Module2.JavaAutomaticTest;

import org.junit.jupiter.api.Test;
import static io.hexlet.Module2.JavaAutomaticTest.Methods3.indexOf;
import static org.assertj.core.api.Assertions.assertThat;

public class Test3MethodsTests {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 1, 2};
        indexOf(numbers, 2, 0); // 1
        indexOf(numbers, 2, 2); // 3
        indexOf(numbers, 8, 0); // -1
    }
    @Test
    public void testIndexOf() {
        //BEGIN (write your solution here)
        int[] numbers = {1, 2, 1, 2};
        int b = 1;
        assertThat(indexOf(numbers, 2, 0)).isEqualTo(b);

        int[] numbers1 = {1, 2, 1, 2};
        int b1 = 3;
        assertThat(indexOf(numbers1, 2, 2)).isEqualTo(b1);

        int[] numbers2 = {1, 2, 1, 2};
        int b2 = -1;
        assertThat(indexOf(numbers2, 8, 0)).isEqualTo(b2);

        int[] numbers3 = {1, 2, 1, 2};
        int b3 = -1;
        assertThat(indexOf(numbers3, 8, -3)).isEqualTo(b3);

        int[] numbers4 = {};
        int b4 = -1;
        assertThat(indexOf(numbers4, 2, 1)).isEqualTo(b4);

        //END
    }
}