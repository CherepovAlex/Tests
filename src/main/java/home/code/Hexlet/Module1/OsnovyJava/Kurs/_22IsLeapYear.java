//Реализуйте метод isLeapYear(), который определяет является ли год високосным или нет.
// Год будет високосным, если он кратен (то есть делится без остатка) 400 или он
// одновременно кратен 4 и не кратен 100.
package Hexlet.Module1.OsnovyJava.Kurs;

class App21 {
    // BEGIN (write your solution here)
    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && !(year % 100 == 0));
    }
    // END
}


public class _22IsLeapYear {
    public static void main(String[] args) {
        App21.isLeapYear(2018); // false
        App21.isLeapYear(2017); // false
        App21.isLeapYear(2016); // true
    }
}
