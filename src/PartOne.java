public class PartOne {
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
            sum += dataPoint; // Find Sum
            if (dataPoint > maxVal) // Find Maximum Value
                maxVal = dataPoint;
            if (dataPoint < minVal) // Find Minimum Value
                minVal = dataPoint;
        }
        average = ((double)sum / dataPoints.length); // Find Average
        System.out.println("");
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Max: " + maxVal);
        System.out.println("Min: " + minVal);
    }
}
