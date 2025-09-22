package Recursion; 
import java.util.Scanner;

// Task is to return the nth number in fibonacci series (first index is 0)
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibonacciIterative(n));
        System.out.println(fibonacciRecursive(n));
        sc.close();
    }


public static int fibonacciIterative(int n) {
    if (n==0) { return 0; }
    if (n==1) { return 1; }

    int prev = 0,curr = 1, temp;
    for (int i=2; i<n+1; i++) {
        temp = prev + curr; // next num is sum of prev and curr num
        prev = curr; // make prev the curr num
        curr = temp; // make curr the next num
    }
    return curr;
}


public static int fibonacciRecursive(int n) {
    if (n==0) {return 0;}
    if (n==1) {return 1;}
    return fibonacciRecursive(n-1) + fibonacciRecursive(n-2);
}
}