import java.io.*;
import java.util.*;

public class StringReverse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();
        /* Enter your code here. Print output to STDOUT. */
        String reverse = new StringBuffer(A).reverse().toString();
        if(reverse.matches(A)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
