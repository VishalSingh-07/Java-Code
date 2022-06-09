import java.util.Scanner;

/*
Write a Java program that prints all real solutions to the quadratic equation
ax2+bx+c = 0. Read in a, b, c and use the quadratic formula. If the
discriminate b2-4ac is negative, display a message stating that there are no
real solutions?
package quadratic.equation;
*/


public class quadratic {

      public static void main(String[] args) 
      {
      
            Scanner r= new Scanner(System.in);
            System.out.print("Enter the value of a: ");
            int a=r.nextInt();
            System.out.print("Enter the value of b: ");
            int b=r.nextInt();
            System.out.print("Enter the value of c: ");
            int c=r.nextInt();
            
            int d,f=0;
            d=b*b-4*a*c;
            
            if(d<0)
            {
                System.out.println("No real Solutions");
                System.out.println("Roots are imaginary");
            }
            else if(d==0)
            {
                
                System.out.println("Roots are real and equal");
                f=1;
                
            }
            else
            {
                System.out.println("Roots are real and unequal");
                f=1;
            }
            if(f==1)
            {
                float root1= (float)(-b+ Math.sqrt(d))/(2*a);
                float root2= (float)(-b- Math.sqrt(d))/(2*a);
                System.out.println("Roots are: "+root1+","+root2);
            }
      
      }
}
