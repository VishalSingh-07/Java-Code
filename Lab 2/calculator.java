import java.util.Scanner;

// Write a Java program that works as a simple calculator.

public class calculator {
   
      public static void addition(int a, int b)
      {
            int result;
            result=a+b;
            System.out.println("Addition of "+a+" and "+b+" is : "+result);

      }
      public static void subtraction(int a, int b)
      {
            int result;
            result=a-b;
            System.out.println("Subtraction of "+a+" and "+b+" is : "+result);

      }
      public static void multiplication(int a, int b)
      {
            int result;
            result=a*b;
            System.out.println("Multiplication of "+a+" and "+b+" is : "+result);

      }
      public static void division(int a, int b)
      {
            float result;
            result=a/b;
            System.out.println("Division of "+a+" and "+b+" is : "+result);

      }
      public static void main(String[] args)
      {
            int choice,a,b;
            Scanner r=new Scanner(System.in);
            System.out.print("Enter the value of a: ");
            a=r.nextInt();
            System.out.print("Enter the value of b: ");
            b=r.nextInt();

            System.out.println("Enter 1: For addition");
            System.out.println("Enter 2: For Subtraction");
            System.out.println("Enter 3: For multiplication");
            System.out.println("Enter 4: For Division");
            System.out.print("Enter your choice: ");
            choice=r.nextInt();

            switch(choice)
            {
                  case 1: 
                              addition(a,b);
                              break;
                              
                  case 2:
                              subtraction(a,b);
                              break;
                  
                  case 3:
                              multiplication(a,b);
                              break;
                              
                              
                  case 4:
                              division(a,b);
                              break;
                              
                  default:
                              System.out.println("Wrong Choice!!!!");            
            }

            
      }
}
