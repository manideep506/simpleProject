package org.example.usingLoops;

import java.util.Scanner;

public class SquareOfNumberAndXToY {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter value");
        double n = scan.nextInt();

        double result = Math.pow(n,3);

        System.out.println(result);
    }
}
