package org.example.simplePrograms;

public class FindLargestNum {
    public static void main(String[] args) {

                int[] arr = {10, 20, 15,66,33,99,222,55,990,32,65,87};


                int largest = arr[0];


                for (int i = 1; i < arr.length; i++) {

                    if (arr[i] > largest) {
                        largest = arr[i];
                    }
                }


                System.out.println("The largest number is: " + largest);
            }
        }


