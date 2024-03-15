import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[] dataPoints = new int[100];
        int sum = 0;
        double average;
        int maxVal = 0;
        int minVal = 100;
        int max = 100;
        int min = 1;
        int range = max - min + 1;

        for(int i = 0; i < dataPoints.length; i++){
            dataPoints[i] = (int)(Math.random() * range) + min; // Assign Array Values
        }

        for (int dataPoint : dataPoints) {
            System.out.print(dataPoint + " | "); // Output Array
        }
        average = ((double)sum / dataPoints.length); // Find Average
        System.out.println("");
        System.out.println("Sum: " + sum(dataPoints));
        System.out.println("Average: " + average);
        System.out.println("Max: " + max(dataPoints));
        System.out.println("Min: " + min(dataPoints));

        // Linear Search
        Scanner scan = new Scanner (System.in);
        int num = InputHelper.getRangedInt(scan, "Enter an int value [1-100]", 1, 100);
        System.out.println("Your value was found in the array: " + contains(dataPoints, num));
        System.out.println("Your value was found " + occurenceScan(dataPoints, num) + " times in the array.");
    }
    public static int min(int values[]){
        int min = 101;
        for(int i = 0; i < values.length; i++){
            if (values[i] <= min)
                min = values[i];
        }
        return min;
    }

    public static int max(int values[]){
        int max = 0;
        for(int i = 0; i < values.length; i++){
            if (values[i] >= max)
                max = values[i];
        }
        return max;
    }

    public static int occurenceScan(int values[], int target) {
        int count = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] == target)
                count++;
        }
        return count;
    }
    public static int sum(int values[]){
            int sum = 0;
            for(int i = 0; i < values.length; i++){
                sum += values[i];
            }
            return sum;
    }

    public static boolean contains(int values[], int target){
            for(int i = 0; i < values.length; i++){
                if(values[i] == target)
                    return true;
            }
            return false;
    }
}
