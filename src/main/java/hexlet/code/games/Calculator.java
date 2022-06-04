package hexlet.code.games;

import hexlet.code.Utils;

public class Calculator {
    public static String description() {
        final String description = "What is the result of the expression?";
        return description;
    }

    public static String[][] game() {
        final String[][] questAnsw = new String[3][2];

        for (var i = 0; i < 3; i++) {
            var number1 = Utils.randomNumber(0, 100);
            var number2 = Utils.randomNumber(0, 100);
            var operand = Utils.randomNumber(1, 3);
            switch (operand) {
                case 1:
                    questAnsw[i][0] = number1 + " * " + number2;
                    questAnsw[i][1] = number1 * number2 + "";
                    break;
                case 2:
                    questAnsw[i][0] = number1 + " + " + number2;
                    questAnsw[i][1] = number1 + number2 + "";
                    break;
                case 3:
                    questAnsw[i][0] = number1 + " - " + number2;
                    questAnsw[i][1] = number1 - number2 + "";
                    break;
                default:
                    break;
            }
        }
        return questAnsw;
    }
}


