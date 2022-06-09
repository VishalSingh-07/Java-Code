/*
Write a Program to enter text into file then convert the text to uppercase and then copy the same text into another file.
*/

import java.io.BufferedReader;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.FileReader;
public class Program4 {

      public static void main(String[] args) {
            String str;
            int n, i;
            Scanner s=new Scanner(System.in);
            System.out.print("Enter the number of lines you want to enter in the file: ");
            n=s.nextInt();

            try
            {
                  FileWriter writeobj=new FileWriter("newer.txt");
                  System.out.println("Enter the content of the file: ");
                  for(i=0;i<=n;i++)
                  {
                        str=s.nextLine();
                        writeobj.write(str);
                        writeobj.write("\n");
                  }
                  System.out.print("\n Successfully written into a File newer.");
                  writeobj.close();
            }
            catch(Exception e)
            {
                  System.out.println("\n File error Occured");
            }


            try
            {     FileReader readobj=new FileReader("newer.txt");
                  FileWriter writeobj=new FileWriter("copy.txt"); 
                  BufferedReader br= new BufferedReader(readobj);
                  System.out.println("\n Copying file newer.txt to copy.txt");

                  while((str=br.readLine())!=null)
                  {
                        str=str.toUpperCase();
                        writeobj.write(str);
                        writeobj.write("\n");
                  }

                  readobj.close();
                  writeobj.close();
                  System.out.println("\n Successfully Copied");
            }
            catch(Exception e)
            {
                  System.out.println("An error Occured");
            }

            try
            {
                  FileReader readobj=new FileReader("copy.txt");
                  BufferedReader br= new BufferedReader(readobj);
                  System.out.println("\n Content of the file copy.txt are: ");

                  while((str=br.readLine())!=null)
                  {
                        System.out.println(str);
                  }

                  readobj.close();

                  System.out.println("\n Successfully Read from file copy.txt");
            }
            catch(Exception e)
            {
                  System.out.println("An error Occured");
            }




      }
      
}
