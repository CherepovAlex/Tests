//Реализуйте метод isBalanced(), который принимает на вход строку, состоящую только из открывающих
// и закрывающих круглых скобок, и проверяет, является ли эта строка корректной. Пустая строка (отсутствие скобок)
// считается корректной.
//Строка считается корректной (сбалансированной), если содержащаяся в ней скобочная структура соответствует требованиям:
//Скобки — это парные структуры. У каждой открывающей скобки должна быть соответствующая ей закрывающая скобка.
//Закрывающая скобка не должна идти впереди открывающей. Такой вариант недопустим )(, а вот такой допустим ()().
package Hexlet.Module1.OsnovyJava.Ispytaniya;
class App11 {
    public static boolean isBalanced(String str) {
        // BEGIN
        var count = 0;
        for (var i = 0; i < str.length(); i++) {
            count = str.charAt(i) == '(' ? count + 1 : count - 1;
            if (count < 0) {
                return false;
            }
        }

        return count == 0;
        // END
    }
}
public class SbalansirovannyeSkobki {
    public static void main(String[] args) {
        App11.isBalanced("(())");  // true
        App11.isBalanced("()()");  // true
        App11.isBalanced("((())"); // false
    }
}
