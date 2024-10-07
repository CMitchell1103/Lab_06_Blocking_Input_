import java.util.Scanner;

public class RectangleInfo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double width = 0;
        double height = 0;

        do {
            System.out.print("Enter the width of the rectangle: ");
            width = scanner.nextDouble();
            System.out.print("Enter the height of the rectangle: ");
            height = scanner.nextDouble();

            if (width < 0 && height < 0) {
                System.out.println("The width and height must be greater than 0.");
            }
        }while (width < 0 || height < 0);

        double area = width * height;
        double perimeter = 2 * (width + height);

        System.out.println("The area of the rectangle is " + area);
        System.out.println("The perimeter of the rectangle is " + perimeter);
    }


}
