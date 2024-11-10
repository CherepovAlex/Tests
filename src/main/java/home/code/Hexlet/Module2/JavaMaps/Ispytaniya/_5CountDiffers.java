package home.code.Hexlet.Module2.JavaMaps.Ispytaniya;

import java.util.*;

class App5 {
    public static Map<String, Object> genDiff(Map<String, Object> map1, Map<String, Object> map2) {
        if (map1.isEmpty() && map2.isEmpty()){
            return map1;
        }
        Map<String, Object> newMap = new LinkedHashMap<>();
        Map<String, Object> newMap1 = new LinkedHashMap<>();

        var entries1 = map1.entrySet();
        var entries2 = map2.entrySet();

        for (var entry1 : entries1) {
            for (var entry2 : entries2) {
                if ((entry1.getKey().equals(entry2.getKey())) && (entry1.getValue().equals(entry2.getValue()))) {
                    newMap.put(entry1.getKey(), "unchanged");
                } else if ((entry1.getKey().equals(entry2.getKey())) && !(entry1.getValue().equals(entry2.getValue()))) {
                    newMap.put(entry1.getKey(), "changed");
                }
            }
        }
        for (var entry2 : entries2) {
            if (!map1.containsKey(entry2.getKey()) || map1.isEmpty()) {
                newMap.put(entry2.getKey(), "added");
            }
        }
        for (var entry1 : entries1) {
            if (!map2.containsKey(entry1.getKey()) || map2.isEmpty()) {
                newMap.put(entry1.getKey(), "deleted");
            }
        }
        Set<String> keys = new TreeSet<>(newMap.keySet());
        for (String key : keys) {
            newMap1.put(key, newMap.get(key));
        }
        return newMap1;
    }
}

public class _5CountDiffers {
    public static void main(String[] args) {
        var data1 = new HashMap<String, Object>(
                Map.of("one", "eon", "two", "two", "four", true)
        );
//        System.out.println(data1); //=> {two=two, four=true, one=eon}

        var data2 = new HashMap<String, Object>(
                Map.of("two", "own", "zero", 4, "four", true)
        );
//        System.out.println(data2); //=> {zero=4, two=own, four=true}

        var result = App5.genDiff(data1, data2);
        System.out.println(result); //=> {four=unchanged, one=deleted, two=changed, zero=added}


        var data3 = new HashMap<String, Object>(
                Map.of("two", "own")
        );
//        System.out.println(data1); //=> {two=own}

        var data4 = new HashMap<String, Object>(
                Map.of()
        );
//        System.out.println(data2); //=> {}

        var result1 = App5.genDiff(data3, data4);
        System.out.println(result1); //=> {two=deleted}

    }
}
