package home.code.Hexlet.Module1.OsnovyJava.Kurs;

class App29 {
    // BEGIN (write your solution here)
    public static boolean greaterThan(String first, String second) {
        if (home.code.Hexlet.Module1.OsnovyJava.Kurs._29Counter.bigLettersCount(first) > home.code.Hexlet.Module1.OsnovyJava.Kurs._29Counter.bigLettersCount(second))
            return true;
        else
            return false;
    }
    // END
}

public class _29GreaterThan {
    public static void main(String[] args) {
        App29.greaterThan("QwQ", "aa"); // true
        App29.greaterThan("QwQbki", "AHK"); // false
        App29.greaterThan("A", "B"); // false
    }
}
