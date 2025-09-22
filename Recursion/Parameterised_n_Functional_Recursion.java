package Recursion;

import java.util.Scanner;
// Task is to print sum of first N natural numbers
public class Parameterised_n_Functional_Recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        parameterisedRecursion_SumOfN(n,0);
        parameterisedRecursion_Factorial(n,1);
        System.out.println(functionalRecursion_SumofN(n));
        System.out.println(functionalRecursion_Factorial(n));
        sc.close();
    }


// Parameterised Recursion: simply recursion where the recursive function takes one or more parameters
// and those parameters evolve(mutate) with each recursive call to help solve the problem 
public static void parameterisedRecursion_SumOfN(int n,int sum){
    if (n<1) { 
        System.out.println(sum);
        return;
    }
    parameterisedRecursion_SumOfN(n-1, sum+n); // goes till n equals 0
}
public static void parameterisedRecursion_Factorial(int n,int prod){
    if (n<2) { 
        System.out.println(prod);
        return;
    }
    parameterisedRecursion_Factorial(n-1, prod*n);
}


// Functional Recursion: solves the problem by calling itself, without changing variables
// Immutability; pure input dependence; no loops
public static int functionalRecursion_SumofN(int n){
    if (n==0) { return 0; }
    return n+functionalRecursion_SumofN(n-1);
}
public static int functionalRecursion_Factorial(int n) {
    if (n<2) { return 1; }
    return n*functionalRecursion_Factorial(n-1);
}


}