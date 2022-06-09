package Pack;

import java.util.Scanner;
public class Program1 {
      
      
      private int employeenumber;
      private String employeename;
      private String designation;
      private float salary;
      private float increment;
      private float inc_salary;

      public void getdata()
      {
            Scanner s=new Scanner(System.in);
            
            System.out.print("Enter the Employee Name: ");
            employeename=s.nextLine();
            System.out.print("Enter the Employee Number: ");
            employeenumber=s.nextInt();
            System.out.print("Enter the Employee Designation: ");
            designation=s.nextLine();

            System.out.print("Enter the Employee Salary: ");
            salary=s.nextFloat();
            System.out.print("Enter the Employee Salary Increment: ");
            increment=s.nextFloat();

      }
      public void new_Salary()
      {
            inc_salary=(increment*salary)/100;

      }

      public void display()
      {
            System.out.println("Employee Number: "+employeenumber);
            System.out.println("Employee Name: "+employeename);
            System.out.println("Employee Designation: "+designation);
            System.out.println("Employee Salary: "+salary);
            System.out.println("Employee Salary Increment: "+ increment);
            System.out.println("Employee Salary After Increment: "+inc_salary);
      }



}
