/*
 * CSC-239 JAVA
 * Lab13a_Abstract_Class
 * Student: Weiquan Mai
 * Date: March 26, 2025
 * Description: Project utilizes abstract classes to create triangle class from geometric objects class.
 * It then prompts user to enter the three sides of a triangle, stores input information into triangle object, and calculates the area and perimeter of the triangle.
 */

import java.util.Scanner;
public class Lab13a {
    // Main method
    public static void main (String[] args){
        // Create a scanner
        Scanner input = new Scanner(System.in);

        // Obtain input about object from user
        System.out.print("Enter three sides: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();
        input.nextLine();
        System.out.print("Enter the color: ");
        String color = input.nextLine();
        System.out.print("Enter a boolean value for filled: ");
        Boolean filled = input.nextBoolean();

        // Create an object with specified information
        GeometricObject triangle = new Triangle(side1, side2, side3);
        triangle.setColor(color);
        triangle.setFilled(filled);

        // Print out specified information
        System.out.print("Triange: " + triangle.toString() + 
        ", Perimeter = " + String.format("%.2f",triangle.getPerimeter())
        + ", Area = " + String.format("%.2f",triangle.getArea()));

        // Close scanner
        input.close();
    }
}
