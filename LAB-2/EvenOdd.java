/*
Problem Statement : W.a.p that declares two arrays named ‘even’ and ‘odd’. Accept
                    numbers from the user and move them to respective arrays depending on
                    whether they are even or odd.
Name - Nisarg Patel
PRN - 21070126060
Batch - AIML A3

LAB ASSIGNMENT - 2 Even Odd
*/


package Assignment_2;
import java.util.Scanner;
public class EvenOdd
{
    public static void main(String[] args) {
        ArrayEvenOdd eo = new ArrayEvenOdd(); // create object of class ArrayEvenOdd
        int num = eo.getNumOfElements(); // get number of elements from user input
        eo.checkEvenOdd(num); // separate even and odd numbers in the array
    }

}
// Class ArrayEvenOdd
class ArrayEvenOdd {
    // method to get number of elements from user input
    int getNumOfElements() {
        System.out.print("Enter the number of elements: ");
        return new Scanner(System.in).nextInt();
    }

    // method to separate even and odd numbers in the array
    void checkEvenOdd(int num) {
        int[] evenArr = new int[num]; // array for even numbers
        int[] oddArr = new int[num]; // array for odd numbers
        int countEven = 0; // counter for even numbers
        int countOdd = 0; // counter for odd numbers

        // loop to get input for each element and separate even and odd numbers
        for (int i = 0; i < num; i++) {
            System.out.print("Enter Element " + (i + 1) + ": ");
            int element = new Scanner(System.in).nextInt();

            if (element % 2 == 0) { // if the element is even
                evenArr[countEven] = element; // add to even array
                countEven++; // increment even counter
            } else { // if the element is odd
                oddArr[countOdd] = element; // add to odd array
                countOdd++; // increment odd counter
            }
        }

        // print even numbers
        System.out.print("Even: ");
        for (int i = 0; i < countEven; i++) {
            System.out.print(evenArr[i] + " ");
        }
        System.out.println();

        // print odd numbers
        System.out.print("Odd: ");
        for (int i = 0; i < countOdd; i++) {
            System.out.print(oddArr[i] + " ");
        }
    }
}
