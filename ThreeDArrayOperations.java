import java.util.Random;

public class ThreeDArrayOperations {
    public static void main(String[] args) {
        int[][][] array = new int[3][3][3]; // 3x3x3 3D array
        Random rand = new Random();

        int max = Integer.MIN_VALUE;
        int sum = 0;
        int count = 0;

        // Initialize array with random values and find max + sum
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    array[i][j][k] = rand.nextInt(100); // random value [0–99]
                    int val = array[i][j][k];

                    // Update max and sum
                    if (val > max) {
                        max = val;
                    }
                    sum += val;
                    count++;
                }
            }
        }

        // Display the 3D array
        System.out.println("3D Array Elements:");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Layer " + (i + 1) + ":");
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    System.out.print(array[i][j][k] + "\t");
                }
                System.out.println();
            }
            System.out.println();
        }

        // Output max and average
        double average = (double) sum / count;
        System.out.println("Maximum Value: " + max);
        System.out.println("Average Value: " + average);
    }
}