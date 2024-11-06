package home.code.Hexlet.Module2.JavaLists;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import home.code.Hexlet.Module2.JavaLists.model.Car;

class App6 {
    public static ArrayList<String> getCars(List<Car> list, int made) {
        var newList = new ArrayList<String>();
        for (Car el: list){
            if (el.getManufacturedAt().getYear() < made){
                newList.add(el.getMade() +  " " + el.getModel());
            }
        }
        Collections.sort(newList, String.CASE_INSENSITIVE_ORDER);
        return newList;

    }
}

public class _6RetroCars {
    public static void main(String[] args) {
        var cars = List.of(
                new Car("Jaguar", "XK120", LocalDate.of(1950, 8, 21)),
                new Car("Mercedes-Benz", "W114", LocalDate.of(1968, 7, 10)),
                new Car("Fiat", "600", LocalDate.of(1956, 1, 1))
        );

        var result = App6.getCars(cars, 1960);
        System.out.println(result); // => [Fiat 600, Jaguar XK120]
    }
}
