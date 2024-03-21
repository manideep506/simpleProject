package org.example.usingLoops;

import java.util.Scanner;

public class Factorial {
    //   Possibility 1 without recursion
//    public static void main(String[] args){
//        Scanner scan = new Scanner(System.in);
//        int n= scan.nextInt();
//        int num = 1;
//
//        for(int i=n;i>=1;i--){
//            num = num*i;
//
//        }
//        System.out.println(num);
//    }

    //   Possibility 2 with recursion
    public static void main(String[] args){
            Scanner scan = new Scanner(System.in);
            double n= scan.nextInt();
            System.out.println(value(n));
    }

    public static double value(double n) {

        double num = 1;
        if(n==0){
            return 1;
        }
        for(double i=n;i>=1;i--){
            num = num*i;

        }
        return num;
    }
}
