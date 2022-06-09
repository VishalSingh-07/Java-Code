/*
Write a program in Java to make such a pattern like a 
pyramid with a number which will repeat the number in 
the same row.
*/
import java.util.Scanner;
public class pyramid {

      public static void main(String[] args)
      {
            Scanner sc= new Scanner(System.in);

            // Taking the number of rows from the user.
            System.out.print("Enter the Number of rows: ");
            int rows=sc.nextInt();
      
            int rowcount=1;
      
            for(int i=rows;i>0;i--)
            {
                  // Printing i spaces at the beginning
                  for(int j=1; j<=i;j++)
                  {
                        System.out.print(" ");
                  }
      
                  // Printing rowcount value 'rowcount' times at the end of each row
                  for(int j=1;j<=rowcount;j++)
                  {
                        System.out.print(rowcount+" ");
      
                  }
                  System.out.println();
      
                  // Incrementing the rowcount
                  rowcount++;
      
            }
            
      }
      
}
