package home.code.Hexlet.Module2.JavaGenerics.Ispytaniya;

import java.util.*;
import home.code.Hexlet.Module2.JavaGenerics.Ispytaniya.model.*;

public class _3PairUtils {

    public static <L, R> Map<L, R> fromPairs(List<Pair<L, R>> list) {
        var newMap = new HashMap<L, R>();
        for (var pairs: list){
            newMap.put(pairs.getLeft(), pairs.getRight());
        }
        return newMap;
    }

    public static <L, R> List<Pair<L, R>> toPairs(Map<L, R> map) {
        var newMap = new LinkedHashMap<>(map);
        var newList = new ArrayList<Pair<L, R>>();
        var entries = newMap.entrySet();
        for(var entry: entries){
            newList.add(new SimplePair<>(entry.getKey(), entry.getValue()));
        }
        return newList;
    }

    public static void main(String[] args) {

        List<Pair<String, Integer>> coll = List.of(
                new SimplePair<>("a", 1),
                new SimplePair<>("b", 2)
        );

        var result = _3PairUtils.fromPairs(coll);
        System.out.println(result); // => {a=1, b=2}

        Map<String, Integer> data = new LinkedHashMap<>();
        data.put("a", 1);
        data.put("b", 2);

        var result1 = _3PairUtils.toPairs(data);
        System.out.println(result1); // => [SimplePair(left=a, right=1), SimplePair(left=b, right=2)]
    }
}
