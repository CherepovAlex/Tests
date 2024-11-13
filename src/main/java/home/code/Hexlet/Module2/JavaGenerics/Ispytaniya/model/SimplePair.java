package home.code.Hexlet.Module2.JavaGenerics.Ispytaniya.model;

public final class SimplePair<L, R> implements Pair<L, R> {

    private L left;
    private R right;

    public L getLeft() {
        return left;
    }

    public R getRight() {
        return right;
    }

    public SimplePair(L left, R right) {
        this.right = right;
        this.left = left;
    }

    @Override
    public String toString() {
        return "SimplePair{" +
                "left=" + left +
                ", right=" + right +
                '}';
    }
}