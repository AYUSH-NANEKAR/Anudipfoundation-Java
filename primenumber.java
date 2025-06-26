
import java.util.Scanner;

class primenumber{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(syst);
        System.err.println("enter a number");
        int num= scanner.nextInt();
        scanner.close();
        boolean isPrime = true;
        if (num <= 1) {
            isPrime = false; 
        }
        else{for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
             }
    }
     if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
}
}