package hexlet.code.games;

import hexlet.code.Utils;

public class Progression {

    public static final String description = "What number is missing in the progression?";

    public static String[][] game() {
        final var rounds = 3;
        final String[][] questAnsw = new String[rounds][2];
        final var roundsNumber = 3;
        for (var i = 0; i < roundsNumber; i++) {
            var array = new String[Utils.randomArrayLength()];
            array[0] = Utils.randomNumber() + "";
            int iteration = Utils.randomNumber();
            for (var j = 0; j < array.length - 1; j++) {
                array[j + 1] = (Integer.parseInt(array[j]) + iteration) + "";
            }
            var rangeMax = array.length - 1;
            var rangeMin = 0;
            var randomSymbol = (int) Math.round(Math.random() * (rangeMax - rangeMin) + rangeMin);
            questAnsw[i][1] = array[randomSymbol];
            array[randomSymbol] = "..";

            questAnsw[i][0] = String.join(" ", array);
        }
        return questAnsw;
    }
}
