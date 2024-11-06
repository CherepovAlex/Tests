//Выведите на экран первую и последнюю буквы предложения, записанного в переменную
// text, в следующем формате:
//First: N
//Last: t
//Постарайтесь создать только одну переменную, в которую сразу запишется нужный
// текст перед печатью на экран. В этом уроке мы отрабатываем умение собирать составное
// выражение.
//Подсказки
//Как получить символ из строки
package Hexlet.Module1.OsnovyJava.Kurs;

class App9 {
    public static void main(String[] args) {
        var text = "Never forget what you are, for surely the world will not";

        // BEGIN (write your solution here)
        System.out.println("First: " + text.charAt(0));
        System.out.println("Last: " + text.charAt(text.length()-1));
        // END
    }
}


public class _10NeverForgetWhatYouAreForSurelyTheWorldWillNot {
}
