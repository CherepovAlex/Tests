//Реализуйте класс с именем App и двумя методами:
//Статический метод gogo(), который печатает на экран строку It works!
//Метод main(), как он определяется в теоретической части, который вызывает метод gogo()
//public static void main(String[] args) {
//    // Тут вызов метода gogo()
//}
//Результат вызова main() в таком случае будет таким:
//App.main(null); // => "It works!"
//Подсказки
//Самостоятельно вызывать метод main() вам не нужно, это сделают автоматические тесты
// при проверке решения.

package Hexlet.Module1.OsnovyJava.Kurs;

// BEGIN (write your solution here)
class App16{
    public static void gogo(){
        System.out.println("It works!");
    }
    public static void main(String[] args){
        App16.gogo();
    }
}
// END

public class _17GoGoItWorks {
}
