public class Facto {
      
      static void factorial(int x)
      {
            if(x==0)
            {
                  return;
            }
            else
            {
                  int i,fact=1;
                  for(i=1;i<=x;i++)
                  {
                        fact=fact*i;
                  }
                  System.out.println("The Factorial of "+x+" is: "+fact);
            }
      }
      
      public static void main(String[] args)
      {
            int x=5;
            factorial(x);
      }
}
