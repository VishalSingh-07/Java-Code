import java.awt.*;
import java.awt.event.*;
public class Swap implements ActionListener{

      TextField t1,t2;
      Button b;
      Swap()
      {
            Frame f=new Frame("My Frame");
            
            Label l1=new Label("First");
            Label l2= new Label("Second");

            t1= new TextField(10);
            t2= new TextField(10);

            b= new Button("OK");

            f.add(l1);
            f.add(t1);
            f.add(l2);
            f.add(t2);
            f.add(b);

            f.setLayout(new FlowLayout());
            f.setSize(300,300);
            f.setVisible(true);

            b.addActionListener(this);
      }

      public static void main(String[] args) {
            Swap s=new Swap();
      }

      @Override
      public void actionPerformed(ActionEvent e)
      {
            if(e.getSource()==b)
            {
                  String temp=t1.getText();
                  t1.setText(t2.getText());
                  t2.setText(temp);
            }
      }
      
}
