package hexlet.code;

public class Utils {
    public static int randomNumber() {
        final int rangeMax = 100;
        final int rangeMin = 0;
        var number = (int) Math.round(Math.random() * (rangeMax - rangeMin) + rangeMin);
        return number;
    }
    public static int randomOperandNumber() {
        final int rangeMax = 3;
        final int rangeMin = 1;
        var number = (int) Math.round(Math.random() * (rangeMax - rangeMin) + rangeMin);
        return number;
    }

    public static int randomArrayLength() {
        final int rangeMax = 10;
        final int rangeMin = 5;
        var number = (int) Math.round(Math.random() * (rangeMax - rangeMin) + rangeMin);
        return number;
    }
}
