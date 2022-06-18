package hexlet.code;
import hexlet.code.games.Even;
import hexlet.code.games.Calculator;
import hexlet.code.games.Gcd;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet" + "\n2 - Even" + "\n3 - Calculator" + "\n4 - GCD");
        System.out.println("5 - Progression" + "\n6 - Prime" + "\n0 - Exit");
        var chose = scan.next();
        System.out.println("Your choice: " + chose);
        switch (chose) {
            case "1":
                Cli.greeting();
                break;
            case "2":
                Even.game();
                break;
            case "3":
                Calculator.game();
                break;
            case "4":
                Gcd.game();
                break;
            case "5":
                Progression.game();
                break;
            case "6":
                Prime.game();
                break;
            default:
                break;
        }
    }
}
