/*
Write a Java program to calculate your age.
*/

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Age {

     public static void main(String[] args) 
     {
          //date of birth
          Scanner s=new Scanner(System.in);
          int day, month, year;
   
          System.out.print("Enter day: ");
          day=s.nextInt();
          
          System.out.print("Enter month: ");
          month=s.nextInt();
          
          System.out.print("Enter year: ");
          year=s.nextInt();
          
          System.out.println("Date of Birth: "+day+"-"+month+"-"+year);

          //obtains an instance of LocalDate from a year, month and date
          LocalDate dob = LocalDate.of(year, month, day);
          
          //obtains the current date from the system clock  
          LocalDate currentDate = LocalDate.now();

          //calculates the difference betwween two dates  
          Period p = Period.between(dob, currentDate);
          
          //prints the differnce in years, months, and days  
          System.out.println("\nYour age is");

          System.out.println("I am "+p.getYears()+" years, "+p.getMonths()+" months and "+p.getDays()+" days old");

     }
      
}
