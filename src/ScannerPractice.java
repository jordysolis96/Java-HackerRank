import java.util.Scanner;


public class ScannerPractice{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string");
        String myString = scan.nextLine();
        System.out.println("Enter a integer");
        int a = scan.nextInt();


        System.out.println("My String is: " + myString);
        System.out.println("My Integer was: " + a);
    }
}
