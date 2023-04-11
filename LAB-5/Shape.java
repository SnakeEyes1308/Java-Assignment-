/*
Problem Statement : Write Menu Driven program to calculate the Area and Volume of the selected Shape
                    a) Create classes as Circle, Rectangle, Square, Sphere, Cylinder, and Pyramid.
                    b) Create Shape as abstract class with showShape(String shape) as non-abstract method,
                       while calculateShape() and calculatePerimeter() as abstract method.
                    c) Create Volume as an interface with calculateVolume() as an abstract method.
                    d) Get input from users for measurements of shapes.

    - The program should contain different java files.
    - Each operation should be a separate function.
    - Program should contain at top of the Main file in comments: Name, PRN, Batch
    - The program should follow all the coding guidelines.
    - The program should contain comments for a particular block of logic.
    - It is recommended to upload the Program to your GitHub account.
    - Your Shape repository on GitHub should contain a README file describing all functions or methods or definitions.



Name - Nisarg Patel
PRN - 21070126060
Batch - AIML A3

LAB ASSIGNMENT - 4
*/

package Assignment_5;

import java.util.Scanner;

abstract public class Shape {

    // Here Shape is an abstract class with one implemented method
    // and one abstract method

    public  static void showShape(String shape){
        System.out.println("Shape is "+ shape);
    }
    // This abstract method would be overridden in the other classes
    // for calculating the area of given shape
    abstract public void calculateArea();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("------Menu------");
        System.out.println("Calculate Area and Volume");
        System.out.println("1. Calculate Area");
        System.out.println("2. Calculate Volume");
        System.out.println("3. Exit from the program");
        System.out.println("Enter your choice");
        int choice = scanner.nextInt();
        while (true) {
            switch (choice) {
                case 1:
                    System.out.println("Calculating the Area of \n" +
                            "1. Rectangle\n" +
                            "2. Circle\n" +
                            "3. Cylinder\n" +
                            "4. Pyramid\n" +
                            "5. Sphere\n" +
                            "6. exit");
                    System.out.println("Choosing the shape");
                    int chooseShape = scanner.nextInt();
                    switch (chooseShape){
                        case 1:
                            Shape.showShape("Rectangle");
                            Rectangle rectangle = new Rectangle();
                            rectangle.calculateArea();
                            break;

                        case 2:
                            Shape.showShape("Circle");
                            Circle circle = new Circle();
                            circle.calculateArea();
                            break;

                        case 3:
                            Shape.showShape("Cylinder");
                            Cylinder cylinder = new Cylinder();
                            cylinder.calculateArea();
                            break;

                        case 4:
                            Shape.showShape("Pyramid");
                            Pyramid pyramid = new Pyramid();
                            pyramid.calculateArea();
                            break;

                        case 5:
                            Shape.showShape("Sphere");
                            Sphere sphere = new Sphere();
                            sphere.calculateArea();
                            break;

                        case 6:
                            System.exit(0);

                        default:
                            System.out.println("Enter a valid choice");
                    }
                    break;

                case 2:
                    System.out.println("Calculate Volume of \n" +
                            "1. Sphere\n" +
                            "2. Cylinder\n" +
                            "3. Pyramid\n" +
                            "4. Exit");

                    chooseShape = scanner.nextInt();
                    switch (chooseShape){
                        case 1:
                            Sphere sphere = new Sphere();
                            sphere.calculateVolume();
                            break;

                        case 2:
                            Cylinder cylinder = new Cylinder();
                            cylinder.calculateVolume();
                            break;

                        case 3:
                            Pyramid pyramid = new Pyramid();
                            pyramid.calculateVolume();
                            break;

                        case 4:
                            System.exit(0);

                        default:
                            System.out.println("Enter a valid choice");
                    }

                case 3:
                    System.exit(0);
            }

        }
    }
}
