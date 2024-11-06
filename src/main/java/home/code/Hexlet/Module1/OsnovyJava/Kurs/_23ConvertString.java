//Реализуйте метод convertString(), который принимает на вход строку и, если первая
// буква не заглавная, возвращает перевернутый вариант исходной строки. Если первая
// буква заглавная, то строка возвращается без изменений. Если на вход передана пустая
// строка, метод должен вернуть пустую строку.
//Подсказки
//Для выполнения задачи вам понадобятся следующие методы:
//Метод Character.isUpperCase() – проверяет, находится ли символ в верхнем регистре
//Character.isUpperCase('s'); // false
//Character.isUpperCase('A'); // true
//Метод StringUtils.reverse() из библиотеки Apache Commons Lang – выполняет переворот строки
//StringUtils.reverse("bat"); // "tab"
//Подумайте, в каком месте метода нужно разместить проверку на пустую строку?
//Попробуйте написать два варианта функции: с обычным if-else и с тернарным оператором.
package Hexlet.Module1.OsnovyJava.Kurs;

import org.apache.commons.lang3.StringUtils;

class App23 {
    // BEGIN (write your solution here)
    public static String convertString(String string) {
        if (string.equals(""))
            return "";
        else if (!(Character.isUpperCase(string.charAt(0))))
            return StringUtils.reverse(string);
        else return string;
    }
    // END
}


class _23ConvertString {
    public static void main(String[] args) {
        App23.convertString("Hello"); // "Hello"
        App23.convertString("hello"); // "olleh"

        // Не забудьте учесть пустую строку!
        App23.convertString(""); //
    }
}
