package Hexlet.Module1.VvedenieVOOP.Kurs;

class App7 {
    public static Double calculateAverage(Integer[] intArray) {
        var intAverage = 0.0;
        if (intArray.length != 0) {
            for (Integer el : intArray) {
                if (el != null) {
                    intAverage += el;
                } else {
                    return null;
                }
            }
        } else {
            return null;
        }
        return intAverage / intArray.length;
    }
}

public class _7CalcAverage {
    public static void main(String[] args) {
        System.out.println(App7.calculateAverage(new Integer[]{1, 2, 3, 4})); // 2.5
        System.out.println(App7.calculateAverage(new Integer[]{})); // null
        System.out.println(App7.calculateAverage(new Integer[]{null})); // null
        System.out.println(App7.calculateAverage(new Integer[]{1, null, 3})); // null
    }
}
