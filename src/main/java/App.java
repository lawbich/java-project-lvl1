import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter. \n1 - Greet \n0 - Exit");
        var chose = scan.next();
        System.out.println("Your choice: " + chose);
        System.out.println("Welcome to the Brain Games!");
        Cli.greeting();
    }
}
