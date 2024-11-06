//Напишем код в стиле "повтори за учителем". Рассчитаем количество дней между двумя
// датами, используя встроенные возможности Java. Попробуйте менять даты и посмотрите,
// как будет изменяться результат работы
//// С даты
//LocalDate dateFrom = LocalDate.of(2017, Month.MAY, 24);
//// По дату
//LocalDate dateTo = LocalDate.of(2017, Month.JULY, 29);
//// Количество дней между этими датами
//long noOfDaysBetween = ChronoUnit.DAYS.between(dateFrom, dateTo);
//System.out.println(noOfDaysBetween);

package Hexlet.Module1.OsnovyJava.Kurs;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

class App13 {
    public static void main(String[] args) {
        // BEGIN (write your solution here)
        LocalDate dateFrom = LocalDate.of(2017, Month.MARCH, 21);
        LocalDate dateTo = LocalDate.of(2017, Month.APRIL, 15);
        long noOfDayBetween = ChronoUnit.DAYS.between(dateFrom, dateTo);
        System.out.println(noOfDayBetween);
        // END
    }
}

public class _14ChronoUnitEx {
}
