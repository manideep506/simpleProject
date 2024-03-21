package org.example.usingLoops;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter value");
        int m = scan.nextInt();
        int number = 10;
        int n;

        for(int i=1;i<=number;i++){
            n = m*i;
            System.out.println( m+  "*"  +i+ " = "+n);
        }


    }
}
