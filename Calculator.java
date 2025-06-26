import java.util.Scanner;

public class Calculator {

    // Method 1: adds two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method 2: adds three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method 3: adds two doubles
    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner scanner = new Scanner(System.in);

        // Integer addition with 2 numbers
        System.out.print("Enter two integers to add: ");
        int int1 = scanner.nextInt();
        int int2 = scanner.nextInt();
        int sumTwoInts = calc.add(int1, int2);
        System.out.println("Sum of two integers: " + sumTwoInts);

        // Integer addition with 3 numbers
        System.out.print("Enter three integers to add: ");
        int int3 = scanner.nextInt();
        int int4 = scanner.nextInt();
        int int5 = scanner.nextInt();
        int sumThreeInts = calc.add(int3, int4, int5);
        System.out.println("Sum of three integers: " + sumThreeInts);

        // Double addition
        System.out.print("Enter two double values to add: ");
        double double1 = scanner.nextDouble();
        double double2 = scanner.nextDouble();
        double sumDoubles = calc.add(double1, double2);
        System.out.println("Sum of two doubles: " + sumDoubles);

        scanner.close();
    }
}