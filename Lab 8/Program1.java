import java.util.Scanner;
public class Program1 {
   
    static int divideByZero(int a, int b)
    {
        int i;
        i=a/b;
        return i;
    }
   
    static int computeDivision(int a, int b)
    {
        int res=0;
        try
        {
            res=divideByZero(a,b);
        }
        catch(NumberFormatException ex)
        {
            System.out.println("Number Format Exception is Occured");
        }
        return res;
    }
    public static void main(String[] args)
    {
            int i;
            Scanner s=new Scanner(System.in);
            System.out.print("Enter the value of a: ");
            int a=s.nextInt();
            System.out.print("Enter the value of b: ");
            int b=s.nextInt();
            try
            {
                i=computeDivision(a,b);
            }
            catch(ArithmeticException ex)
            {
                System.out.println(ex.getMessage());
            }
    }
   
   
}
