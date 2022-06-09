// Write a Program to implement the threads
public class program1 extends Thread{
       public void run()
      {
            System.out.println("This Code is running in a thread.");
      }
      public static void main(String[] args) {

            program1 thread=new program1();
            thread.start();
            System.out.println("This code is outside of the thread");
            System.out.println("Thread is alive: "+thread.isAlive()); // Checking whether thread is alive or not.
            
      }
      
}
