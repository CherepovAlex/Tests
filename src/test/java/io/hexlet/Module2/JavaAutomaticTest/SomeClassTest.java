//Создадим класс SomeClass со статическим методом sum(),
//который находит сумму двух чисел:

package io.hexlet.Module2.JavaAutomaticTest;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Test6SomeClass {
    public static int sum(int a, int b) {
        return a + b;
    }
}

//Класс SomeClassTest.java с тестами для метода sum будет выглядеть следующим образом

public class SomeClassTest {
//Аннотация @Test "показывает" фреймворку, что этот метод является тестом,
//а класс Assertions является основным для большинства тестовых методов.
    @Test
    public void testSum() {
        var expected = 5;
        var actual = Test6SomeClass.sum(3, 2);
        assertEquals(expected, actual);
    }
}