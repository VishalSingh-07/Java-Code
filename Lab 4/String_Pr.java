import java.util.Scanner;

public class String_Pr {
      
      public static void main(String[] args) {
            
            Scanner str = new Scanner(System.in);
            System.out.print("Enter the String: ");
            String x= str.nextLine();

            // nexline() -- Take character after and before space
            // next() -- Take character before space

            System.out.println(x);

            System.out.print("Length of the string is :"+x.length());
            System.out.print("\nMy name is "+x+".");
            char ch;
            ch=x.charAt(5);
            System.out.println("Alphabet at index 5 is : "+ch);

      }
}
