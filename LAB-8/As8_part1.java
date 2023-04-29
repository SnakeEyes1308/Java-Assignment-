/*
Assignment description: Write a
Java Program to find the factorial of ‘n’ integers (as command line arguments
CLA). Write your own exception “FactorialException” to validate integer values
to be in certain range. Sample call: java ExceptionDemo 8 – 6 14 abcd 5


1) Static
main method invokes another method “factorial()”


2) CLA
which are strings but interpreted as integer values.


3) The
user-defined exception class





FactorialException  should have proper constructors / overridden
toString() method to display exception message along with the wrong input
number that had generated the exception.


NumberFormatException
(ill-formed CLA)


And


Your
Exception class





FactorialException  ( n<0 and n>15 )





Part 2:


Define an
exception class called “NOMATCHEXCP” that is thrown when the string from the
keyboard is not equal to “India”. Write a Demo program using try-catch block
that shows the use of this user-defined exception. Class NOMATCHEXCP should
have a parameterized constructor and the exception message generated should
show the line number and the erroneous String that was inputted by the user.

Name - Nisarg Patel
PRN - 21070126060
Batch - AIML A3

LAB ASSIGNMENT - 8
*/
package As8;

// Create a custom exception class
class MyExcep extends Exception {
    MyExcep(String message) {
        super(message);
    }
}

public class As8_part1 {
    public static void main(String[] args) {
        // Loop through each argument passed to the program
        for (String arg : args) {
            try {
                // Convert the argument to an integer
                int n = Integer.parseInt(arg);
                // Check if the integer is out of range (1 to 10)
                if (n < 1 || n > 10) {
                    // Throw a custom exception if the integer is out of range
                    throw new MyExcep("Value out of range (1 to 10) for " + n);
                }
                // If the integer is in range, calculate its factorial and print the result
                System.out.println("Factorial of " + n + " is " + factorial(n));
            } catch (NumberFormatException e) {
                // If the argument cannot be converted to an integer, catch the exception and print an error message
                System.out.println("Invalid input: " + e.getMessage());
            } catch (MyExcep e) {
                // If the integer is out of range, catch the custom exception and print the error message
                System.out.println(e.getMessage());
            }
        }
    }

    // Calculate the factorial of an integer
    private static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
