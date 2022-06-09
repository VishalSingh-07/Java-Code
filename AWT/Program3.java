/*
Write a program to implement Mouse Listener using Abstract Window Toolkit (AWT).
*/
import java.awt.*;
import java.awt.event.*;
public class Program3 extends Frame implements MouseListener
{

      Label l;
      Program3()
      {
            addMouseListener(this);
            l=new Label();
            l.setBounds(10,20,100,200);
            add(l);
            setSize(200,200);
            setLayout(null);
            setVisible(true);
      }
      public static void main(String[] args) {
            Program3 ss=new Program3();
      }

      @Override   
      public void mouseClicked(MouseEvent e)
      {
            l.setText("Mouse Clicked");
      }
      @Override  
      public void mouseEntered(MouseEvent e)
      {
            l.setText("Mouse Entered");
      }
      @Override  
      public void mouseExited(MouseEvent e)
      {
            l.setText("Mouse Exited");
      }
      @Override  
      public void mousePressed(MouseEvent e)
      {
            l.setText("Mouse Pressed");
      }
      @Override  
      public void mouseReleased(MouseEvent e)
      {
            l.setText("Mouse Released");
      }

      
}
