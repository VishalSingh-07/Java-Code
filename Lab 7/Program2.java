/* Write a Program in Java to create Immutable class*/
final class Employee
{ 
      final private String aadharNo;
      final private String pancard;
      
      public Employee(String aadharNo, String pancard)
      { 
            this.aadharNo=aadharNo;
            this.pancard=pancard;
      }
      public String getaadharNo()
      { 
            return aadharNo;
      }
      public String getpancard()
      { 
            return pancard;
      }  
}

public class Program2 {

      public static void main(String[] args) 
      { 
            Employee e=new Employee("3090 3456 1285","AB34568");
            String s1=e.getaadharNo();
            String s2=e.getpancard();
            
            System.out.println("Aadhar Number: " +s1);
            System.out.println("Pancard Number: " +s2);
      } 

}
