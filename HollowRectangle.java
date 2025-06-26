public class HollowRectangle {
    public static void main(String[] args) {
        int rows = 5;    // You can change this value
        int cols = 10;   // You can change this value too

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i == 0 || i == rows - 1 || j == 0 || j == cols - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}