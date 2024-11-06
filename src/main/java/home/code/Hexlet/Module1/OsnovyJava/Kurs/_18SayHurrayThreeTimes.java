//В классе App реализуйте публичный статический метод sayHurrayThreeTimes(), который
// возвращает строку hurray! hurray! hurray!
package Hexlet.Module1.OsnovyJava.Kurs;

class App17 {
    // BEGIN (write your solution here)
    public static String sayHurrayThreeTimes(){
        return "hurray! hurray! hurray!";
    }
    // END
}

public class _18SayHurrayThreeTimes {
    public static void main(String[] args) {
        var hurray = App17.sayHurrayThreeTimes();
        System.out.println(hurray); // => hurray! hurray! hurray!
    }
}
