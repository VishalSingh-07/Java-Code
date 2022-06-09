
public class logical_vs_bitwise {


      public static void main(String args[])
      {
            int a=10;
            int b=5;
            int c=20;
            System.out.println(a<b && a++<c);
            // False && true =False
            System.out.println(a);
            // 10 because second condition is not checked
            System.out.println(a<b & a++<c);
            // False & true = False
            System.out.println(a);
            // 11 because second condition is checked
      }
      
}
