public class factorialdemo {
    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        int number = 5; // You can change this to any number you want
        System.out.println("Factorial of " + number + " is " + factorial(number));
    }
}