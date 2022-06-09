/*
Write a java Program to implements throws.
*/
class demo extends Throwable
{
      static void fun() throws IllegalAccessException
      { 
        
            System.out.println("Inside void function ");
            throw new IllegalAccessException("demo");
      }    
}

public class Program4 {
      public static void main(String[] args)
      {  
            try
            { 
                  demo d=new demo();
                  d.fun();
            }
     
            catch(IllegalAccessException e)
            { 
                  System.out.println("caught in catch block");
                  System.out.println(e.getMessage());
            }  
   }  

}
