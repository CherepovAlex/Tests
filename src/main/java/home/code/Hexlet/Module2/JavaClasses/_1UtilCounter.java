package home.code.Hexlet.Module2.JavaClasses;

import org.apache.commons.lang3.StringUtils;

class TextUtils {

    public static int getWordsCount(String text) {
        int count = 0;
        String[] str = StringUtils.split(text, " ");
        return str.length;
    }
}

public class _1UtilCounter {
    public static void main(String[] args) {

        System.out.println(TextUtils.getWordsCount("")); // 0
        System.out.println(TextUtils.getWordsCount("man in BlacK")); // 3
        System.out.println(TextUtils.getWordsCount("  hello, world!  ")); // 2

    }

}
