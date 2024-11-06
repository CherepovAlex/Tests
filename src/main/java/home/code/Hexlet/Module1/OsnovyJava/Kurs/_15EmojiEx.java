//В переменной emoji находится текстовый грустный смайлик -(. Ваша задача сделать
// этот смайлик веселым с помощью двух преобразований:
//
//Добавить слева глаза :
//Заменить ( на ) (с помощью метода строки replace())
//Должно получиться: :-). Выведите его на экран.

package Hexlet.Module1.OsnovyJava.Kurs;

class App14 {
    public static void main(String[] args) {
        var emoji = "-(";
        // BEGIN (write your solution here)
        System.out.println(":" + emoji.replace("(",")"));
        // END
    }
}

public class _15EmojiEx {
}
