/*
Write a Java program to find the number of days in a
month.
*/
import java.util.Scanner;


public class Days {
      
      public static void main(String[] args) {
            
            Scanner inp = new Scanner(System.in);

            int days=0;
            String monthname=" ";

            System.out.print("Enter the month number: ");
            int month = inp.nextInt();


            System.out.print("Enter the Year: ");
            int year = inp.nextInt();

            switch(month)
            {
                  case 1:
                              monthname="January";
                              days=31;
                              break;
                  case 2:
                              monthname="February";
                              if( (year%400 == 0)|| ((year%4 == 0) && (year%100 !=0)))
                              {
                                    days=29;

                              }
                              else
                              {
                                    days=28;
                              }

                              break;
                  case 3:
                              monthname="March";
                              days=31;
                              break;
                  case 4:
                              monthname="April";
                              days=30;
                              break;
                  case 5:
                              monthname="May";
                              days=31;
                              break;
                  case 6:
                              monthname="June";
                              days=30;
                              break;
                  case 7:
                              monthname="July";
                              days=31;
                              break;
                  case 8:
                              monthname="August";
                              days=31;
                              break;
                  case 9:
                              monthname="September";
                              days=30;
                              break;
                  case 10:
                              monthname="October";
                              days=31;
                              break;
                  case 11:
                              monthname="November";
                              days=30;
                              break;
                  case 12:
                              monthname="December";
                              days=31;
                              break;
                  default:
                              System.out.println("Wrong Month number!!!!");
            }

            System.out.println(monthname+" "+year+ " has " +days+ " days");




      }

}
