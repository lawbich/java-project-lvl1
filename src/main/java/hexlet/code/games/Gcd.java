package hexlet.code.games;

import hexlet.code.Utils;

public class Gcd {
    public static String description() {
        final String description = "Find the greatest common divisor of given numbers.";
        return description;
    }

    public static String[][] game() {
        final String[][] questAnsw = new String[3][2];
        for (var i = 0; i < 3; i++) {
            var number1 = Utils.randomNumber(0, 100);
            var number2 = Utils.randomNumber(0, 100);

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
        return questAnsw;
    }
}
