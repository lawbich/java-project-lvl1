package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {

    private static String description = "What number is missing in the progression?";

    public static void game() {
        final String[][] questAnsw = new String[Engine.ROUNDS][2];
        for (var i = 0; i < Engine.ROUNDS; i++) {

            final int arrayLengthStart = 5;
            final int arrayLengthBoundary = 10;
            var length = Utils.randomNumber(arrayLengthStart, arrayLengthBoundary);

            final int rangeBoundary = 100;
            var startNumber = Utils.randomNumber(rangeBoundary);

            final int iterationRangeBoundary = 50;
            var iteration = Utils.randomNumber(iterationRangeBoundary);

            var array = progressionGenerator(startNumber, length, iteration);

            var randomNumber = Utils.randomNumber(0, array.length - 1);
            questAnsw[i][1] = array[randomNumber];
            array = progressionNumberHide(array, randomNumber);

            questAnsw[i][0] = String.join(" ", array);
        }
        Engine.run(description, questAnsw);
    }

    public static String[] progressionGenerator(int startNumber, int length, int iteration) {
        var array = new String[length];
        array[0] = startNumber + "";
        for (var j = 0; j < array.length - 1; j++) {
            array[j + 1] = (Integer.parseInt(array[j]) + iteration) + "";
        }
        return array;
    }

    public static String[] progressionNumberHide(String[] array, int number) {
        array[number] = "..";
        return array;
    }
}
