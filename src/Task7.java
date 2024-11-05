import java.util.Random;
import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {
        int[] dataPoints = new int[100];
        Random rnd = new Random();




        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rnd.nextInt(100) + 1;
            System.out.print(dataPoints[i] + (i < dataPoints.length - 1 ? " | " : ""));
        }
        System.out.println();

        Scanner scanner = new Scanner(System.in);


        int userValue1 = SafeInput.getRangedInt(scanner, "Please enter a value between 1 and 100", 1, 100);
        int count = 0;
        for (int value : dataPoints) {


            if (value == userValue1) count++;
        }
        System.out.println("The value " + userValue1 + " was found " + count + " time(s).");

        int userValue2 = SafeInput.getRangedInt(scanner, "Please enter another value between 1 and 100", 1, 100);
        boolean found = false;
        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == userValue2) {
                System.out.println("The value " + userValue2 + " was found at array index " + i + ".");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("The value " + userValue2 + " was not found.");
        }
        scanner.close();
    }
}
