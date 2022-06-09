/*
WAP to create 3 objects of a class and use getters and 
setters to access data variables and methods. 

In this question 
make 2 classes: 
class1 must contain variables, getters, setters, method.. 
class 2.. PSVM.. create objects of class1 and access variables
*/
class class1
{
      int id;
      String name;

      public String getName()
      {
            return name;
      }

      public void setName(String newname)
      {
            name=newname;
      }
      public int getId()
      {
            return id;
      }
      public void setID(int newid)
      {
            id=newid;
      }
}
public class class2 {
      
      public static void main(String[] args) 
      {
            class1 d1= new class1();
            d1.setName("Aman");
            d1.setID(1001);

            class1 d2= new class1();
            d2.setName("Prashant");
            d2.setID(1002);

            class1 d3= new class1();
            d3.setName("Amit");
            d3.setID(1003);


            System.out.println("Employee 1 Name: "+d1.getName());
            System.out.println("Employee 1 Id: "+d1.getId());
            System.out.println("Employee 2 Name: "+d2.getName());
            System.out.println("Employee 2 Id: "+d2.getId());
            System.out.println("Employee 3 Name: "+d3.getName());
            System.out.println("Employee 3 Id: "+d3.getId());




      }
}
