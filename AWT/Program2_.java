/*
Write a Program to implement key listener using abstract Window Toolkit (AWT).
*/
import java.awt.*;
import java.awt.event.*;

import javax.naming.ldap.SortControl;
public class Program2_ implements ActionListener{

      Button b1,b2;

      Label l;

      Program2_()
      {
            b1=new Button("First Button");
            b2=new Button("Second Button");

            l=new Label("hi");
            //b1.setBounds(50,50,100,100);
            //b2.setBounds(50,100,100,100);
            //l.setBounds(50,150,150,100);
            b1.addActionListener(this);
            b2.addActionListener(this);

            Frame f=new Frame();
            f.setVisible(true);

            f.setSize(400,500);
            f.setLayout(new FlowLayout());
            f.setLocation(50,60);
            f.setBackground(Color.GRAY);
            f.add(b1);
            f.add(b2);
            f.add(l);
      }
      @Override
      public void actionPerformed(ActionEvent e)
      {
            b1.getLabel();
            System.out.println(e.getSource()); // we can find that which button is clicked
            Object source =e.getSource();

            if(source==b1)
            {
                  System.out.println("Buttton 1 is clicked");
                  l.setText("Button 1 is clicked");
            }
            if(source==b2)
            {
                  System.out.println("Buttton 2 is clicked");
                  l.setText("Button 2 is clicked");
            }
      }

      public static void main(String[] args) {
            Program2_ d=new Program2_();
      }

      
}
