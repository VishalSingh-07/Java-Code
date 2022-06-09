/*
Write a java program to implement Interface.
*/
interface vehicle
{ 
      void changeGear(int a);
      void speedUp(int a);
      void applyBrakes(int a);
}

class Bicycle implements vehicle
{ 
      private int speed;
      private int gear;
      
      public void changeGear(int newGear)
      { 
            gear=newGear; 
      }
        
      public void speedUp(int increment)
      { 
            speed+=increment;
      
      }
      
      public void applyBrakes(int decrement)
      { 
            speed-=decrement; 
      }
          
      void printStates() 
      { 
            System.out.println("Speed: " +speed +" gear: " + gear); 
      }
}

public class Program5 {
      
      public static void main(String[] args) {
            Bicycle b=new Bicycle();
            b.changeGear(2);
            b.speedUp(5);
            b.applyBrakes(1);  
            System.out.println("Bicycle present state: ");
            b.printStates();
      
      }
}
