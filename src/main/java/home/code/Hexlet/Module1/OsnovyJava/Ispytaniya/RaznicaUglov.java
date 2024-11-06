//Напишите метод diff(), который принимает два угла (integer), каждый от 0 до 360, и возвращает разницу
// между ними.
//Угол между лучами измеряется двумя способами:
//Функция должна вернуть наименьшее значение.
//Подсказки
//В решении вам могут пригодиться методы класса Math
package Hexlet.Module1.OsnovyJava.Ispytaniya;
class App5 {
    // BEGIN
    public static int diff(int a, int b) {
        var angle = Math.abs(a - b);
        return Math.min(angle, 360 - angle);
    }
    // END
}
public class RaznicaUglov {
    public static void main(String[] args) {
        App5.diff(0, 45);// == = 45; не 315, а 45, потому что 45 меньше
        App5.diff(0, 180);// == = 180;
        App5.diff(0, 190);// == = 170; не 190, а 170, потому что 170 меньше
        App5.diff(120, 280);// == = 160;
    }
}
