public class TestClock {

   public static void main(String[] args){
      ClockDisplay obj = new ClockDisplay();
      System.out.println("Original Time is " + obj.getTime());
      obj.timeTick();
      obj.timeTick();
      obj.timeTick();
      System.out.println("After 3 time ticks the time is " + obj.getTime());
      
      Clock gui = new Clock();
      
      
   }
}