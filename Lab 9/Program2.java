// Writa a Program to create a thread by implemeneting  runnnable interface.
import java.util.Scanner;
class A implements Runnable
{
      int a;
      A(int n)
      {
            a =n; 
      }
      public void run(){
      for(int i=0;i<=a;i++)
      {
            System.out.println("From Thread A : i = "+i);
      }
            System.out.println("Exit from A");
      }
}
class B implements Runnable
{
      int a;
      B(int n)
      {
            a =n; 
      }
      public void run(){
      for(int i=0;i<=a;i++)
      {
            System.out.println("From Thread B : i = "+i);
      }
            System.out.println("Exit from B");
      }
}
class C implements Runnable
{
      int a;
      C(int n)
      {
            a =n; 
      }
      public void run(){
      for(int i=0;i<=a;i++)
      {
            System.out.println("From Thread C : i = "+i);
      }
            System.out.println("Exit from C");
      }
}

public class Program2 {

      public static void main(String[] args) {
            System.out.print("Enter an int : ");
            Scanner s = new Scanner(System.in);
            int n = s.nextInt();
            //System.out.println(n);
            A a=new A(n);
            B b= new B(n);
            C c= new C(n);
            Thread m1 = new Thread(a);
            Thread m2 = new Thread(b);
            Thread m3 = new Thread(c);
            m1.start();
            m2.start();
            m3.start();

      }
      
}
