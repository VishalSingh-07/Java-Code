// Write a Program to reading a text from a file.
import java.io.BufferedReader;
import java.io.FileReader;
public class Program3 {

      public static void main(String[] args) {

            try
            {
                  FileReader FR=new FileReader("C:\\Users\\dell\\Documents\\Java\\Lab\\Lab 10\\new.txt");
                  BufferedReader br= new BufferedReader(FR);
                  System.out.println("Content in file is : ");
                  String line;

                  while((line=br.readLine())!=null)
                  {

                        System.out.println(line);

                  }
                  FR.close();

                  System.out.println("Successfully Read from file");

            }
            catch(Exception e)
            {
                  System.out.print("An error Occured");

            }

            
            
      }
      
}
