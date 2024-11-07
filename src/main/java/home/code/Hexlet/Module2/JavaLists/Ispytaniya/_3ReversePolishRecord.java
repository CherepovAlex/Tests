package home.code.Hexlet.Module2.JavaLists.Ispytaniya;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class App3 {
    public static int calcInPolishNotation(String str) {
        List<String> arrayList = List.of(str.split(" "));
        System.out.println(arrayList);
        List<String> oper = new ArrayList<>();
        oper.add("+");oper.add("-");oper.add("*");oper.add("/");
        String choice;
        LinkedList<String> tempList = new LinkedList<>();
        int tempValueInt = 0;
        String tempValueStr1 = "";
        String tempValueStr2 = "";

        for (int i = 0; i < arrayList.size(); i++) {
            int x = 0;
            int y = 0;
            if (!oper.contains(arrayList.get(i))) {
                tempList.add(arrayList.get(i));
                continue;
            } else {
                choice = arrayList.get(i);
            }
            switch (choice) {
                case "+":
                    x = Integer.parseInt(tempList.pollLast());
                    y = Integer.parseInt(tempList.pollLast());
                    tempValueInt = y + x;
                    tempValueStr2 = tempValueStr1 + tempValueInt;
                    tempList.add(tempValueStr2);
                    break;
                case "-":
                    x = Integer.parseInt(tempList.pollLast());
                    y = Integer.parseInt(tempList.pollLast());
                    tempValueInt = y - x;
                    tempValueStr2 = tempValueStr1 + tempValueInt;
                    tempList.add(tempValueStr2);
                    break;
                case "*":
                    x = Integer.parseInt(tempList.pollLast());
                    y = Integer.parseInt(tempList.pollLast());
                    tempValueInt = y * x;
                    tempValueStr2 = tempValueStr1 + tempValueInt;
                    tempList.add(tempValueStr2);
                    break;
                case "/":
                    x = Integer.parseInt(tempList.pollLast());
                    y = Integer.parseInt(tempList.pollLast());
                    tempValueInt = y / x;
                    tempValueStr2 = tempValueStr1 + tempValueInt;
                    tempList.add(tempValueStr2);
                    break;
                default:
                    continue;
            }
        }
        return Integer.parseInt(tempList.pollLast());
    }
}

public class _3ReversePolishRecord {
    public static void main(String[] args) {
        System.out.println(App3.calcInPolishNotation("1 2 + 4 * 3 +")); // 15
        System.out.println(App3.calcInPolishNotation("7 2 3 * -")); // 1

    }
}
