package org.example.usingLoops;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter value");
        int n = scan.nextInt();

        int a = 0, b = 1, sum = 0;

         for(int i=2;i<=n;i++){
             sum = a+b;
             a=b;
             b=sum;

         }
        System.out.println(sum);
    }
}
