package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static final int ROUNDS = 3;
    public static void run(String description, String[][] questAnsw) {
        System.out.println("Welcome to the Brain Games!");
        Scanner sc = new Scanner(System.in);
        System.out.println("May I have your name?");
        var name = sc.next();
        System.out.println("Hello, " + name + "!" + "\n" + description);
        for (var i = 0; i <= ROUNDS; i++) {
            if (i == ROUNDS) {
                System.out.println("Congratulations, " + name + "!");
                return;
            }
            var question = questAnsw[i][0];
            var rightAnswer = questAnsw[i][1];
            System.out.println("Question: " + question);
            var answer = sc.next();
            if (!answer.equals(rightAnswer)) {
                System.out.print("\'" + answer + "\'" + " is wrong answer ;(.");
                System.out.print("Correct answer was " + "\'" + rightAnswer + "\'" + ".");
                System.out.println("\nLet's try again, " + name + "!");
                return;
            } else {
                System.out.println("Correct!");
            }
        }
    }
}
