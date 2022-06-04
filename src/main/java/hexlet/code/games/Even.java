package hexlet.code.games;

import hexlet.code.Utils;

public class Even {
    public static String description() {
        final String description = "Answer 'yes' if number even otherwise answer 'no'.";
        return description;
    }

    public static String[][] game() {
        final String[][] questAnsw = new String[3][2];
        for (var i = 0; i < 3; i++) {
            var number = Utils.randomNumber(0, 100);
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
