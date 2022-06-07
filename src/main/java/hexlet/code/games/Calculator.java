package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calculator {
    private static String description = "What is the result of the expression?";

    public static void game() {
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
        Engine.run(description, questAnsw);
    }
}


