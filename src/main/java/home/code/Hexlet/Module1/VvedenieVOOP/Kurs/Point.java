package Hexlet.Module1.VvedenieVOOP.Kurs;

class Point {
    private int coordinateX;
    private int coordinateY;

    Point(int x, int y) {
        this.coordinateX = x;
        this.coordinateY = y;
    }

    public int getX() {
        return coordinateX;
    }

    public int getY() {
        return coordinateY;
    }
}