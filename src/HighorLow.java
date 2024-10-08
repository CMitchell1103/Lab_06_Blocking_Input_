import java.util.Random;
import java.util.Scanner;

public class HighorLow {

    public static void main(String[] args) {

        Random generator = new Random();
        int val = generator.nextInt(10)+1;
        Scanner scanner = new Scanner(System.in);
        int usersGuess = 0;
        boolean done = false;
        System.out.print("Guess a number between 1 and 10: ");
        usersGuess = scanner.nextInt();

        if (usersGuess < 1 || usersGuess > 10) {
            System.out.print("Your answer was invalid, please enter a number between 1 and 10: ");
            usersGuess = scanner.nextInt();
        }

        {

            if (usersGuess == val) {
                System.out.print("Your guess was on the money!");
                System.out.print("The answer was:" + val);
                done = true;
            } else if (usersGuess > val) {
                System.out.print("Your guess was to high!");
                System.out.print("The answer was:" + val);

                done= true;
            } else {
                System.out.print("Your guess was to low!");
                System.out.print("The answer was:" + val);

                done = true;
            }
            scanner.close();


        }




    }

}
