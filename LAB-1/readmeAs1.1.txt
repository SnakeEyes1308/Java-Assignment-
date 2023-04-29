This Java program demonstrates different ways to take user input from the command line and calculate the factorial of the given number. It includes the following input methods:

Using Command Line - The user enters the number as a command line argument when running the program.
Using Scanner - The program prompts the user to enter the number using the Scanner class.
Using BufferedReader - The program prompts the user to enter the number using the BufferedReader class.
Using DataInputStream - The program prompts the user to enter the number using the DataInputStream class.
Using Console - The program prompts the user to enter the number using the Console class.
The program uses a switch-case statement to choose the input method based on the user's choice. The Input class contains methods that implement each input method.

To calculate the factorial of the given number, the program uses a recursive function. The factorial function calculates the factorial of a number using a ternary operator.

To run the program, compile the UserInput.java file and run the compiled file with an integer as the command line argument or enter the integer using one of the input methods.

Note: The program assumes that the user will input a valid integer. If the user inputs a non-integer value, the program will throw an exception.