package home.code.Hexlet.Module1.VvedenieVOOP.Kurs;

class App{
    public static Point getNewPoint(){
        return new Point(5, 10);
    }
}

public class _2NewPoint {
    public static void main(String[] args) {
        var point = App.getNewPoint();
        System.out.println(point.getX());
        System.out.println(point.getY());
    }
}
