package home.code.Hexlet.Module2.JavaGenerics;

public class _1Box {
    Object value;

    public _1Box(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    public static void main(String[] args) {
        var box = new _1Box("word");
        var value2 = (String) box.getValue(); // word


        var box1 = new _1Box(10);
        var value1 = (Integer) box1.getValue(); // 10
    }
}
