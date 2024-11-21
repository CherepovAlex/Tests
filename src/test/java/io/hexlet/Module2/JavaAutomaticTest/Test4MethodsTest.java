package io.hexlet.Module2.JavaAutomaticTest;

import static org.assertj.core.api.Assertions.assertThat;
import static io.hexlet.Module2.JavaAutomaticTest.Methods4.gt;

public class Test4MethodsTest {
    public static void main(String[] args) {
        gt(3, 1); // true

        gt(3, 3); // false

        gt(1, 3); // false
    }

    public void testGt() {
        //BEGIN (write your solution here)
        int value = 3;
        int other = 1;
        assertThat(gt(value, other)).isEqualTo(true);

        int value1 = 3;
        int other1 = 3;
        assertThat(gt(value1, other1)).isEqualTo(false);

        int value2 = 1;
        int other2 = 3;
        assertThat(gt(value2, other2)).isEqualTo(false);
        //END
    }
}
