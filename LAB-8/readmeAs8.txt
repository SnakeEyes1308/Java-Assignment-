README

This repository contains two Java files, As8_part1.java and As8_part2.java, which demonstrate the use of custom exceptions in Java.

As8_part1.java:
This file contains a program that calculates the factorial of integers passed as command line arguments to the program. The program throws a custom exception, MyExcep, if the integer is out of range (1 to 10). The program also catches NumberFormatException and MyExcep exceptions and prints appropriate error messages. The program includes comments that explain each section of the code.

As8_part2.java:
This file contains a program that prompts the user to enter a string and throws a custom exception, NOMATCHEXCP, if the input string does not match "India". The program uses the line number where the user input is taken to construct the error message. The program catches the NOMATCHEXCP exception and prints the error message. The program includes comments that explain each section of the code.

To run either of these programs, simply compile the respective file and run the compiled program. For example, to run As8_part1.java, open a command prompt or terminal window, navigate to the directory containing As8_part1.java, compile the file using the command "javac As8_part1.java", and then run the program using the command "java As8_part1 arg1 arg2 ...", where arg1, arg2, etc. are integers for which you want to calculate the factorial. To run As8_part2.java, follow the same steps but with the command "java As8_part2".

Note: In Part 2, the line number where the user input is taken is assumed to be the line where the exception should be thrown. However, this may not always be the case, so the line number should be adjusted accordingly based on the specific implementation.