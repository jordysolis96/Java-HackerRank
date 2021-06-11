import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class JavaLoops1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a integer");
        int N = scan.nextInt();
        int i = 1;
        for(i = 1; i <= 10; i++){
            System.out.println(N + " x " + i + " = " + N * i);
        }
    }
}
