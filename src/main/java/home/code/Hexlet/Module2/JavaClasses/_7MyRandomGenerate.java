package Hexlet.Module2.JavaClasses;

class MyRandom{
    static int MIN = 1;
    static int MAX = 100;

    public static int generate(){

        return (int)(Math.random() * 100 + 1);
    }
}

public class _7MyRandomGenerate {
    public static void main(String[] args) {
        System.out.println(MyRandom.generate());
    }

}
