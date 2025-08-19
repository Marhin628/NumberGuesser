import java.io.File;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the number guessing game!\nplease select the difficulty level!");
        System.out.println("1.easy(10 guesses)");
        System.out.println("2.medium(5 guesses)");
        System.out.println("3.hard(3 guesses)");
        Random random = new Random();
        int num = random.nextInt(1, 100);
        Scanner scanner = new Scanner(System.in);
        int choice;
        choice = scanner.nextInt();
        int guesses = 10;
        boolean game = true;
        boolean selectDiff = true;

        while (selectDiff) {
            switch (choice) {
                case 1 -> {
                    guesses = 10;
                    selectDiff = false;
                    System.out.println("you have chose the easy level!");
                }
                case 2 -> {
                    guesses = 5;
                    selectDiff = false;
                    System.out.println("you have chose the medium level!");

                }
                case 3 -> {
                    guesses = 3;
                    selectDiff = false;
                    System.out.println("you have chose the hard level!");

                }
                default -> {
                    System.out.println("invalid choice, try again");
                    choice = scanner.nextInt();
                }

            }
        }        System.out.println("lets start the game!");

        while (game) {
            if (guesses == 0) {
                game = false;
            }
            System.out.println("enter your guess!");
            choice = scanner.nextInt();
            if (choice > num) {
                System.out.println("too high try again!");
                guesses = guesses - 1;
            } else if (choice < num) {
                System.out.println("too low try again!");
                guesses = guesses - 1;
            } else if (choice == num) {
                System.out.println("you win!It took you " + guesses + " guesses!");
                guesses = 0;
            } else {
                System.out.println("try again");
            }

        }
        System.out.println("you ran out of guesses ;(");

    }

}


