package home.code.Hexlet.Module2.JavaLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class App7 {
    public static boolean isBracketsBalanced(String str) {
        char[] chars = str.toCharArray();
        LinkedList<String> listCheck = new LinkedList<>();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(') {
                listCheck.addLast(String.valueOf(chars[i]));
            } else if (chars[i] == ')') {
                if (!listCheck.isEmpty()) {
                    listCheck.pollLast();
                } else {
                    return false;
                }
            }
        }
        if (listCheck.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

}

public class _7BalanceBraces {
    public static void main(String[] args) {
        System.out.println(App7.isBracketsBalanced("")); // true
        System.out.println(App7.isBracketsBalanced("()")); // true
        System.out.println(App7.isBracketsBalanced("()()")); // true
        System.out.println(App7.isBracketsBalanced("(()())")); // true

        System.out.println(App7.isBracketsBalanced("(()")); // false
        System.out.println(App7.isBracketsBalanced("())")); // false
        System.out.println(App7.isBracketsBalanced(")(")); // false

    }
}
