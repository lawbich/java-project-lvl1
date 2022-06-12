package hexlet.code.games;

import hexlet.code.Utils;
import hexlet.code.Engine;

public class Even {

    private static String description = "Answer 'yes' if number even otherwise answer 'no'.";

    public static void game() {
        final var rounds = 3;
        final String[][] questAnsw = new String[rounds][2];
        for (var i = 0; i < Engine.ROUNDS; i++) {
            final int rangeBoundary = 100;
            var number = Utils.randomNumber(rangeBoundary);
            if (number % 2 == 0) {
                questAnsw[i][1] = "yes";
            } else {
                questAnsw[i][1] = "no";
            }
            questAnsw[i][0] = number + "";
        }
        Engine.run(description, questAnsw);
    }
}
