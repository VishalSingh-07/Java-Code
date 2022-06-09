interface vehicle1
{
      public void display1();
      public void sum1();

}
interface vehicle2
{
      public void display2();
      public void sum2();

}
class test implements vehicle1,vehicle2
{
      public void display1()
      {

      }
      public void sum1()
      {

      }
      public void display2()
      {

      }
      public void sum2()
      {

      }
}
// class test implements Comparable
// {
//       @Override
//       public int CompareTo(Object o)
//       {
//             System.out.println("Comparing");

//       }
// }
public class interface1 {
      
      public static void main(String[] args) {
            test t1= new test();
            test t2=new test();

      }
}
