/*
Write a program to override CompareTo function of
Comparable Interface.
*/
import java.lang.Comparable;
import java.util.Scanner;
class circle implements Comparable<circle>
{
      private float radius;
      private float area;

      public void getdata()
      {
            Scanner s= new Scanner(System.in);
            radius=s.nextFloat();

            area=(float)3.14*radius*radius;
      }

      @Override
      public int compareTo (circle c1)
      {
            float area1=c1.area;
            if (area>area1)
            { 
                  System.out.println("\nCircle 2 has larger area");
                  System.out.println("c1 area: " +c1.area +"\nc2 area: " +area);
            }
            else
            {
                  System.out.println("\nCircle 1 has larger area");
                  System.out.println("c1 area: " +c1.area +"\nc2 area: " +area);   
            }

            return 0;
      
      }

}

public class Program4 {

      public static void main(String[] args) {
            
            circle c1=new circle();
            circle c2=new circle();
            System.out.print("Enter the radius of circle 1: ");  
            c1.getdata();
            System.out.print("Enter the radius of circle 2: ");  
            c2.getdata();
            c2.compareTo(c1);

      }
      
}
