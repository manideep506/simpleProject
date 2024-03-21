package org.example.usingLoops;

import java.util.Scanner;

public class UpperCaseToLowerCase {
    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        System.out.println("enter String");
        String s = scan.next();
        System.out.println("enter String1");
        String s1 = scan.next();

        System.out.println(s.toLowerCase());
        System.out.println(s1.toUpperCase());
    }
}
