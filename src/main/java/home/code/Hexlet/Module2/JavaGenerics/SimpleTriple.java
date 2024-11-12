package home.code.Hexlet.Module2.JavaGenerics;

import java.util.Objects;

public class SimpleTriple<L, M, R> implements Triple<L, M, R> {
    private L left;
    private M middle;
    private R right;
    SimpleTriple(L left, M middle, R right) {
        this.left = left;
        this.middle = middle;
        this.right = right;
    }
    public L getLeft() { return left;}
    public M getMiddle() {return middle;}
    public R getRight() {return right;}
    public void setLeft(L left) {this.left = left;}
    public void setMiddle(M middle) {this.middle = middle;}
    public void setRight(R right) {this.right = right;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SimpleTriple<?, ?, ?> that = (SimpleTriple<?, ?, ?>) o;
        return Objects.equals(left, that.left) && Objects.equals(middle, that.middle) && Objects.equals(right, that.right);
    }
    @Override
    public int hashCode() {return Objects.hash(left, middle, right);}

    // BEGIN (write your solution here)
    public SimpleTriple<L, M, R> reverse() {
        return (SimpleTriple<L, M, R>) new SimpleTriple<R, M, L>(getRight(), getMiddle(), getLeft());
    }

    public Boolean isEqualTo(SimpleTriple<L, M, R> st){
        return this.equals(st);
    }

    public static void main(String[] args) {
        var triple = new SimpleTriple("str", 1, true);

        var reversed = triple.reverse();

        System.out.println(reversed.getLeft()); // true
        System.out.println(reversed.getMiddle()); // 1
        System.out.println(reversed.getRight()); // str

        var triple1 = new SimpleTriple<>(1, "s", true);
        var triple2 = new SimpleTriple<>(1, "s", true);
        var triple3 = new SimpleTriple<>(1, "str", true);

        System.out.println(triple1.isEqualTo(triple2));
        System.out.println(triple1.isEqualTo(triple3));
    }
    // END
}