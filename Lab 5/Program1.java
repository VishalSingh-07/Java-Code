/*
WAP a program to maintain the student record containing
roll number , Name, marks1, marks2, marks3 as data member
and getdata(), display() and setdata() as member functions.
*/
import java.util.Scanner;
class student
{
      Scanner x= new Scanner (System.in);
      String name;
      int rollno, marks1, marks2, marks3;
      void getdata()
      {
            
            System.out.print("Enter the Name of the Student: ");
            name = x.nextLine();

            System.out.print("Enter the Roll no: ");
            rollno=x.nextInt();
      
      }
      void marks()
      {
            System.out.print("Enter the marks of Physics: ");
            marks1=x.nextInt();
            System.out.print("Enter the marks of Chemistry: ");
            marks2=x.nextInt();
            System.out.print("Enter the marks of Mathematics: ");
            marks3=x.nextInt();
      }
      void display()
      {
            
            System.out.println("Name: "+name);
            System.out.println("Roll Number: "+rollno);
            System.out.println("Physics Marks: "+marks1);
            System.out.println("Chemistry Marks: "+marks2);
            System.out.println("Mathematics Marks: "+marks3);
      }
      void setdata()
      {

      }
}
public class Program1 {

      public static void main(String[] args) 
      {
            Scanner y = new Scanner(System.in);
            System.out.print("Enter the number of students: " );
            int n = y.nextInt();
            student obj[]=new student[n];
            for(int i=0;i<n;i++)
            {
                  System.out.println("Student "+(i+1)+": ");
                  obj[i]=new student();
                  obj[i].getdata();
                  obj[i].marks();
                  
            }
            System.out.println("Student Details: ----");
            for(int i=0;i<n;i++)
            {
                  System.out.println("Student "+(i+1)+": ");
                  obj[i].display();
            }
            


            
      }
      
}
