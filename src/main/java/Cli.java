import java.util.Scanner;

public class Cli {
    public static void greeting() {
        Scanner sc = new Scanner(System.in);
        System.out.println("May I have your name?");
        var name = sc.next();
        System.out.println("Hello, " + name + "!");
    }
}
