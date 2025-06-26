import java.util.Scanner;

public class GrossSalaryCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;

        while (choice == -1) {
            System.out.print("Enter Basic Salary: ");
            double basicSalary = scanner.nextDouble();

            double hra, da, grossSalary;

            if (basicSalary > 15000) {
                hra = basicSalary * 0.20;  // 20% of basic
                da = basicSalary * 0.60;   // 60% of basic
            } else {
                hra = 3000;                // Fixed HRA
                da = basicSalary * 0.70;   // 70% of basic
            }

            grossSalary = basicSalary + hra + da;

            System.out.println("Gross Salary: ₹" + grossSalary);

            System.out.print("Enter -1 to calculate for another employee, or any other number to exit: ");
            choice = scanner.nextInt();
        }

        System.out.println("Salary calculation complete.");
        scanner.close();
    }
}