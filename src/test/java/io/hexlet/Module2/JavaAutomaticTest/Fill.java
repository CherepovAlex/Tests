package io.hexlet.Module2.JavaAutomaticTest;

import java.util.ArrayList;
import java.util.List;

public class Fill {

    public static <T> void fill(List<T> coll, T element, int begin, int end) {
        // BEGIN (write your solution here)

        if (coll.isEmpty()) {
            System.out.println("List is empty.");
        }

        if (begin < 0 || end < 0) {
            System.out.println("Begin or End is negative.");
        }

        if (begin > coll.size()) {
            System.out.println("Nothing changes. Begin is not in range of List.");
        }

        if (!coll.isEmpty() && begin >= 0 && end >= 0 && end > begin) {
            for (int i = begin; i < Math.min(end, coll.size()); i++) {
                coll.set(i, element);
            }
        }

        // END
    }

    public static <T> void fill(List<T> coll, T element, int begin) {

        // BEGIN (write your solution here)

        if (coll.isEmpty()) {
            System.out.println("List is empty.");
        }

        if (begin < 0) {
            System.out.println("Begin or End is negative.");
        }

        if (begin > coll.size()) {
            System.out.println("Nothing changes. Begin is not in range of List.");
        }

        if (!coll.isEmpty() && begin > 0) {
            for (int i = begin; i < coll.size(); i++) {
                coll.set(i, element);
            }
        }

        // END
    }

    public static <T> void fill(List<T> coll, T element) {

        // BEGIN (write your solution here)

        if (coll.isEmpty()) {
            System.out.println("List is empty.");
        }

        if (!coll.isEmpty()) {
            for (int i = 0; i < coll.size(); i++) {
                coll.set(i, element);
            }
        }
        // END
    }
}
