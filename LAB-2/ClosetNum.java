/*
Problem Statement : Implement a java function that finds 2 neighboring numbers in an
                    array with the smallest distance to each. The function should return the
                    index of the 1st number.
Name - Nisarg Patel
PRN - 21070126060
Batch - AIML A3

LAB ASSIGNMENT - 2 Closet Number
*/
package Assignment_2;

import java.util.Arrays;
import java.util.Scanner;


        // Return the index of the first number in the closest pair of numbers

public class ClosetNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of elements in the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        // Prompt the user to enter the elements of the array
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Sort the array in ascending order
        Arrays.sort(arr);

        // Call the findClosestNumbers function to find the index of the first number in the closest pair of numbers
        int index = findClosestNumbers(arr);

        // Print the closest pair of numbers and their index
        System.out.println("The closest pair of numbers is: " + arr[index] + " and " + arr[index + 1]);
        System.out.println("The index of the first number in the closest pair of numbers is: " + index);
    }


    public static int findClosestNumbers(int[] arr) {
        // Initialize the minimum difference and the index to the first two elements in the array
        int minDiff = Math.abs(arr[1] - arr[0]);
        int index = 0;

        // Iterate through the array and compare each number with its neighbor
        for (int i = 1; i < arr.length - 1; i++) {
            int diff = Math.abs(arr[i + 1] - arr[i]);

            // Update the minimum difference and the index if a smaller difference is found
            if (diff < minDiff) {
                minDiff = diff;
                index = i;
            }

        }
        return index;
    }
}