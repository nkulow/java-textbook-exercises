
public class testCircle2D {
    //main
    public static void main(String[] args){

        Circle2D c1 = new Circle2D(2, 2, 5.5);

        System.out.println("Perimeter of c1: " + c1.getPerimeter() + "\nArea: of c1" + c1.getArea());
        System.out.println("\nc1 contains the points (3, 3): " + c1.contains(3, 3));
        System.out.println("\nc1 contains the the new circle with a center at (4, 5) and a radius of 10.5: " +
                c1.contains(new Circle2D(4, 5, 10.5)));
        System.out.println("\n c1 overlaps the new circle with a center at (3, 5) and a radius of 2.3: " +
                c1.overlaps(new Circle2D(3, 5, 2.3)));


    }
}