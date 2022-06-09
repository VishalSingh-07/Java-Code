/*
Write a program to show concept of multiple inheritance
through implementation of interfaces in a class.
*/
import java.util.Scanner;
interface Area
{
      void cylinder_area(float radius,float height);
}
interface Volume
{
      void cylinder_volume(float height, float radius);
}
class  Calculate implements Area,Volume
{
      @Override
      public void cylinder_area(float radius,float height)
      { 
            float area=2*(float)3.14*radius*radius + 2*(float)3.14*radius*height;
            System.out.println("Surface Area of Cylinder is : "+area);

      }
      @Override
      public void cylinder_volume(float height, float radius)
      {
            float volume=(float)3.14*radius*radius*height;
            System.out.println("Volume of Cylinder is : "+volume);
      }
}
public class Program1 {
      
      public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            Calculate obj1= new Calculate();
            System.out.print("Enter the Radius of cylinder: ");
            float radius=s.nextFloat();
            System.out.print("Enter the heigth of cylinder: ");
            float height=s.nextFloat(); 

            obj1.cylinder_area(radius,height);
            obj1.cylinder_volume(height, radius);
      }
      
}
