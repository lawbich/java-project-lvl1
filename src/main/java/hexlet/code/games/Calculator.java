package hexlet.code.games;

import java.util.Scanner;

public class Calculator {
    public static void game() {
        Scanner sc = new Scanner(System.in);
        System.out.println("May I have your name?");
        var name = sc.next();
        System.out.println("Hello, " + name + "!");
        System.out.println("What is the result of the expression?");
        final var gameRounds = 3;
        for (var i = 0; i <= gameRounds; i++) {
            if (i == gameRounds) {
                System.out.println("Congratulations, " + name + "!");
                break;
            }

            final var min = 0;
            final var max = 100;
            var number1 = (int) Math.round(Math.random() * (max - min) + min);
            var number2 = (int) Math.round(Math.random() * (max - min) + min);

            final var minOperand = 1;
            final var maxOperand = 3;
            var operand = (int) Math.round(Math.random() * (maxOperand - minOperand ) + minOperand);

            var result = 0;
            var operation = "";

            if (operand == 1) {
                operation = number1 + " * " + number2;
                result = number1 * number2;
            } else if (operand == 2) {
                operation = number1 + " + " + number2;
                result = number1 + number2;
            } else {
                operation = number1 + " - " + number2;
                result = number1 - number2;
            }

            var rightAnswer = result + "";
            var question = operation;

            Scanner scan = new Scanner(System.in);
            System.out.println("Question: " + question);
            var answer = scan.next();
            if (!answer.equals(rightAnswer)) {
                System.out.print("\'" + answer + "\'" + " is wrong answer ;(.");
                System.out.print("Correct answer was " + "\'" + rightAnswer + "\'" + ".");
                System.out.println("\nLet's try again, " + name + "!");
                break;
            } else {
                System.out.println("Correct!");
            }
        }
    }
}
