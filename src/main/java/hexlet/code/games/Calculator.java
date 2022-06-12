package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calculator {
    private static String description = "What is the result of the expression?";

    public static void game() {
        final String[][] questAnsw = new String[Engine.gameRounds][2];
        for (var i = 0; i < Engine.gameRounds; i++) {
            var number1 = Utils.randomNumber(100);
            var number2 = Utils.randomNumber(100);
            var operand = Utils.randomNumber(3) + "";
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


