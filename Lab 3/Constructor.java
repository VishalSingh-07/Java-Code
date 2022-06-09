/*
Write a Program to illustrate default and parametrised constructor
concept. 
*/
class calculation
{
      int num1,num2,result;

      public calculation() // Default Constructor
      {
            num1=14;
            num2=15;
      }

      public calculation(int num1,int num2) // Parameterized constructor
      {
            this.num1=num1;
            this.num2=num2;

      }
      void addition()
      {
            result=num1+num2;
            System.out.println("Addition of "+num1+" and "+num2+" is : "+result);
      }

}
public class Constructor {
      
      public static void main(String[] args)
      {
            // Creating object for default constructor
            calculation object1 = new calculation();
            System.out.println("By using Default Constructor");
            object1.addition();

            // Creating object for parameterized constructor
            calculation object2 = new calculation(500,5);
            System.out.println("By using Parameterized Constructor");
            object2.addition(); 
            
      }

}
