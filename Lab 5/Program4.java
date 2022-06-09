/*
Write a java program to represent Abstract class with example.
*/
import java.util.Scanner;
abstract class Bank
{ 
      abstract void interest_rate();
      abstract double Simpleinterest(float principal);  
}

class SBI extends Bank
{ 
      private float rate;
      private float amount;
      @Override
      void interest_rate()
      { 
            Scanner s=new Scanner(System.in);
            System.out.print("Enter interest rate: ");  
            rate=s.nextFloat();
      }
      @Override
      double Simpleinterest(float principal)
      { 
            interest_rate();
            amount=(principal*rate)/100;
            return amount;   
      }    
}

public class Program4 {

      public static void main(String[] args) {
            
            Scanner s=new Scanner(System.in);
            float p;
            System.out.print("Enter principal amount: ");
            p=s.nextFloat();
            SBI s1=new SBI();
            System.out.println("Interest amount per annum: " +s1.Simpleinterest(p));

      }
      
}
