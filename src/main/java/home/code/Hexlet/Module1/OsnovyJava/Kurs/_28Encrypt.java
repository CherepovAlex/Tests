//Вам предстоит написать программу, которая шифрует сообщения по следующему алгоритму:
// она берёт текст и переставляет в нём каждые два подряд идущих символа.
//Если количество символов нечётное, то последний символ остаётся на своём месте:
//Реализуйте статический метод App.encrypt(), который принимает на вход исходное сообщение
// и возвращает зашифрованное.
//Подсказки
//В цикле можно использовать шаг i + 2, чтобы перескакивать через символ

package Hexlet.Module1.OsnovyJava.Kurs;

class App28 {
    public static String encrypt(String str) {
        // BEGIN (write your solution here)
        int length = str.length();
        String result = "";
        for (int i = 1; i < length; i += 2) {
            result += str.charAt(i);
            result += str.charAt(i - 1);
        }
        if (length % 2 != 0) {
            result += str.charAt(length - 1);
        }
        return result;
        // END
    }
}

public class _28Encrypt {
    public static void main(String[] args) {
        App28.encrypt("move"); // "omev"
        App28.encrypt("attack"); // "taatkc"
// Если число символов нечётное,
// то последний символ остается на своем месте
        App28.encrypt("go!"); // "og!"
    }
}
