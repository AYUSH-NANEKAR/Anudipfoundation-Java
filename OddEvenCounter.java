import java.util.Scanner;

public class OddEvenCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int evenCount = 0;
        int oddCount = 0;

        while (true) {
            System.out.print("Enter a number (-1 to stop): ");
            int number = scanner.nextInt();

            if (number == -1) {
                break; // Exit the loop if -1 is entered
            }

            if (number % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("\nTotal Even Numbers: " + evenCount);
        System.out.println("Total Odd Numbers : " + oddCount);

        scanner.close();
    }
}