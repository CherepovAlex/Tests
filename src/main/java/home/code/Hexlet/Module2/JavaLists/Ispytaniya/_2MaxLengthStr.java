package home.code.Hexlet.Module2.JavaLists.Ispytaniya;

import java.util.ArrayList;
import java.util.List;

class App2 {
    public static int getLongestLength(String str) {
        char[] chars = str.toCharArray();
        int max = 0;
        int maxLength = 0;
        int j = 0;

        List<Character> list1 = new ArrayList<>();
        for (int i = 0; i < chars.length; i++) {
            if (!list1.contains(chars[i])) {
                list1.add(chars[i]);
                maxLength = list1.size();
            } else {
                j++;
                i = j - 1;
                list1.removeAll(list1);
            }
            if (max < maxLength) {
                max = maxLength;
            }
        }
        return max;
    }
}

public class _2MaxLengthStr {
    public static void main(String[] args) {
        System.out.println(App2.getLongestLength("jabjcdel")); // 7

        System.out.println(App2.getLongestLength("abcddef")); // 4

        System.out.println(App2.getLongestLength("abbccddeffg")); // 3

        System.out.println(App2.getLongestLength("abcd")); // 4

        System.out.println(App2.getLongestLength("1234561qweqwer")); // 9

        System.out.println(App2.getLongestLength("1234561qweqwerqer")); // 9

        System.out.println(App2.getLongestLength("abcdeef")); // 5

        System.out.println(App2.getLongestLength("")); // 0

        System.out.println(App2.getLongestLength("jabjcdeljrshmgdhj")); // 10
    }
}
