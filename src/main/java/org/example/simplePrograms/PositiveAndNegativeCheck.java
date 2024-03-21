package org.example.simplePrograms;

import java.util.Scanner;

public class PositiveAndNegativeCheck {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the  value =");
        int n= scan.nextInt();

        if(n>=0){
            System.out.println("Enter the n value is a Positive");
        }
        else {
            System.out.println("Enter the n value is a negative");
        }

    }
}
