package home.code.Hexlet.Module2.JavaMaps;

import java.util.HashMap;

public class _3CountWords {
    public static void main(String[] args) {

        var text = "one two three two one one four";
        // Разбивает строку на части по разделителю
        var words = text.split(" ");
        System.out.println(words);
        // инициализировать HashMap в который мы будем складывать слова и частоту их употребления
        var wordsFrequency = new HashMap<String, Integer>();
        //Обойти список слов и добавить их в HashMap, в котором ключом будет само слово,
        // а значением количество упоминаний.
        for (var word : words) {
            if (wordsFrequency.containsKey(word)) {
                //нужно текущее значение увеличивать на единицу
                var count = wordsFrequency.get(word);
                wordsFrequency.put(word, count + 1);
            } else {
                //Если ключ встречается первый раз, то значением будет единица,
                wordsFrequency.put(word, 1);
            }
        }
        //упростить так, что в нем не будет условных конструкций
        //если такого ключа нет, то добавляет по умолячанию второй параметр
//        for (var word : words) {
//            var count = wordsFrequency.getOrDefault(word, 0);
//            wordsFrequency.put(word, count + 1);
//          }

        System.out.println(wordsFrequency);
        // => {four=1, one=3, two=2, three=1}

    }
}
