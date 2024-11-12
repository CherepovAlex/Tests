package home.code.Hexlet.Module2.JavaGenerics;

import java.util.ArrayList;
import java.util.List;

public class _4ListUtils<T> {
    public <T> ArrayList<T> merge(ArrayList<T> listT, ArrayList<T> listS) {
        ArrayList<T> listAll = new ArrayList<>();
        listAll.addAll(listT);
        listAll.addAll(listS);
        return listAll;
    }

    public static void main(String[] args) {
        var util = new _4ListUtils<Integer>();

        var coll1 = new ArrayList<>(List.of(1, 2, 3));
        var coll2 = new ArrayList<>(List.of(3, 4, 5));

        var result = util.merge(coll1, coll2);
        System.out.println(result); // [1, 2, 3, 3, 4, 5]

        var util2 = new _4ListUtils<String>();

        var coll3 = new ArrayList<>(List.of("privet", "poka", "ok"));
        var coll4 = new ArrayList<>(List.of("ok", "one", "two"));

        var result1 = util.merge(coll3, coll4);
        System.out.println(result1); // ["privet", "poka", "ok", "ok", "one", "two"]

    }
}
