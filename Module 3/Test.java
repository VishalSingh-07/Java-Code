import java.security.PublicKey;

class demo1 extends Thread
{
      public void run()
      {
            for(int i=0;i<5;i++)
            {
                  System.out.println("Work 1"+i);
            }
      }
}
class demo2 implements Runnable
{
      public void run()
      {
            System.out.println("Hi");
            for(int i=0; i<5;i++)
            {
      
                  System.out.println("Work 2"+i);
            }
      }
}
public class Test {
      
      public static void main(String[] args) {
            demo1 d1=new demo1();
            demo2 d2=new demo2();

            // d1.start();
            Thread m1= new Thread(d1);
            Thread m2=new Thread(d2);

            m1.start();
            m2.start();

      }
}
/*
---
//example of java synchronized method  
class Table
{  
    synchronized void printTable(int n){//synchronized method  
            for(int i=1;i<=5;i++)
            {  
                  System.out.println(n*i);  
                  try
                  {  
                        Thread.sleep(400);  
                  }
                  catch(Exception e)
                  {
                        System.out.println(e);
                  }  
            }  
      }  
}  
  
class MyThread1 extends Thread
{  
      Table t;  
      MyThread1(Table t)
      {  
            this.t=t;  
      }  
      public void run()
      {  
            t.printTable(5);  
      }  
  
}  
class MyThread2 extends Thread
{  
      Table t;  
      MyThread2(Table t)
      {  
            this.t=t;  
      }  
      public void run()
      {  
            t.printTable(100);  
      }  
}  
  
public class TestSynchronization2{  
      public static void main(String args[]){  
            Table obj = new Table();//only one object  
            MyThread1 t1=new MyThread1(obj);  
            MyThread2 t2=new MyThread2(obj);  
            t1.start();  
            t2.start();  
      }  
}  
*/