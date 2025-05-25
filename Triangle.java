/*
 * CSC-239 JAVA
 * Lab13a_Abstract_Class
 * Student: Weiquan Mai
 * Date: March 26, 2025
 * Description: Project utilizes abstract classes to create triangle class from geometric objects class.
 * It then prompts user to enter the three sides of a triangle, stores input information into triangle object, and calculates the area and perimeter of the triangle.
 */

public class Triangle extends GeometricObject{
    private double side1;
    private double side2;
    private double side3;

    // No arg constructor
    public Triangle(){
    }

    public Triangle(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // Getters and setters
    public double getSide1(){
        return side1;
    }
    public double getSide2(){
        return side2;
    }
    public double getSide3(){
        return side3;
    }
    
    // Functions to getArea and getPerimeter
    @Override 
    public double getArea(){
        double s = ((side1 + side2 + side3)/2);
        return Math.sqrt((s) * (s - side1) * (s - side2) * (s - side3));
    }
    @Override
    public double getPerimeter(){
        return side1 + side2 + side3;
    }
    // Obtained from Professor Morgan
    @Override  
    public String toString() { 
      return String.format("side1= %6.2f, side2=%6.2f, side3=%6.2f, " + "color=%s, filled=%b", 
              side1, side2, side3, getColor(), isFilled()); 
  }
}
