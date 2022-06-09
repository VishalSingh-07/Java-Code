import java.util.Scanner;

/*
Write a program which prints the following information
about at least 5 persons:
NAME MAIL-ID EMPLOYEE-CODE PHONE
Eg. Umesh umesh@cse p03161 25764728
    salil salil@cse p03160 25764728
*/

public class Question2 {
      

      public static void main(String[] args)
      {

            Scanner obj= new Scanner(System.in);
            
            System.out.print("Enter the number of Employee: ");
            int n= obj.nextInt();

            int i;

            for(i=1;i<=n;i++)
            {
                  System.out.println("Employee Details: Employee "+i+"");
                  System.out.print("Enter the Employee name: ");
                  

            }
      }
}
