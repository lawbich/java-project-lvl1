package hexlet.code;

public class Utils {
    public static int randomNumber(int rangeMin, int rangeMax) {
        var number = (int) Math.round(Math.random() * (rangeMax - rangeMin) + rangeMin);
        return number;
    }

    public static int randomNumber(int rangeMax) {
        final int rangeMin = 1;
        var number = (int) Math.round(Math.random() * (rangeMax - rangeMin) + rangeMin);
        return number;
    }
}

