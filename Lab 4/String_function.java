// Write a program to illustrate the String Function
public class String_function {

      public static void main(String[] args) 
      {
            char x[]=new char[]{'h','e','l','l','O'};
            String y = new String (x);
            System.out.println("Char to string s1: " +y);
      
            String s1="Hello";
            String s2="Hello";
            String s3="meklo";
            String s4="hemlo";
            String s5="flag";
            
            System.out.println("When string is equal: " +s1.equals(s2)); // Give true/false
            System.out.println("When string is not equal: " +s1.equals(s3));
            
            System.out.println("Index of k in s3: " +s3.indexOf('k'));

            char ch;
            ch=s2.charAt(1);
            System.out.println("Alphabet at index 1 of the string "+s2+" is : "+ch);
            
            System.out.println("Comparing the String using compareTo function: ");
            System.out.println("Comparing the string "+s1+" and "+s2+" is: "+s1.compareTo(s2));
            System.out.println("Comparing the string "+s1+" and "+s3+" is: "+s1.compareTo(s3));
            System.out.println("Comparing the string "+s1+" and "+s5+" is: "+s1.compareTo(s5));
            
            System.out.println("Upper case of string "+s2+" is :"+s2.toUpperCase());
            System.out.println("String length of s4: " +s4.length());
            
            System.out.println("String concat: " +s1.concat(s5));
            
            System.out.println("Substring: "+ s5.substring(1));
            
            String a1="    Today is a good day.";
            System.out.println("\nAfter trim: " +a1.trim());
            System.out.println("Replace function: " +a1.replace('d','D'));
                    
            //String Buffer
            StringBuffer sb=new StringBuffer("My World");
            System.out.println("Length of string: " +sb.length());
            System.out.println("Capacity of string: " +sb.capacity());
            System.out.println("Char at index 1: " +sb.charAt(1));
            System.out.println("Insert string: " +sb.insert(8," Earth"));
            System.out.println("String Reverse: " +sb.reverse());
      
      }
      
}
