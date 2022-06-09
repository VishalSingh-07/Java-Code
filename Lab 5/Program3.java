/*
Calculate area of different geometrical figures(circle, 
rectangle,square, triangle) using function overloading.
*/
import java.util.Scanner;
public class Program3
{

      public static void area(float radius)
      {
            System.out.println("Area of Circle: "+(3.14*radius*radius));


      }
      public static void area(double base, double height)
      {
            System.out.println("Area of traingle: "+(0.5*base*height));
      }
      public static void area(float a, float b)
      {
            System.out.println("Area of rectangle: "+(a*b));
      }
      public static void area(int side)
      {
            System.out.println("Area of Square: "+(side*side));

      }

      public static void main(String[] args) 
      {
       
            Scanner s = new Scanner(System.in);
            int ch=0, option;
            do
            {

                  System.out.println("Enter 1 : For Circle");
                  System.out.println("Enter 2 : For Triangle");
                  System.out.println("Enter 3 : For Rectangle");
                  System.out.println("Enter 4 : For Square");
                  System.out.print("\nEnter option: ");    
                  option=s.nextInt(); 
                  switch(option)
                  {
                        case 1:  
                                    System.out.print("\nEnter radius: "); 
                                    float radius=s.nextFloat();
                                    area(radius);
                                    break;
                        case 2:  
                                    System.out.print("\nEnter base and height: "); 
                                    double base=s.nextDouble();
                                    double height=s.nextDouble();
                                    area(base,height);    
                                     break;
                        case 3:  
                                    System.out.print("Enter Length of rectangle: "); 
                                    float a=s.nextFloat();
                                    System.out.print("Enter Breadth of rectangle: "); 
                                    float b=s.nextFloat();
                                    area(a,b);
                                    break; 
                        case 4:  
                                    System.out.print("\nEnter length: "); 
                                    int len=s.nextInt();
                                    area(len);
                                    break; 
                        
                        default: 
                                    System.exit(0);

                  }

                  System.out.print("\nTo continue enter 1 else enter 0: ");
                  ch = s.nextInt();

  
            }while(ch!=0);
      }
      
}
