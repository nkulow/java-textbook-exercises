public class RGBPoint {

    private double x;
    private double y;
    private int r;
    private int g;
    private int b;

    //initialize fields
    public RGBPoint(double x, double y, int r, int g, int b){
        this.x = x;
        this.y = y;
        this.r = r;
        this.g = g;
        this.b = b;
    }
    //give RGB default value
    public RGBPoint(double x, double y){
        this(x, y, 255, 255, 255);
    }
    // set default value for coordinates
    public RGBPoint(int r, int g, int b){
        this(0.0, 0.0, r, g, b);
    }
    // no-arg constructor to set coordinates and RGB values
    public RGBPoint(){
        this(0.0,0.0,255,255,255);
    }
    // merge colors with specified RGB values
    public void mergeColors(int r, int g, int b){
        int newR = Math.abs(this.r - r);
        int newG = Math.abs(this.g - g);
        int newB = Math.abs(this.b - b);
        System.out.println("RGB: " + newR + ", " + newG + ", " + newB);
    }
    // merge colors between two different RGBPoints
    public void mergeColors(RGBPoint other){
        int newR = Math.abs(this.r - other.r);
        int newG = Math.abs(this.g - other.g);
        int newB = Math.abs(this.b - other.b);
        System.out.println("RGB: " + newR + ", " + newG + ", " + newB);
    }
    // display all info contained in object's fields
    public void display(){
        System.out.println("x = " + this.x);
        System.out.println("y = " + this.y);
        System.out.print("RGB = " + this.r + ", ");
        System.out.print(this.g + ", ");
        System.out.print(this.b + ", ");
    }
    // get distance between this object and the other object passed in the parameter
    public double distance(RGBPoint other){
        double distance = Math.pow(this.x - other.x, 2) + Math.pow(this.y - other.y, 2);
        return Math.sqrt(distance);
    }
}

// class to test RGBPoint
class TestRGBPoint{
    public static void main(String[] args){
        // create two objects
        RGBPoint obj1 = new RGBPoint();
        RGBPoint obj2 = new RGBPoint(4, 10, 224, 180, 290);
        RGBPoint obj3 = new RGBPoint(4, 30);
        RGBPoint obj4 = new RGBPoint(255, 320, 200);

        //test methods

        System.out.println("\nObject 1 is to test default values... ");
        obj1.display();
        System.out.println("\n\nObject 2 is to test when given all values... ");
        obj2.display();
        System.out.println("\n\nObject 3 is to test when only given coordinates x and y... ");
        obj3.display();
        System.out.println("\n\nObject 4 is to test when only given the RGB values... ");
        obj4.display();

        System.out.print("\n\nTo test when merging colors with obj 3 and specific values 200, 260, and 110: ");
        obj3.mergeColors(200, 260, 110);

        System.out.print("To test when merging object 2 and object 4 together: ");
        obj2.mergeColors(obj4);

        System.out.println("To test the distance between object 1 and object 3: " +
                obj1.distance(obj3));

    }
}