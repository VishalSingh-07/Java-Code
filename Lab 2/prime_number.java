import java.util.Scanner;

/*
Write a Java program that prompts the user for an integer and then prints
out all the prime numbers up to that Integer?
*/

public class prime_number {


      public static void main(String[] args)
      {
            Scanner obj=new Scanner(System.in);
            System.out.print("Enter the range of prime number: ");
            int x=obj.nextInt();
            int p;
            System.out.println("Prime number are: ");
            for(int i=2;i<=x;i++)
            {
                  p=0;
                  for(int j=2;j<=i/2;j++)
                  {
                        if(i%j==0)
                        {
                              p=1;
                              break;
                        }
                  }

                  if(p==0)
                  {
                        System.out.print(i+" ");
                  }
                  
            }


      }
      
}
