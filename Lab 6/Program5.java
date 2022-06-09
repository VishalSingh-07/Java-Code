/*
Write a program to implement all functions of 
Iterator Interface
*/
import java.util.Iterator;
class List<T> implements Iterable<T>    //Custom Linked List class using Generics
{ 
      Node<T> head, tail;
      public void add(T data)    // add new Element at tail of the linked list in O(1)
      { 
            Node<T> node=new Node<>(data, null);
            if(head==null)
            {
                  tail=head=node;
            }
            else 
            { 
                  tail.setNext(node);
                  tail=node;
            }
      }
      
      public Node<T> getHead()  // return Head
      { 
            return head;
      }
		
      public Node<T> getTail()   // return Tail
      { 
            return tail; 
      }
	
      public Iterator<T> iterator()  // return Iterator instance
      { 
            return new ListIterator<T>(this);
      }
}

class ListIterator<T> implements Iterator<T> 
{ 
      Node<T> current;
      public ListIterator(List<T> list) // initialize pointer to head of the list for iteration
      { 
            current = list.getHead(); 
      }
	
      public boolean hasNext()  //returns false if next element does not exist 
      { 
            return current != null;
      }
	
      public T next()      //return current data and update pointer
      { 
            T data = current.getData();
            current = current.getNext();
            return data;
      }
      
      public void remove()    //implement if needed
      { 
            throw new UnsupportedOperationException(); 
      }
}

class Node<T>  // Constituent Node of Linked List
{ 
      T data;
      Node<T> next;
      public Node(T data, Node<T> next)
      { 
            this.data = data;
            this.next = next;
      }
      public void setData(T data) // Setter getter methods for Data and Next Pointer
      { 
            this.data = data; 
      }
	
      public void setNext(Node<T> next)
      { 
            this.next = next; 
      }
	
      public T getData()
      { 
            return data; 
      }
	
      public Node<T> getNext()
      { 
            return next;
      }
}


public class Program5 {
      
      public static void main(String[] args) {
            
            List<String> myList = new List<>(); // Create Linked List
            myList.add("String 1 abc");
            myList.add("String 2 mno");
            myList.add("String 3 pqr");
            myList.add("String 4 xyz");
  
            for (String string : myList)   //Iterate through the list using For Each Loop
            System.out.println(string);

      }
}
