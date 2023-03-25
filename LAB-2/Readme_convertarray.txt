ConvertArrays
ConvertArrays is a Java program that demonstrates how to convert an array to an ArrayList and an ArrayList to an array.

Code Overview
This Java program demonstrates how to convert an array to an ArrayList and an ArrayList to an array. The program defines a class called ConvertArrayAndArrayList with two methods: convertToArrayList() and convertToArray(). The main() method in the ConvertArrays class creates an instance of the ConvertArrayAndArrayList class and calls these methods to perform the conversions.

Method Explanation
convertToArrayList()
This method converts an array to an ArrayList by performing the following steps:

Create an array of integers called arr with the values {1, 2, 3, 4, 5}.
Create an empty ArrayList called arrayList.
Loop through each element in the arr array using a for loop.
Add each element to the arrayList using the add() method.
Print the arrayList to the console using the println() method.
Print the type of the arrayList to the console using the getClass() method and getSimpleName() method.
convertToArray()
This method converts an ArrayList to an array by performing the following steps:

Create an empty ArrayList called arrayList.
Loop through the numbers from 0 to 4 using a for loop.
Add each number to the arrayList using the add() method.
Create a new array of integers called arr with the same size as the arrayList.
Loop through each element in the arrayList using a for loop.
Set the corresponding element in the arr array to the value of the current element in the arrayList.
Print the arr array to the console using a for loop and the print() method.
Print the type of the arr array to the console using the getClass() method and getSimpleName() method.