package org.example.simplePrograms;

import java.util.Scanner;
import java.lang.System;


public class AreaOfTriangle {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Height value =");
        double h= scan.nextInt();
        System.out.println("Enter the Breadth value =");
        double b= scan.nextInt();

        double A;

        A = (h*b)/2;

        System.out.println("Displaying the Answer of Area" +A);
    }



}
