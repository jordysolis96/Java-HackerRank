import java.io.*;
import java.util.*;

public class StringReverse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        /* Enter your code here. Print output to STDOUT. */
        String reverse = new StringBuffer(S).reverse().toString();
        if(reverse.matches(S)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
