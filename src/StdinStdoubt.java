import java.util.*;

public class StdinStdoubt {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your first number:");
        int a = scan.nextInt();
        System.out.println("enter your second number:");
        int b = scan.nextInt();
        System.out.println("enter your third number:");
        int c = scan.nextInt();
        System.out.println("Here are your numbers:");
        System.out.println("No.1: " + a);
        System.out.println("No.2: " + b);
        System.out.println("No.3: " + c);
    }
}
