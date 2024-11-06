//Реализуйте метод isPowerOfThree() который определяет, является ли переданное число натуральной
// степенью тройки. Например, число 27 – это третья степень (3-3), а 81 – четвёртая (3-4).
package Hexlet.Module1.OsnovyJava.Ispytaniya;

class App4 {
    public static Boolean isPowerOfThree(int number) {
        // BEGIN
        var current = 1;
        while (current <= number) {
            if (current == number) {
                return true;
            }
            current *= 3;
        }

        return false;
        // END
    }
}

public class StepenTroyki {
    public static void main(String[] args) {
        App4.isPowerOfThree(1); // true (3^0)
        App4.isPowerOfThree(3); // true
        App4.isPowerOfThree(4); // false
        App4.isPowerOfThree(9); // true
    }
}
