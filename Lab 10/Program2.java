// Write a Program to writing a text in the file.
import java.io.FileWriter;
import java.util.Scanner;
public class Program2 {

      public static void main(String[] args) {
            Scanner s=new Scanner(System.in);
            
            System.out.println("Enter the String to be Written in File: ");
            String str=s.nextLine();

            try
            {
                  FileWriter obj=new FileWriter("C:\\Users\\dell\\Documents\\Java\\Lab\\Lab 10\\new.txt");
                  obj.write(str);
                  System.out.println("Successfully Written in File.");
                  obj.close();

            }
            catch(Exception e)
            {
                  System.out.println("An error Occured");

            }
      }
      
}
