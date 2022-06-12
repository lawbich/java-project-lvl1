package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Gcd {

    private static String description = "Find the greatest common divisor of given numbers.";

    public static void game() {
        final String[][] questAnsw = new String[Engine.gameRounds][2];
        for (var i = 0; i < Engine.gameRounds; i++) {
            var number1 = Utils.randomNumber(100);
            var number2 = Utils.randomNumber(100);

            questAnsw[i][0] = number1 + " " + number2;

            int Gcd = GcdFinding(number1, number2);

            questAnsw[i][1] = Gcd + "";
        }
        Engine.run(description, questAnsw);
    }

    public static int GcdFinding(int number1, int number2) {
        while (number1 != 0 && number2 != 0) {
            if (number1 > number2) {
                number1 = number1 % number2;
            } else {
                number2 = number2 % number1;
            }
        }
        return number1 + number2;
    }
}
