package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Gcd {

    private static String description = "Find the greatest common divisor of given numbers.";

    public static void game() {
        final var rounds = 3;
        final String[][] questAnsw = new String[rounds][2];
        final var roundsNumber = 3;
        for (var i = 0; i < roundsNumber; i++) {
            var number1 = Utils.randomNumber();
            var number2 = Utils.randomNumber();

            questAnsw[i][0] = number1 + " " + number2;

            while (number1 != 0 && number2 != 0) {
                if (number1 > number2) {
                    number1 = number1 % number2;
                } else {
                    number2 = number2 % number1;
                }
            }
            questAnsw[i][1] = number1 + number2 + "";
        }
        Engine.run(description, questAnsw);
    }
}
