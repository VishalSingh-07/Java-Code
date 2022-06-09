public class demo_ extends Thread{
      
      public void run()
      {
            System.out.println("Hello");
      }
      public static void main(String[] args) {
            demo_ d= new demo_();
            d.start(); // Start the thread
      }

}
