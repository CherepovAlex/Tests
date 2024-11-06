package home.code.Hexlet.Module1.OsnovyJava.Kurs;

class App18 {
    public static String truncate(String text, int length) {
        // BEGIN (write your solution here)
        return text.substring(0, length) + "...";
        // END
    }
}

public class _19Truncate {
    public static void main(String[] args) {
        // Обрезаем текст "hexlet", оставляя 2 символа
        App18.truncate("hexlet", 2); // "he..."
        // Обрезаем текст "it works!", оставляя 4 символа
        App18.truncate("it works!", 4); // "it w..."
        // Обрезаем текст "hello", оставляя 3 символа
        App18.truncate("hello", 3); // 'hel...'
    }
}
