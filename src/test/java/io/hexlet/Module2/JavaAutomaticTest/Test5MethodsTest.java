package io.hexlet.Module2.JavaAutomaticTest;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static io.hexlet.Module2.JavaAutomaticTest.Methods5.makeValidator;
import static org.assertj.core.api.Assertions.catchThrowable;

public class Test5MethodsTest {

    @Test
    public void testValidator() {
        //BEGIN (write your solution here)
        var validator = makeValidator();
        assertThat(validator.isValid(3)).isTrue();
        assertThat(validator.isValid(null)).isTrue();
        assertThat(validator.isValid("some string")).isFalse();
        validator.required();
        assertThat(validator.isValid(null)).isFalse();
        assertThat(validator.isValid("")).isFalse();
        validator.positive();
        assertThat(validator.isValid(5)).isTrue();
        assertThat(validator.isValid(0)).isFalse();
        assertThat(validator.isValid(-2)).isFalse();
        //выбросить ошибку
        var thrown = catchThrowable(() -> validator.isValid(5 / 0));
        assertThat(thrown).isInstanceOf(ArithmeticException.class);
        //END
    }

    public static void main(String[] args) {
        // Создаем объект "валидатора"
        var validator = makeValidator();
        // Так как не было добавлено ни одной проверки,
        // корректными данными будут считаться числа и значение null
        validator.isValid(null); // true
        validator.isValid("some string"); // false
        // добавляем проверку, что переданное значение должно быть числом
        validator.required();
        validator.isValid(null); // false
        // добавляем проверку, что переданное число больше нуля
        validator.positive();
        validator.isValid(5); // true
        validator.isValid(0); // false
    }

}
