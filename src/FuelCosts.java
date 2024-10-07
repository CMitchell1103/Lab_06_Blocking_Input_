import java.util.Scanner;

public class FuelCosts {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double gallonsInTank = 0;
        double fuelEfficiency = 0;
        double pricePerGallon = 0;
        double costToDrive100Miles = 0;
        double distanceWithFullTank = 0;
        do {
            System.out.println("Enter the gallons in tank: ");
            gallonsInTank = scanner.nextDouble();

        }while (gallonsInTank <= 0);

        do {
            System.out.println("Enter the fuel efficiency in miles per gallon: ");
            fuelEfficiency = scanner.nextDouble();
        }while (fuelEfficiency <= 0);

        do {
            System.out.println("Enter the price per gallon: ");
            pricePerGallon = scanner.nextDouble();
        }while (pricePerGallon <= 0);

        costToDrive100Miles = (100/fuelEfficiency) * pricePerGallon;
        distanceWithFullTank = gallonsInTank * fuelEfficiency;

        System.out.println("The cost to drive 100 miles is:" + costToDrive100Miles);
        System.out.println("With a full tank of gas the car can travel:" + distanceWithFullTank);

        scanner.close();


    }






}
