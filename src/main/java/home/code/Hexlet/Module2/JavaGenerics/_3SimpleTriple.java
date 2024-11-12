package home.code.Hexlet.Module2.JavaGenerics;

public class _3SimpleTriple<L, M, R> implements Triple {
    L left;
    M middle;
    R right;

    public _3SimpleTriple(L left, M middle, R right) {
        this.left = left;
        this.middle = middle;
        this.right = right;
    }

    @Override
    public Object getLeft() {
        return this.left;
    }

    @Override
    public Object getMiddle() {
        return this.middle;
    }

    @Override
    public Object getRight() {
        return this.right;
    }

    @Override
    public void setLeft(Object left) {

    }

    @Override
    public void setMiddle(Object middle) {

    }

    @Override
    public void setRight(Object right) {

    }

    public static void main(String[] args) {
        var triple = new _3SimpleTriple("str", 1, true);

        System.out.println(triple.getLeft()); // str
        System.out.println(triple.getRight()); // true
        System.out.println(triple.getMiddle()); // 1

    }
}
