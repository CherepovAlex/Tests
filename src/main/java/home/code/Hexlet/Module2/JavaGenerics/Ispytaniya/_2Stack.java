package home.code.Hexlet.Module2.JavaGenerics.Ispytaniya;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class _2Stack<T> {
    ArrayList<T> newArrayList = new ArrayList<>();

    public T push(T element) {
        ArrayList<T> arrayList = new ArrayList<>();
        arrayList.add(element);
        newArrayList.addAll(arrayList);
        return newArrayList.getLast();
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        } else {
            T temp = newArrayList.getLast();
            newArrayList.removeLast();
            return temp;
        }
    }

    public T peek() {
        if (newArrayList.isEmpty()) {
            throw new EmptyStackException();
        }
        return newArrayList.getLast();
    }

    public Boolean isEmpty() {
        return newArrayList.isEmpty();
    }

    public static void main(String[] args) {
        var stack = new _2Stack<String>();

        System.out.println(stack.isEmpty()); // true
        System.out.println();
        stack.push("a"); // a
        System.out.println(stack.isEmpty()); // false
        System.out.println(stack);
        System.out.println();
        stack.push("b"); // b
        System.out.println(stack);
        System.out.println(stack.peek()); // b
        System.out.println();
        System.out.println(stack.pop()); // b
        System.out.println(stack);
        System.out.println(stack.pop()); // a
        System.out.println(stack.isEmpty()); // true

        // Стек уже пуст
        stack.pop(); // Exception
    }
}
