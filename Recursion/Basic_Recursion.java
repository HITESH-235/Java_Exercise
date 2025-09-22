package Recursion;

import java.util.Scanner;

public class Basic_Recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print_NameNtimes(1, n);

        System.out.println();

        print_1toN(1,n);
        print_1toN_Backtrack(n);

        System.out.println();

        print_Nto1(n);
        print_Nto1_Backtrack(1,n);
        sc.close();
    }
public static void print_NameNtimes(int i,int n) {
    if (i>n) { return; }
    System.out.println("Name");
    print_NameNtimes(i+1, n);
}


public static void print_1toN(int i, int n){  // similarly for n to m
    if (i>n) {return;}
    System.out.println(i);
    print_1toN(i+1,n);
}
public static void print_1toN_Backtrack(int n){
    if (n<1) { return; }
    print_1toN_Backtrack(n-1);
    System.out.println(n); // went opposite by printing after call
}


public static void print_Nto1(int n){
    if (n<1) {return;}
    System.out.println(n);
    print_Nto1(n-1);
}
public static void print_Nto1_Backtrack(int i,int n){
    if (i>n) {return;}
    print_Nto1_Backtrack(i+1,n);
    System.out.println(i);
}

}