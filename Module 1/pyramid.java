import java.util.Scanner;

public class pyramid {

      public static void main(String[] args)
      {
            int i,k,j;
            Scanner obj=new Scanner(System.in);
            System.out.print("Enter the Number of rows: ");
            int n= obj.nextInt();

            for (i=0;i<=n;i++)
            {
                  //space
                  for(k=1;k<=n-i;k++)
                  {
                        System.out.print(" ");
                  }
                  for(j=1;j<=2*i-1;j++)
                  {
                        System.out.print("*");

                  }
                  System.out.println("");
            }

      }

      
      
}
