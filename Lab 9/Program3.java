// Write a Program to create thread by extending thread classes.
import java.util.Scanner;
class X extends Thread
{
      int a;
      X(int n)
      {
            a =n; 
      }
      public void run()
      {
            for(int i=0;i<=a;i++)
            {
                  System.out.println("From Thread A : i = "+i);
            }
            
            System.out.println("Exit from A");
      
      }
 
}
class Y extends Thread
{
      int a;
      Y(int n)
      {
            a =n; 
      }
      public void run()
      {
            for(int i=0;i<=a;i++)
            {
                  System.out.println("From Thread B : i = "+i);
            }

            System.out.println("Exit from B");
      }
      
}
class Z extends Thread
{
      int a;
      Z(int n)
      {
            a =n; 
      }
      public void run()
      {
            for(int i=0;i<=a;i++)
            {
                  System.out.println("From Thread C : i = "+i);
            }
            
            System.out.println("Exit from C");
      }
      
}

public class Program3 {

      public static void main(String[] args) {
            System.out.print("Enter an int : ");
            Scanner s = new Scanner(System.in);
            int n = s.nextInt();
            //System.out.println(n);
            new X(n).start();
            Y b= new Y(n);
            Z c= new Z(n);
            b.start();
            c.start();
      }
}
