package home.code.Hexlet.Module2.JavaStreams.Ispytaniya;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class App9 {
    public static void play(int rolls, Supplier<Integer> rollDie) {
        Map<Integer, Long> map = IntStream.generate(rollDie::get)
                .boxed()
                .limit(rolls)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        IntStream.rangeClosed(1, 6)
                .forEach(i -> {
                    if (!map.containsKey(i)) {
                        map.put(i, 0L);
                    }
                });
        for (Map.Entry<Integer, Long> entry : map.entrySet()) {
            if (Math.toIntExact(entry.getValue()) == 0){
                System.out.printf("%d|%s\n", entry.getKey(), StringUtils.repeat('#', Math.toIntExact(entry.getValue())));
            } else {
                System.out.printf("%d|%s\n", entry.getKey(), StringUtils.repeat('#', Math.toIntExact(entry.getValue())) + " " + Math.toIntExact(entry.getValue()));
            }
        }
    }
}

public class _9HorHystogr {
    public static void main(String[] args) {

        Supplier<Integer> rollDie = () -> (int) (Math.random() * 6) + 1;

        App9.play(100, rollDie);
        // => 1|####################### 23
        //    2|################## 18
        //    3|############# 13
        //    4|#################### 20
        //    5|############ 12
        //    6|############## 14

        App9.play(13, rollDie);
        // => 1|
        //    2|## 2
        //    3|# 1
        //    4|## 2
        //    5|#### 4
        //    6|#### 4
    }
}
