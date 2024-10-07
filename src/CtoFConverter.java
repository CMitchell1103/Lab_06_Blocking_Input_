import java.util.Scanner;

public class CtoFConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean done = true;
        String trash = "";
        do {
            System.out.print("Enter the celsius temperature: ");
            if (scanner.hasNextDouble()) {
                double celsius = scanner.nextDouble();
                double fahrenheit = celsius * 1.8 + 32;
                System.out.print("The temperature in fahrenheit: " + fahrenheit);

            } else {
                trash = scanner.nextLine();
                System.out.println("You said the celsius temperature was:" + trash );
                System.out.print("Please enter a valid temperature");



                done = false;
            }


        } while (!done);
        scanner.next();
    }

}





















