// Write a program to create a text file.
import java.io.File;
public class Program1 {
      public static void main(String[] args) {
            File F= new File("new.txt");
            System.out.println("if File already Exists (T/F)? : "+F.exists());

            try 
            {
                  if(F.createNewFile())
                  {
                        System.out.println("File Created");
                  }
                  else
                  {
                        System.out.println("File Already Exists");
                  }
            }
            catch (Exception e) 
            {
                  System.out.println(e);
            }

            System.out.println("Name of the File is: "+F.getName());

      }
 

}

