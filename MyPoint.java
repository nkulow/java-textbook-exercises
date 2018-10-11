
public class MyPoint {

    private double x;
    private double y;

    //no-arg constructor
    public MyPoint(){
        this(0, 0);
    }
    //point with specified coordinates
    public MyPoint(double x, double y){
        this.x = x;
        this.y = y;
    }
    //find the distance between this point and specified coordinates
    public double distance(double x, double y){
        double distance = Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2);
        distance = Math.sqrt(distance);
        return distance;
    }
    //find the distance between two different MyPoints
    public double distance(MyPoint MyPoint){
        double distance = Math.pow(this.x - MyPoint.x, 2) + Math.pow(this.y - MyPoint.y, 2);
        distance = Math.sqrt(distance);
        return distance;
    }
    // getter methods for x and y
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
}
