package hexlet.code;

import hexlet.code.games.Even;

import hexlet.code.games.Calculator;

import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter. \n1 - Greet \n2 - Even \n3 - Calculator \n0 - Exit");
        var chose = scan.next();
        System.out.println("Your choice: " + chose);
        System.out.println("Welcome to the Brain Games!");
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
            default:
                break;
        }


    }
}
