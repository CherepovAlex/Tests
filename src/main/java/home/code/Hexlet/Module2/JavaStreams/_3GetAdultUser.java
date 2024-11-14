package home.code.Hexlet.Module2.JavaStreams;

import java.util.ArrayList;
import java.util.List;

import home.code.Hexlet.Module2.JavaStreams.model.Person;

class App3 {
    public static List<String> getAdultUserNames(List<Person> list) {
        return list.stream()
                .filter(person -> person.getAge() >= 18)
                .map(Person::getName)
                .toList();
    }
}

public class _3GetAdultUser {
    public static void main(String[] args) {
        var people = new ArrayList(
                List.of(
                        new Person("John", 17),
                        new Person("Anna", 24),
                        new Person("Alex", 35)
                )
        );

        var names = App3.getAdultUserNames(people);
        System.out.println(names); // => [Anna, Alex]
    }
}
