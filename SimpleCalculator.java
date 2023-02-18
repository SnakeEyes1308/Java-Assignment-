/*

Problem Statement : Implement a simple menu driven calculator in java to implement add, sub, mul, div, sqrt, power,
                    mean, variance. Implement a separate Calculator class to include all related function inside that
                    class. (mean calculation : program reads numbers from the keyboard, summing them in the process
                    until the user enters the string “end”. It then stops input & displays the avg. of numbers)

Name : Nisarg Patel
PRN : 21070126060
Batch : AIML - A3
Lab Assignment 1 - Part 2

*/

//Importing
import java.util.Scanner;


//Main class
public class SimpleCalculator
{
    public static void main(String[] args)              //Main method
    {
        Calculator calculator = new Calculator() ;          //Object class of calculator
        calculator.calculation();                           //Method calling of calculation()
    }
}


// Creating the class calculator
class Calculator {
    void calculation()                                              // Method calculation()
    {
        Scanner sc = new Scanner(System.in);

        while (true)
        {
            System.out.println("Menu:");                                    // Calling the Menu
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Square Root");
            System.out.println("6. Power");
            System.out.println("7. Mean");
            System.out.println("8. Variance");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice)                                                     //Making the switch cases
            {
                case 1:                                                             //Switch Case Addition
                    System.out.print("Enter first number: ");
                    double num1 = sc.nextDouble();
                    System.out.print("Enter second number: ");
                    double num2 = sc.nextDouble();
                    System.out.println("Result: " + (num1 + num2));
                    break;
                case 2:                                                             //Switch case Subtraction
                    System.out.println("Subtraction");
                    System.out.print("Enter first number: ");
                    num1 = sc.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = sc.nextDouble();
                    System.out.println("Result: " + (num1 - num2));
                    break;
                case 3:                                                             //Switch case Multiplication
                    System.out.println("Multiplication");
                    System.out.print("Enter first number: ");
                    num1 = sc.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = sc.nextDouble();
                    System.out.println("Result: " + (num1 * num2));
                    break;
                case 4:                                                             // Switch case Division
                    System.out.println("Division");
                    System.out.print("Enter first number: ");
                    num1 = sc.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = sc.nextDouble();
                    System.out.println("Result: " + (num1 / num2));
                    break;
                case 5:                                                             // Swtich case Square Root
                    System.out.println("Square Root");
                    System.out.print("Enter number: ");
                    num1 = sc.nextDouble();
                    System.out.println("Result: " + Math.sqrt(num1));
                    break;
                case 6:                                                             // Switch case Power
                    System.out.println("Power");
                    System.out.print("Enter base: ");
                    num1 = sc.nextDouble();
                    System.out.print("Enter exponent: ");
                    int exponent = sc.nextInt();
                    System.out.println("Result: " + Math.pow(num1, exponent));
                    break;
                case 7:                                                              // Switch case Mean
                    System.out.println("Mean");
                    double sum = 0;
                    int count = 0;
                    String input;
                    System.out.println("Enter numbers one by one, enter 'end' to stop input:");
                    while (true) {
                        input = sc.next();
                        if (input.equalsIgnoreCase("end")) {
                            break;
                        }
                        sum += Double.parseDouble(input);
                        count++;
                    }
                    System.out.println("Mean: " + (sum / count));
                    break;
                case 8:                                                                 // Switch case Variance
                    System.out.println("Variance");
                    sum = 0;
                    count = 0;
                    double mean = 0;
                    double variance = 0;
                    System.out.println("Enter numbers one by one, enter 'end' to stop input:");
                    while (true) {
                        input = sc.next();
                        if (input.equalsIgnoreCase("end")) {
                            break;
                        }
                        double num = Double.parseDouble(input);
                        sum += num;
                        count++;
                    }
                    mean = sum / count;
                    sc = new Scanner(System.in);
                    System.out.println("Enter numbers one by one, enter 'end' to stop input:");
                    while (true) {
                        input = sc.next();
                        if (input.equalsIgnoreCase("end")) {
                            break;
                        }
                        double num = Double.parseDouble(input);
                        variance += Math.pow((num - mean), 2);
                    }
                    variance = variance / count;
                    System.out.println("Variance: " + variance);
                    break;
                case 9:                                                             // swtich case exit
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:                                                            // Mentioning the case for the Invalid Choice
                    System.out.println("Invalid choice!");
                    break;
            }
        }
    }
}