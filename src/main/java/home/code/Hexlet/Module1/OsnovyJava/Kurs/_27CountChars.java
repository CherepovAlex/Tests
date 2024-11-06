
//Метод из теории учитывает регистр букв. То есть A и a с его точки зрения разные символы.
// Реализуйте вариант этого же метода так, чтобы регистр букв был не важен:
//Character.toLowerCase() переводит символ в нижний регистр
//Character.toLowerCase('A'); // 'a'
package Hexlet.Module1.OsnovyJava.Kurs;

class App27 {
    public static int countChars(String str, char ch) {
        // BEGIN (write your solution here)
        var i = 0;
        var count = 0;
        while (i < str.length()) {
            if (Character.toLowerCase(str.charAt(i)) == Character.toLowerCase(ch)) {
                // Считаем только подходящие символы
                count = count + 1;
            }
            // Счетчик увеличивается в любом случае
            i += 1;
        }
        return count;
        // END
    }
}

public class _27CountChars {
    public static void main(String[] args) {
        App27.countChars("HexlEt", 'e'); // 2
        App27.countChars("HexlEt", 'E'); // 2
    }
}
