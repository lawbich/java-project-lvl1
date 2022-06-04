package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calculator;
import hexlet.code.games.Gcd;
import hexlet.code.games.Progression;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter. \n1 - Greet \n2 - Even "
                + "\n3 - Calculator \n4 - GCD \n5 - Progression \n0 - Exit");
        var chose = scan.next();
        System.out.println("Your choice: " + chose);
        System.out.println("Welcome to the Brain Games!");
        switch (chose) {
            case "1":
                Cli.greeting();
                break;
            case "2":
                Engine.game(Even.description(), Even.game());
                break;
            case "3":
                Engine.game(Calculator.description(), Calculator.game());
                break;
            case "4":
                Engine.game(Gcd.description(), Gcd.game());
                break;
            case "5":
                Engine.game(Progression.description(), Progression.game());
            default:
                break;
        }
    }
}
