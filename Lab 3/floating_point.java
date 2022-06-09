/*
Write a Java program that reads in two floating-point 
numbers and tests whether they are the same up to three
decimal places.

*/
import java.util.Scanner;

public class floating_point {

      public static void main(String[] args) 
      {
            Scanner re= new Scanner(System.in);
            
            System.out.print("Enter the first floating-point number: ");
            double a = re.nextDouble();

            System.out.print("Enter the Second floating-point number: ");
            double b = re.nextDouble();

            a= Math.round(a*1000);
            a=a/1000;

            b= Math.round(b*1000);
            b=b/1000;

            if(a == b)
            {
                  System.out.println("They are the same up to three decimal places");

            }
            else
            {
                  System.out.println("They are different");
            }

      }
      
}
