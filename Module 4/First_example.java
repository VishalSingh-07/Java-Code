import java.awt.*;
public class First_example extends Frame {
      
      First_example()
      {
            Button b=new Button("Click");
            b.setBounds(10,20,100,200);
            add(b);
            setSize(300,300);
            setTitle("Hi");
            setVisible(true);
            b.setBackground(Color.pink);
      }
      public static void main(String[] args) {
            First_example f1 = new First_example();  
      }
      
}
