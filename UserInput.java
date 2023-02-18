/*
Problem Statement : Implement a menu-driven Java program Factorial to
                    implement these input methods in java (Scanner, Command Line args,
                    DataInputStream,BufferedReader and Console )

Name - Nisarg Patel
PRN - 21070126060
Batch - AIML A3

LAB ASSIGNMENT - 1 CALCULATOR - PART 1 USER INPUT

*/

import java.io.*;
import java.util.Scanner;

public class UserInput
{
    public static void main(String[] args) throws IOException, ArrayIndexOutOfBoundsException
    {

        Scanner sc = new Scanner(System.in);
        int number = 0;

        // Check if a command line argument is provided
        try {
            number = Integer.parseInt(args[0]);
        } catch (Exception ignored) {
        }

        // Print menu to choose input method                            //Printing the lines for the function
        System.out.println("Menu (taking input):");
        System.out.println("1. Using cmd line");
        System.out.println("2. Using Scanner");
        System.out.println("3. Using BufferedReader");
        System.out.println("4. Using DataInputStream");
        System.out.println("5. Using Console");
        System.out.println("6. Exit");

        System.out.print("Inputing the user choice :");    // Asking for the user input.

        int choice = new Scanner(System.in).nextInt() ;   // Asking fot the choices for the swtich case scenario

        Input input = new Input();


        // Choose input method based on user's choice
        switch (choice) {
            case 1:

                System.out.println("Using Command line");   // Command Line used
                System.out.print("Enter the number :");

                break;
            case 2:
                System.out.println("Using Scanner");  // Scanner Used
                System.out.print("Enter the number :");

                number = input.usingScanner();
                break;
            case 3:
                System.out.println("Using BufferedReader");   // BufferReader used
                System.out.print("Enter the number :");

                number = input.usingBufferedReader();
                break;
            case 4:
                System.out.println("Using DataInputStream");  //DataInputStream used
                System.out.print("Enter the number :");

                number = input.usingDataInputStream();
                break;
            case 5:
                System.out.println("Using Console");      //Console used
                System.out.print("Enter the number :");

                number = input.usingConsole();
                break;
            case 6:
                System.out.println("Exitting ..."); //Exit command
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice. Please try again.");  //Wrong choice
                break;
        }


        // Calculating the factorial
        int output = factorial(number);             //factorial call
        // Print the result
        System.out.println("Factorial " + number + ":" + output);
    }

    // Factorial function (ternary operator)
    static int factorial(int a) {
        return a == 0 ? 1 : a * factorial(a - 1);
    }
}

class Input
{
    // using Scanner
    int usingScanner ()
    {
        return new Scanner(System.in).nextInt() ;

    }

    // using BufferedReader
    int usingBufferedReader () throws IOException
    {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)) ;
        return Integer.parseInt(reader.readLine()) ;
    }

    // using DataInputStream
    int usingDataInputStream () throws IOException
    {
        // Create data input stream

        DataInputStream dis = new DataInputStream(System.in);
        return Integer.parseInt(dis.readLine());
    }

    // using Console
    int usingConsole ()
    {

        Console console = System.console();
        return Integer.parseInt(console.readLine());
    }

}