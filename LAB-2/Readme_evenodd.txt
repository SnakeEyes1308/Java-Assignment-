EvenOdd Program
This program separates even and odd numbers in an array based on user input.
Usage


java EvenOdd
Follow the prompts to enter the number of elements and the elements themselves.
The program will output the even numbers and odd numbers in separate arrays.
Code Overview
Main Class (EvenOdd)
The EvenOdd class contains the main method and is responsible for creating an instance of the ArrayEvenOdd class and invoking its methods.
ArrayEvenOdd Class
The ArrayEvenOdd class contains two methods: getNumOfElements and checkEvenOdd.



getNumOfElements():
This method prompts the user to enter the number of elements they want to input and returns the integer value entered by the user. It uses the Scanner class to read user input from the standard input stream.
checkEvenOdd(int num):
This method takes an integer num as an argument, which represents the number of elements the user wants to input. It initializes two arrays evenArr and oddArr to hold the even and odd numbers respectively. It also initializes two counters countEven and countOdd to keep track of the number of even and odd elements in the input array.
The method then uses a loop to iterate over num times to get input from the user for each element. For each element, it checks if it is even or odd using the % operator. If the element is even, it adds it to the evenArr array and increments the countEven counter. If the element is odd, it adds it to the oddArr array and increments the countOdd counter.
Finally, the method prints out the even and odd numbers in separate lines using two separate loops. It uses the counter values countEven and countOdd to determine the number of elements to print from each array.

