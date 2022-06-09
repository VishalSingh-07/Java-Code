// Multiple Inheritance of Classes is Not Allowed, of Interfaces is Allowed
// Every Class is Implicitly Defived From Object Class

// Base Class
class Vehicle 
{
      int wheels;
      int windows;

      // Default Constructor
      Vehicle() 
      { 
            System.out.println("Vehicle default constructor"); 
      }

      // Parameterized Constructor
      Vehicle(int a, int b) 
      {
         // Using this to Reference Class Variables (this is Not Necessary to Use)
         this.wheels = a;
         this.windows = b;
         System.out.println("Vehicle parameterized constructor: " + this.wheels +" " + this.windows);
      }

      void display() 
      { 
            System.out.println("Vehicle display");
      }

      void methodToBeOverridden()
      { 
            System.out.println("In Vehicle Class"); 
      }
}

// Abstract Class (If There is Atleast One Abstract Method in a Class, Then the
// Class is Abstract, But Vice Versa is Not True)
abstract class AbstractBase
{
   abstract void method1();
   abstract void method2();
}

// Derived Class 1
class Car1 extends Vehicle 
{ 

}

// Derived Class 2
class Car2 extends Vehicle 
{
      Car2() 
      {
         // Calling the Constructor Of Base Class Using super is Only Possible In
         // Constructor of Derived Class
         super(100, 200);
      }

      void displayCar() 
      {
         // Calling Method of Base Class Via Super
         super.display();

         // Calling Method of Base Class Directly
         display();
      }

      // Overriding the Method methodToBeOverriden, Only Possible if Method is
      // Non-Static
      // Method Signature Remains the Same
      @Override
      void methodToBeOverridden() 
      {
         System.out.println("In Car2 Class");
      }
}

// Derived Class of an Abstract Class Must Implement All Abstract Functions Lest
// it Become Abstract Itself
class AbstractDerived extends AbstractBase 
{
      @Override
      void method1() {
         System.out.println("Implementing Method 1");
      }

      @Override
      void method2() {
         System.out.println("Implementing Method 2");
      }
}

// Interfaces are Collections of Method Declarations Only, Which Need to be
// Further Implemented By a Derived Class Interfaces are Public By Default
interface InterfaceExmample1 
{
   public void method1();
   public void method2();
}

interface InterfaceExmample2 
{
   public void method3();
   public void method4();
}

// Class Which Implements Interfaces
// Note, Multiple Inheritance is Possible with Interfaces
class InterfaceImplementer implements InterfaceExmample1, InterfaceExmample2 
{
   @Override
   public void method1() {
      System.out.println("Implementing Method 1");
   }

   @Override
   public void method2() {
      System.out.println("Implementing Method 2");
   }

   @Override
   public void method3() {
      System.out.println("Implementing Method 3");
   }

   @Override
   public void method4() {
      System.out.println("Implementing Method 4");
   }
}

// Implementing Comparable Interface
class ComparableImplementer implements Comparable 
{
   @Override
   public int compareTo(Object a) {
      System.out.println("Comparing");
      return 0;
   }
}
// Only One Class/Interface can be Public
public class Examples {
     public static void main(String args[]) {
      // Creating Object Via Default Constructor
      Vehicle v1 = new Vehicle();

      // Creating Object Via Parameterized Constructor
      Vehicle v2 = new Vehicle(5, 12);

      // Creating Object of Derived Class Via Default Constructor, Will Also
      // Call Default Constructor of Base Class
      Car1 c1 = new Car1();

      // Creating Object of Derived Class Via Default Constructor, Will Also
      // Call Parameterized Constructor of Base Class Via super
      Car2 c2 = new Car2();

      // Calling Method of Base Class Via super and Directly
      c2.displayCar();

      // Method Before Overriding
      v1.methodToBeOverridden();

      // Method After Overriding
      c2.methodToBeOverridden();

      // Creating Object of Class Which Implements the Methods of Intefaces
      InterfaceImplementer ii1 = new InterfaceImplementer();

      ii1.method1();
      ii1.method2();
      ii1.method3();
      ii1.method4();

      // Creating Object of Class Which Implements the Methods of Comparable
      ComparableImplementer ci1 = new ComparableImplementer();
      ComparableImplementer ci2 = new ComparableImplementer();

      // Method Which Has Been Implemented to Compare Two Objects of
      // ComparableImplementer
      ci1.compareTo(ci2);
   } 
}
