package hexlet.code.games;

import hexlet.code.Utils;

public class Calculator {
    public static String description() {
        final String description = "What is the result of the expression?";
        return description;
    }

    public static String[][] game() {
        final var rounds = 3;
        final String[][] questAnsw = new String[rounds][2];
        final var roundsNumber = 3;
        for (var i = 0; i < roundsNumber; i++) {
            var number1 = Utils.randomNumber();
            var number2 = Utils.randomNumber();
            var operand = Utils.randomOperandNumber() + "";
            switch (operand) {
                case "1":
                    questAnsw[i][0] = number1 + " * " + number2;
                    questAnsw[i][1] = number1 * number2 + "";
                    break;
                case "2":
                    questAnsw[i][0] = number1 + " + " + number2;
                    questAnsw[i][1] = number1 + number2 + "";
                    break;
                case "3":
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


