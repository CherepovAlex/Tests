package home.code.Hexlet.Module2.JavaLists.Ispytaniya;

import java.util.ArrayList;
import java.util.List;

class App4 {
    public static List<String> summaryRanges(List<Integer> list) {
        List<String> newList = new ArrayList<>();
        if (list.size() <= 1) {
            return newList;
        }
        int marker = 0;
        int change = 0;
        int newListMarker = 0;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) - list.get(i - 1) == 1) {
                newList.add(String.valueOf(list.get(i)));
                marker = i - 1;
                change = i - 1;
                break;
            } else {
                marker = list.size();
            }
        }

        for (int i = marker + 1; i < list.size(); i++) {
            if ((list.get(i) - list.get(i - 1) == 1)) {
                newList.set(newListMarker, list.get(change) + "->" + list.get(i));
            }
            if ((list.get(i) - list.get(i - 1) != 1) && (list.size() - 1) != i && !(list.get(i + 1) - list.get(i) != 1)) {
                newListMarker++;
                change = i;
                newList.add(String.valueOf(list.get(i)));
            }

        }
        return newList;
    }
}

public class _4NeprPosled {
    public static void main(String[] args) {
        var ranges1 = App4.summaryRanges(new ArrayList<Integer>());
        System.out.println(ranges1); // => []

        var ranges2 = App4.summaryRanges(List.of(1));
        System.out.println(ranges2); // []

        var ranges3 = App4.summaryRanges(List.of(1, 2, 3));
        System.out.println(ranges3); // [1->3]

        var ranges6 = App4.summaryRanges(List.of(8, 3, 1, 12, 2, 5));
        System.out.println(ranges6); // []

        var ranges4 = App4.summaryRanges(List.of(0, 1, 2, 4, 5, 7));
        System.out.println(ranges4); // [0->2, 4->5]

        var ranges5 = App4.summaryRanges(List.of(110, 111, 112, 111, -5, -4, -2, -3, -4, -5));
        System.out.println(ranges5); // [110->112, -5->-4]

        var ranges7 = App4.summaryRanges(List.of(8, 3, 1, 2, 3));
        System.out.println(ranges7); // []
    }
}
