/*
Write a Java Program to implement throw.
*/
class MyException extends Exception 
{

      public MyException(String s)
      { 
            super(s);
      }
}

public class Program3 {
      public static void main(String[] args) 
      { 
            try 
            { 
                  throw new MyException("Amity University");
            }
            catch (MyException e) 
            { 
                  System.out.println("Caught");
                  System.out.println(e.getMessage());
            }
      
      }  
  
}
