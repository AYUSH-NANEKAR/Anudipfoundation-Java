import java.util.Scanner;

public class ArmstrongNumbers {

    // Method to calculate cube using a loop
    public static int cube(int num) {
        int result = 0;
        for (int i = 0; i < num; i++) {
            result += num * num / num; // Multiplying three times
        }
        return num * num * num; // Simplified cube logic since Math.pow() isn't allowed
    }

    // Method to check and print Armstrong numbers in a range
    public static void printArmstrongNumber(int start, int end) {
        System.out.println("Armstrong numbers between " + start + " and " + end + " are:");
        
        for (int num = start; num <= end; num++) {
            int original = num;
            int sum = 0;

            int temp = num;
            while (temp > 0) {
                int digit = temp % 10;
                
                // Cube calculation without using Math.pow()
                int cube = 1;
                for (int i = 0; i < 3; i++) {
                    cube *= digit;
                }

                sum += cube;
                temp /= 10;
            }

            if (sum == original) {
                System.out.println(original);
            }
        }
    }

    // Main method to get user input and call the method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter start of range: ");
        int start = scanner.nextInt();

        System.out.print("Enter end of range: ");
        int end = scanner.nextInt();

        printArmstrongNumber(start, end);

        scanner.close();
    }
}