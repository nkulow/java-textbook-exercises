public class testMyPoint {
    public static void main(String[] args){

        MyPoint point1 = new MyPoint(10, 30.5);
        MyPoint point2 = new MyPoint(0, 0);

        System.out.printf("\nThe distance between point 1 and point 2 is %1.2f \n",  point1.distance(point2));
    }
}
