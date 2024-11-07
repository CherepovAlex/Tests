package home.code.Hexlet.Module2.JavaMaps;

import java.util.Map;

class App2 {
    public static String getMostPopulatedCity(Map<String, Integer> map) {
        var max = 0;
        String city = null;
        var entries = map.entrySet();
        for(var entry: entries){
            entry.getKey();
            if (entry.getValue() > max){
                max = entry.getValue();
                city = entry.getKey();
            };
        }
        return city;
    }
}

public class _2MostPopCity {
    public static void main(String[] args) {
        var cities = Map.of(
                "White River", 114958,
                "Kashmor", 210451,
                "Oxford", 152450
        );

        System.out.println(App2.getMostPopulatedCity(cities)); // Kashmor
    }
}
