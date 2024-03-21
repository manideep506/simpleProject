package org.example.simplePrograms;

import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Height value =");
        int c= scan.nextInt();


        float F;

        F = (c*((float) 9 /5))+32;

        System.out.println("Displaying the Answer of F" +F);
    }
}
