package org.example.simplePrograms;

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args){
        //Possibility 1
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the a value");
        double a = scan.nextDouble();
        System.out.println("enter the b value");
        double b = scan.nextDouble();
        System.out.println("enter the c value");
        double c = scan.nextDouble();

        double num1;
         num1 = b * b - 4 * a * c;
         num1 = -b+num1;
         num1 = num1/(2*a);

        System.out.println(num1);
    }


}
