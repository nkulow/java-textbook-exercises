import java.util.Scanner;

class Triangle
    extends GeometricObject {

    private double side1;
    private double side2;
    private double side3;

    // no-arg constructor that creates default triangle
    Triangle(){
        side1 = 1.0;
        side2 = 1.0;
        side3 = 1.0;
    }
    //constructor that creates triangle with specified sides
    Triangle (double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // accessor methods for data fields
    public double getSide1() {return side1;}
    public double getSide2() {return side2;}
    public double getSide3() {return side3;}

    // method to get the area of a triangle
    public double getArea(){
        double p = (side1 + side2 + side3) / 2;
        return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
    }
    //method to get the perimeter of the triangle
    public double getPerimeter(){
        return side1 + side2 + side3;
    }
    // method to return a description of the triangle
    public String toString(){
        return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
    }
}
// class GeometricObject given in the text book
class GeometricObject {
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;

    /** Construct a default geometric object */
    public GeometricObject() {
        dateCreated = new java.util.Date();
    }

    /** Construct a geometric object with the specified color
     * and filled value */
    public GeometricObject(String color, boolean filled) {
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }

    /** Return colot */
    public String getColor() {
        return color;
    }

    /** Set a new color */
    public void setColor(String color) {
        this.color = color;
    }

    /** Return filled. Since filled is boolean,
     its getter method is named isFilled */
    public boolean isFilled() {
        return filled;
    }

    /** Set a new filled */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    /** Get dateCreated */
    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    /** Return a string representation of this object */
    public String toString() {
        return "created on " + dateCreated + "\ncolor: " + color +
                " and filled: " + filled;
    }
}

// main class to test the program

public class testTriangle{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of each side of a triangle seperated by spaces: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        System.out.print("Enter a color: ");
        String color = input.next();

        System.out.print("Is the triangle filled? \nPlease enter true or false: ");
        boolean filled = input.nextBoolean();

        Triangle triangle1 = new Triangle(side1, side2, side3);
        triangle1.setColor(color);
        triangle1.setFilled(filled);

        System.out.println("The area of the triangle is " + triangle1.getArea());
        System.out.println("The perimeter of the triangle is " + triangle1.getPerimeter());
        System.out.println("The color of the triangle is " + triangle1.getColor());
        if (triangle1.isFilled())
            System.out.println("The triangle is filled.");
        else
            System.out.println("The triangle1 is not filled.");
    }
}
