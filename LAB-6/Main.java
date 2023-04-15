/*
Problem Statement :1) Write an application to show the behavior of a Duck.10025
        2) Create classes as mentioned in https://www.oreilly.com/api/v2/epubs/0596007124/files/figs/web/022fig01.png.jpg
        3) Also create a new Behaviour :
        a) <<interface>> SwimBehavior
        b) Three different classes  Swim, Float, and Drown which implement SwimBehavior containing swim() method.
        4) Print which duck will fly, float or swim.
        5) Create a class diagram for the entire program (including the SwimBehavior interface).


        - The program should contain different java files.
        - Each operation should be a separate function.
        - Program should contain at top of the Main file in comments: Name, PRN, Batch
        - The program should follow all the coding guidelines.
        - The program should contain comments for a particular block of logic.
        - It is recommended to upload the Program to your GitHub account.
        - Your Strategy repository on GitHub should contain a README file describing all functions or methods or definitions.



        Name - Nisarg Patel
        PRN - 21070126060
        Batch - AIML A3

        LAB ASSIGNMENT - 6


 */
package Assignment_6;

public class Main {

    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.performFly();
        mallardDuck.performQuack();
        mallardDuck.performSwim();

        System.out.println();

        RubberDuck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.performFly();
        rubberDuck.performQuack();
        rubberDuck.performSwim();

        System.out.println();

        DecoyDuck decoyDuck = new DecoyDuck();
        decoyDuck.display();
        decoyDuck.performFly();
        decoyDuck.performQuack();
        decoyDuck.performSwim();

        System.out.println();

        ReadHeadDuck readHeadDuck = new ReadHeadDuck();
        readHeadDuck.display();
        readHeadDuck.performFly();
        readHeadDuck.performQuack();
        readHeadDuck.performSwim();
    }


}
