package hexlet.code.games;

import java.util.Scanner;

public class Even {
    public static void game() {
        Scanner sc = new Scanner(System.in);
        System.out.println("May I have your name?");
        var name = sc.next();
        System.out.println("Hello, " + name + "!");
        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");
        final var gameRounds = 3;
        for (var i = 0; i <= gameRounds; i++) {
            if (i == gameRounds) {
                System.out.println("Congratulations, " + name + "!");
                break;
            }
            final var min = 0;
            final var max = 100;
            var number = Math.round(Math.random() * (max - min) + min);
            var rightAnswer = "";
            if (number % 2 == 0) {
                rightAnswer = "yes";
            } else {
                rightAnswer = "no";
            }

            var question = number + "";

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
