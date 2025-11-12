import java.util.Random;

public class PartOne {
    public static void main(String[] args) {
        int [] dataPoints = new int [100];
        Random random = new Random();
        int total = 0;
        int min = 0;
        int max = 0;

        for (int i = 0; i < dataPoints.length; i++){
            dataPoints[i] = random.nextInt(100) + 1;
        }

        System.out.print("These are the random numbers: \n");
        for (int k = 0; k < dataPoints.length; k++){
            dataPoints[k] = random.nextInt(100) + 1;
            System.out.print(dataPoints[k] +" | ");
        }

        for (int k = 0; k < dataPoints.length; k++){
            dataPoints[k] = random.nextInt(100) + 1;
            System.out.print(dataPoints[k] +" | ");
            k >= min && k <= max);
        }
        //Sum of all the elements in dataPoints
        for (int j = 0; j < dataPoints.length; j++){
            total += j;
        }
        System.out.println("\nTotal: " + total);







    }

}
