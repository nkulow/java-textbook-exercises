public class Circle2D {

    private double x;
    private double y;
    private double radius;
    // no arg constructor
    public Circle2D(){
        this(0, 0, 1);
    }
    //circle with specified x,y and radius
    public Circle2D(double x, double y, double radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    //returns area of a circle
    public double getArea(){
        return Math.sqrt(radius) * Math.PI;
    }
    // returns the perimeter of the circle
    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }
    //returns true if the specified point is with in the circle
    public boolean contains(double x, double y){
        return (Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2) < Math.pow(this.radius, 2));
    }
    //return true if specified circleis inside this circle
    public boolean contains(Circle2D circle) {
        return Math.sqrt(Math.pow(circle.getX() - x, 2) + Math.pow(circle.getY() - y, 2))
                <= Math.abs(radius - circle.getRadius());
    }
    //returns true if the specified circle overlaps this circle
    public boolean overlaps(Circle2D circle) {
        return Math.sqrt(Math.pow(circle.getX() - x, 2) + Math.pow(circle.getY() - y, 2))
                <= radius + circle.getRadius();
    }
    //getter methods
    public double getX(){return x;}
    public double getY(){return y;}
    public double getRadius(){return radius;}

}