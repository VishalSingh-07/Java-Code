/*
Write a program with given interfaces Motorbike and 
Cycle, then implement in child class TwoWheeler and 
display distance & speed.
*/

import java.util.Scanner;
interface MotorBike
{
      void speed_motorbike();
      
}
interface Cycle
{
      void speed_cycle();
}
class Wheeler
{
      Scanner s=new Scanner(System.in);
      float distance_motorbike,distance_cycle;
      float time_motorbike,time_cycle;
      public void get()
      {
            System.out.print("Enter the distance travelled by motorbike (km): ");
            distance_motorbike=s.nextFloat();
            System.out.print("Enter the Time taken (Hours) by motorbike in "+distance_motorbike+" km distance: ");
            time_motorbike=s.nextFloat();
            System.out.print("Enter the distance travelled by Cycle (km): ");
            distance_cycle=s.nextFloat();
            System.out.print("Enter the Time taken (Hours) by Cycle in "+distance_motorbike+" km distance: ");
            time_cycle=s.nextFloat();
      
      }

}
class TwoWheeler extends Wheeler implements MotorBike, Cycle
{
      float speed_motorbike;
      float speed_cycle;
      public void speed_motorbike()
      {
            
            System.out.println("Distance travelled by motorbike is "+distance_motorbike+" km");
            System.out.println("Time taken: "+time_motorbike+" hours");
            float speed_motorbike= distance_motorbike/time_motorbike;
            System.out.println("Speed travelled by motorbike is : "+speed_motorbike+" km/Hrs");
            
      }
      public void speed_cycle()
      {
            System.out.println("Distance travelled by motorbike is "+distance_cycle+" km");
            System.out.println("Time taken: "+time_cycle+" hours");
            speed_cycle= distance_cycle/time_cycle;
            System.out.println("Speed travelled by motorbike is : "+speed_cycle+" km/Hrs");
      }

}
public class Program2 {
      public static void main(String[] args) {
            TwoWheeler obj1 = new TwoWheeler();
            obj1.get();
            obj1.speed_motorbike();
            obj1.speed_cycle();
      }
      
}
