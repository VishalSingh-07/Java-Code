class vehicle
{
      int wheels;
      int windows;

      vehicle()
      {
            System.out.println("In Default constructor of vehicle");
      }

      vehicle(int a,int b)
      {
            System.out.print("In parameterized Constructor of vehicle: "+a+","+b);
            this.wheels=a;
            this.windows=b;

      
      }
      void display()
      {
            System.out.println("In vehicle Display");
            System.out.println("Wheels: "+wheels+"and Windows: "+windows);
      }
}
class car extends vehicle
{
      car()
      {
            super(100,200);
            super.display();
      }
      @Override
      void display()
      {
            System.out.println("In Car display");

      }

}
public class inheritance_c {

      public static void main(String[] args) {
            car c=new car(); // Default Constructor is called
            c.display();

            vehicle v=new vehicle();
            v.display();

            

      }
      
}
