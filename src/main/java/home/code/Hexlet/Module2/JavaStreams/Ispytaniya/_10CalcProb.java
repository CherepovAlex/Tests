package home.code.Hexlet.Module2.JavaStreams.Ispytaniya;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class App10 {
    public static Map<Integer, Map<Integer, Double>> calculateProbabilities(List<Integer> list) {
        Map<Integer, Map<Integer, Integer>> megaMap = new HashMap<>();
        for (int i = 0; i < list.size() - 1; i++) {
            int current = list.get(i);
            int next = list.get(i + 1);
            megaMap.putIfAbsent(current, new HashMap<>());
            Map<Integer, Integer> nextCounts = megaMap.get(current);
            nextCounts.put(next, nextCounts.getOrDefault(next, 0) + 1);
            if (list.get(i + 1) == list.getLast()){
                megaMap.putIfAbsent(list.getLast(), new HashMap<>());
            }
        }

        Map<Integer, Map<Integer, Double>> probabilities = new HashMap<>();
        for (Map.Entry<Integer, Map<Integer, Integer>> entry : megaMap.entrySet()) {
            Integer key = entry.getKey();
            Map<Integer, Integer> nextCounts = entry.getValue();
            int totalCounts = nextCounts.values().stream().mapToInt(Integer::intValue).sum();
            if (totalCounts > 0) {
                Map<Integer, Double> probMap = new HashMap<>();
                for (Map.Entry<Integer, Integer> nextEntry : nextCounts.entrySet()) {
                    Integer nextKey = nextEntry.getKey();
                    Double probability = nextEntry.getValue() / (double) totalCounts;
                    probMap.put(nextKey, probability);
                }
                probabilities.put(key, probMap);
            } else {
                probabilities.put(key, new HashMap<>());
            }
        }
        return probabilities;
    }
}

public class _10CalcProb {
    public static void main(String[] args) {
        // Пустой список на входе
        Map<Integer, Map<Integer, Double>> result1 = App10.calculateProbabilities(new ArrayList<Integer>());
        System.out.println(result1); // => {}

        Map<Integer, Map<Integer, Double>> result2 = App10.calculateProbabilities(List.of(1, 3, 1, 5, 1, 2, 1, 6));
        System.out.println(result2);
        // => {1={2=0.25, 3=0.25, 5=0.25, 6=0.25}, 2={1=1.0}, 3={1=1.0}, 5={1=1.0}, 6={}}
    }
}
