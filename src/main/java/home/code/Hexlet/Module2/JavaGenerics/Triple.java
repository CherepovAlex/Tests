package home.code.Hexlet.Module2.JavaGenerics;

public interface Triple<L, M, R> {

    L getLeft();
    M getMiddle();
    R getRight();

    void setLeft(L left);
    void setMiddle(M middle);
    void setRight(R right);
}
