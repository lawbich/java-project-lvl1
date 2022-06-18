package hexlet.code.games;

import hexlet.code.Utils;
import hexlet.code.Engine;

public class Prime {

    private static String description = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void game() {
        final String[][] questAnsw = new String[Engine.ROUNDS][2];
        for (var i = 0; i < Engine.ROUNDS; i++) {
            final int rangeBoundary = 100;
            var number = Utils.randomNumber(rangeBoundary);
            questAnsw[i][0] = number + "";
            questAnsw[i][1] = isPrime(number) ? "yes" : "no";
        }
        Engine.run(description, questAnsw);
    }

    public static boolean isPrime(int number) {
        final var exception1 = 2;
        final var exception2 = 3;
        var result = "";
        if (number == exception1 || number == exception2) {
            result = "yes";
        } else if (number == 1) {
            result = "no";
        } else {
            for (var j = 2; j <= Math.sqrt(number); j++) {
                if (number % j == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
