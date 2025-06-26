import java.util.Random;

public class Rectangle {
    private int length;
    private int width;

    // Constructor
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    // Method to calculate area
    public int calculateArea() {
        return length * width;
    }

    // Main method
    public static void main(String[] args) {
        Random rand = new Random();

        // Generate random dimensions between 1 and 100
        Rectangle rect1 = new Rectangle(rand.nextInt(100) + 1, rand.nextInt(100) + 1);
        Rectangle rect2 = new Rectangle(rand.nextInt(100) + 1, rand.nextInt(100) + 1);

        int area1 = rect1.calculateArea();
        int area2 = rect2.calculateArea();

        System.out.println("Rectangle1 area: " + area1);
        System.out.println("Rectangle2 area: " + area2);

        // Compare using relational operators
        if (area1 > area2) {
            System.out.println("Rectangle1 > Rectangle2");
        } else if (area1 < area2) {
            System.out.println("Rectangle1 < Rectangle2");
        } else {
            System.out.println("They are equal");
        }
    }
}