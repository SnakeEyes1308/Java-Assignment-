package Assignment_5;

import Assignment_5.Shape;

import java.util.Scanner;

public class Rectangle extends Shape {

    @Override
    public void calculateArea() {
        // This function calculates the area of the rectangle taking the length and
        // breadth as an input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle");
        float length = scanner.nextFloat();
        System.out.println("Enter the breadth of the rectangle");
        float breadth = scanner.nextFloat();
        System.out.println("The area of rectangle is " + length*breadth);
    }


}
