import java.util.Scanner;

public class Car {
    // Member variables
    private String make;
    private String model;
    private short year;
    private int price;

    // Constructor
    public Car(String make, String model, short year, int price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    // Method to display car details
    public void displayCarDetails() {
        System.out.println("Car Details:");
        System.out.println("Make : " + make);
        System.out.println("Model: " + model);
        System.out.println("Year : " + year);
        System.out.println("Price: ₹" + price);
        System.out.println("--------------------------------");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many cars do you want to enter?");
        int count = scanner.nextInt();
        scanner.nextLine();

        Car[] cars = new Car[count];

        for (int i = 0; i < count; i++) {
            System.out.println("Enter details for Car " + (i + 1) + ":");

            System.out.print("Make: ");
            String make = scanner.nextLine();

            System.out.print("Model: ");
            String model = scanner.nextLine();

            System.out.print("Year: ");
            short year = scanner.nextShort();

            System.out.print("Price: ");
            int price = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            cars[i] = new Car(make, model, year, price);
        }

        System.out.println("\n--- All Entered Cars ---");
        for (Car car : cars) {
            car.displayCarDetails();
        }

        scanner.close();
    }
}