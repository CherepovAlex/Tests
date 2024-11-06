package home.code.Hexlet.Module2.JavaClasses;

import java.util.Objects;

class App3 {
    public static boolean contains(Car[] cat, Car car) {
        for (int i = 0; i < cat.length; i++) {
            if (cat[i].equals(car)) {
                return true;
            }
        }
        return false;
    }
}

class Car {
    private String made;
    private String model;
    private int produced;

    public Car(String marka, String model, int godVypuska) {
        this.made = marka;
        this.model = model;
        this.produced = godVypuska;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return produced == car.produced
                && made.equals(car.made)
                && model.equals(car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(made, model, produced);
    }
}


public class _3AutoCatalog {
    public static void main(String[] args) {

        Car[] cars = {
                new Car("Aston Martin", "V8 Vantage", 2011),
                new Car("Ford", "VWindstar", 1998),
                new Car("Lotus", "Exige", 2006)
        };

        var car1 = new Car("Lotus", "Exige", 2006);
        System.out.println(App3.contains(cars, car1)); // true

        var car2 = new Car("Lotus", "Exige", 2009);
        System.out.println(App3.contains(cars, car2)); // false


        var car4 = new Car("bmv", "x5", 1998);
        var car5 = new Car("bmv", "x5", 1998);
        System.out.println(car4.equals(car5)); // true

        var car6 = new Car("bmv", "x5", 2000);
        System.out.println(car1.equals(car6)); // false
    }
}
