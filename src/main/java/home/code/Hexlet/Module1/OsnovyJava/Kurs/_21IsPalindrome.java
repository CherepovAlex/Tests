//алиндром – это слово, которое читается одинаково в обоих направлениях. Например,
// слово «топот» является палиндромом
//src/main/java/io/hexlet/App.java
//Реализуйте метод isPalindrome(). Метод принимает в качестве параметра строку и
// определяет, является ли эта строка палиндромом или нет. Строка может содержать
// символы в любом регистре.
//Для определения палиндрома, необходимо перевернуть строку и сравнить ее с исходной.
// Для этого воспользуйтесь методом StringUtils.reverse()
//StringUtils.reverse("мама"); // "амам"

package Hexlet.Module1.OsnovyJava.Kurs;

import org.apache.commons.lang3.StringUtils;

class App20 {
    // BEGIN (write your solution here)
    public static boolean isPalindrome(String string) {
        return string.equalsIgnoreCase(StringUtils.reverse(string));
    }
    // END
}


public class _21IsPalindrome {
    public static void main(String[] args) {
        App20.isPalindrome("шалаш"); // true
        App20.isPalindrome("ага"); // true
        App20.isPalindrome("хекслет"); // false

// Слова в метод могут быть переданы в любом регистре
        App20.isPalindrome("Ага"); // true
    }
}
