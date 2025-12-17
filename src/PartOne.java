import java.util.Random;
import java.util.Scanner;

public class PartOne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        int[] dataPoints = new int[100];

        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rand.nextInt(100) + 1;
        }

        System.out.println("Data Points:");
        for (int i = 0; i < dataPoints.length; i++) {
            System.out.print(dataPoints[i]);
            if (i < dataPoints.length - 1) {
                System.out.print(" | ");
            }
        }
        System.out.println("\n");


        int sum = 0;
        int min = dataPoints[0];
        int max = dataPoints[0];

        for (int value : dataPoints) {
            sum += value;

            if (value < min)
                min = value;

            if (value > max)
                max = value;
        }

        double average = sum / 100.0;

        System.out.println("Sum of all values: " + sum);
        System.out.println("Average value: " + average);
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
        System.out.println();

        int searchValue = InputHelper.getRangedInt(
                scan,
                "Enter a value between 1 and 100 to count:",
                1,
                100
        );

        int count = 0;
        for (int value : dataPoints) {
            if (value == searchValue) {
                count++;
            }
        }

        System.out.println("The value " + searchValue + " appears " + count + " time(s) in the array.");
        System.out.println();

        int searchValue2 = InputHelper.getRangedInt(
                scan,
                "Enter another value between 1 and 100 to search for:",
                1,
                100
        );

        int position = -1;

        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == searchValue2) {
                position = i;
                break;
            }
        }

        if (position == -1) {
            System.out.println("The value: " + searchValue2 + " was NOT found in the array.");
        } else {
            System.out.println("The value: " + searchValue2 + " was found at array index " + position + ".");
        }

        scan.close();
    }
}