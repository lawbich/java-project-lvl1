package hexlet.code.games;

import hexlet.code.Utils;

public class Prime {
    public static String description() {
        final String description = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        return description;
    }

    public static String[][] game() {
        final var rounds = 3;
        final String[][] questAnsw = new String[rounds][2];
        final var roundsNumber = 3;
        for (var i = 0; i < roundsNumber; i++) {
            var number = Utils.randomNumber();
            questAnsw[i][0] = number + "";

            final var exception1 = 2;
            final var exception2 = 3;
            if (number == exception1 || number == exception2) {
                questAnsw[i][1] = "yes";
            } else if (number == 1) {
                questAnsw[i][1] = "no";
            } else {
                for (var j = 2; j <= Math.sqrt(number); j++) {
                    if (number % j == 0) {
                        questAnsw[i][1] = "no";
                        break;
                    } else {
                        questAnsw[i][1] = "yes";
                    }
                }
            }
        }
        return questAnsw;
    }
}
