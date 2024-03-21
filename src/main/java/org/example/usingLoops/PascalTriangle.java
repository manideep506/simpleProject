package org.example.usingLoops;

import java.util.Scanner;

public class PascalTriangle {
    public static <GFG> void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter value");
        int n = scan.nextInt();

        for(int i = 0; i <= n; i++){
            for(int j = 0; j<= n-1; j++){
                System.out.println(" ");
                }
            for (int k = 0; k <= i; k++) {
                System.out.print(" " + factorial(i) / (factorial(i - k) * factorial(k)));
                }
            }
        }


    public static int factorial(int i) {
        if (i == 0) {
            return 1;
        }
        return i * factorial(i - 1);
    }
}
