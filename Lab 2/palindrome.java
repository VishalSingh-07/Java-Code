import java.util.Scanner;

/*
Write a Java program that checks whether a given string is a palindrome or
not. Ex: MADAM is a palindrome?
*/

public class palindrome {
      
      public static void main(String[] args)
      {
            Scanner obj=new Scanner(System.in);
            System.out.print("Enter a String: ");
            String str=obj.nextLine();
            String rev="";

            int length=str.length();
            for(int i=length-1;i>=0;i--)
            {
                  rev=rev+str.charAt(i);
            }
            if(str.equals(rev))
            {
                  System.out.println(str+" is a palindrome");
            }
            else
            {
                  System.out.println(str+" is not a palindrome");
            }
      }
}
