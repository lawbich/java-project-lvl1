package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {

    private static String description = "What number is missing in the progression?";

    public static void game() {
        final String[][] questAnsw = new String[Engine.gameRounds][2];
        for (var i = 0; i < Engine.gameRounds; i++) {
            var array = new String[Utils.randomNumber(5, 10)];
            array[0] = Utils.randomNumber(100) + "";
            array = progressionGenerator(array);

            var randomNumber = Utils.randomNumber(0, array.length - 1);
            questAnsw[i][1] = array[randomNumber];
            array = progressionNumberHide(array, randomNumber);

            questAnsw[i][0] = String.join(" ", array);
        }
        Engine.run(description, questAnsw);
    }

    public static String[] progressionGenerator(String[] array) {
        int iteration = Utils.randomNumber(50);
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
