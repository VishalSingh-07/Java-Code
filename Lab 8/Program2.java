/*
Write a Java Program to implement try, catch and finally statements.
*/
import java.util.Scanner;
public class Program2 {
      public static void main(String[] args) 
      { 
            Scanner s=new Scanner(System.in);
            int a;
            int b;
    
            try
            { 
                  System.out.print("Enter value of a: ");    
                  a=s.nextInt();
                  System.out.print("\nEnter value of b: ");  
                  b=s.nextInt();
                  int result=a/b;
                  System.out.println("\nResult: " +result);
            }    
             
            catch(ArithmeticException e)
            { 
                  System.out.println("\nArithmetic Exception block " +e.getMessage());   
            }
            
            try
            { 
                  int c[]=new int[2];
                  for(int i=0; i<3; i++)
                  { 
                        System.out.print("\nEnter c[" +i +"]: ");
                        c[i]=s.nextInt(); 
                  }  
            }
             
            catch(ArrayIndexOutOfBoundsException e)  
            { 
                  System.out.println("\nArrayIndexOutOfBounds Exception block");  
            }
   
            catch(NullPointerException e)
            { 
                  System.out.println("Null point exception caught");
            }
            
            catch(Exception e)
            { 
                  System.out.println("\nException e block " );  
            }
      
            finally
            { 
                  System.out.println("\nProgram terminated successfully"); 
            }
    
      }  


}
