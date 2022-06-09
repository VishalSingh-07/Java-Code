/*
WAP to increment the employee salaries on the basis of their 
designation(Manager-5000, General Manager-10000, CEO-20000, worker-2000).
Use employee name, id, designation , salary as data member and inc_sal as 
member function.
*/
import java.util.Scanner;
class employee
{
      private String name;
      private String id;
      private String desig;
      private float salary;

      void getdata()
      { 
            Scanner s=new Scanner(System.in);
            System.out.print("\nEnter name: ");
            name=s.nextLine();
            System.out.print("Enter id: ");
            id=s.nextLine();
            System.out.print("Enter designation: ");
            desig=s.nextLine();
            System.out.print("Enter salary: ");
            salary=s.nextFloat();
            inc_sal();
      }
      void inc_sal()
      { 
            if(desig.equalsIgnoreCase("manager"))
            {
                  salary+=5000;
            }      
            else if(desig.equalsIgnoreCase("general_manager"))
            {
                  salary+=10000;
            } 
            else if(desig.equalsIgnoreCase("ceo"))
            {
                  salary+=20000;
            }
            else if(desig.equalsIgnoreCase("worker"))
            {
                  salary+=2000;
            }
                  
      }
      void display()
      { 
            System.out.println("\nName: " +name);
            System.out.println("Id: " +id);
            System.out.println("Designation: " +desig);
            System.out.println("Salary: " +salary);
      }

}

public class Program2 {
      public static void main(String[] args) 
      {
            int n,i;
            Scanner s=new Scanner(System.in);
            System.out.print("Enter the number of records to be entered: ");
            n=s.nextInt();    
            employee e[]=new employee[n];
            for(i=0; i<n; i++)
            { 
                  e[i]=new employee();
                  e[i].getdata();
            }
            System.out.print("\nAfter salary updation records are : ");
            for(i=0; i<n; i++)
             e[i].display();   
  
      }
}
