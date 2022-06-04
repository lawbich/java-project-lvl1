package hexlet.code.games;

import hexlet.code.Utils;

public class Even {
    public static String description() {
        final String description = "Answer 'yes' if number even otherwise answer 'no'.";
        return description;
    }

    public static String[][] game() {
        final var rounds = 3;
        final String[][] questAnsw = new String[rounds][2];
        final var roundsNumber = 3;
        for (var i = 0; i < roundsNumber; i++) {
            var number = Utils.randomNumber();
            if (number % 2 == 0) {
                questAnsw[i][1] = "yes";
            } else {
                questAnsw[i][1] = "no";
            }
            questAnsw[i][0] = number + "";
        }
        return questAnsw;
    }
}
