
import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
         System.out.println("enter your name");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.err.println("hi "+s);
        sc.close();
    }
}
