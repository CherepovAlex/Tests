//Напишите код, который берет данные из переменной name и выполняет их
// капитализацию. В программировании так называют операцию, которая делает
// заглавной первую букву в слове, а все остальные переводит в нижний регистр.
// Например: heXlet => Hexlet
//Выведите на экран получившийся результат.
//Подсказки
//Чтобы получить часть слова, используйте метод substring()

package Hexlet.Module1.OsnovyJava.Kurs;

class App11 {
    public static void printCapitalize(String[] args) {
        var name = "heXlEt";

        // BEGIN (write your solution here)
        System.out.println(name.toUpperCase().charAt(0) + name.toLowerCase().substring(1));
        // END
    }
}


public class _12PrintCapitalize {
}
