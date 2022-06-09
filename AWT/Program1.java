// Write a Program to implement key listener using Abstract Window Toolkit (AWT)

import java.awt.*;
import java.awt.event.*;
import java.util.logging.Formatter;
public class Program1{

      public static void main(String[] args) {
            MyFrame mf=new MyFrame();
      }

      
      
}
class MyFrame extends Frame
{
      TextField t;
      MyFrame()
      {
            setSize(500,600);
            setVisible(true);
            t=new TextField(20);
            setLayout(new FlowLayout());
            add(t);
            t.addKeyListener(new MyKeyListener());

      }

}

class MyKeyListener implements KeyListener
{
      @Override
      public void keyTyped(KeyEvent e)
      {
            System.out.println("key Typed "+e.getKeyChar()+"--->"+e.getKeyCode());
      }
      @Override
      public void keyPressed(KeyEvent e)
      {
            System.out.println("key Pressed "+e.getKeyChar()+"--->"+e.getKeyCode());
      }
      @Override
      public void keyReleased(KeyEvent e)
      {
            System.out.println("key Released "+e.getKeyChar()+"---->"+e.getKeyCode());
      }
}

