package Assignment_5;

import java.util.Scanner;

public class Cylinder extends Shape implements Volume{
    Scanner scanner = new Scanner(System.in);
    @Override
    public void calculateArea() {
        System.out.println("Enter the value of radius");
        float radius = scanner.nextFloat();
        System.out.println("Enter the value of height of the cylinder");
        float height = scanner.nextFloat();
        double area = (2*Math.PI*radius*height) + 2*Math.PI*Math.pow(radius,2);
        System.out.println("The surface area of the Cylinder is " + area);
    }

    @Override
    public void calculateVolume() {
        System.out.println("Enter the value of radius");
        float radius = scanner.nextFloat();
        System.out.println("Enter the value of height of the cylinder");
        float height = scanner.nextFloat();
        double volume = (Math.PI)*Math.pow(radius,2)*height;
        System.out.println("The surface area of the Cylinder is " + volume);
    }
}
