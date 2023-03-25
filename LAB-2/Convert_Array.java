/*
Problem Statement : Write a Java program to convert an array into ArrayList and vice versa.
Name - Nisarg Patel
PRN - 21070126060
Batch - AIML A3

LAB ASSIGNMENT - 2 Convert_Array
*/
package Assignment_2;
import java.util.ArrayList;
public class Convert_Array {
    public static void main(String[] args) {
        ConvertArrayAndArrayList converter = new ConvertArrayAndArrayList();
        converter.convertToArray();    // call method to convert array list to array
        converter.convertToArrayList();    // call method to convert array to array list
    }
}
class ConvertArrayAndArrayList {
    void convertToArrayList() {    // Method to convert array to array list
        int[] arr = {6, 7, 8, 9, 10};
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            arrayList.add(arr[i]);
        }
        System.out.println(arrayList);    // print array list
        System.out.println("Type: " + ((Object)arrayList).getClass().getSimpleName());    // print type of array list
        System.out.println("\n");
    }

    void convertToArray() {    // Method to convert array list to array
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i= 5 ; i < 10; i++) {
            arrayList.add(i);
        }
        int[] arr = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            arr[i] = arrayList.get(i);
        }
        System.out.println("Converting array list to array");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");    // print each element of the array
        }
        System.out.println();
        System.out.println("Type: " + ((Object)arr).getClass().getSimpleName());    // print type of array
    }
}
