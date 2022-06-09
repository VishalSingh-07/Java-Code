import java.awt.*;

public class Secocnd_Example {
      Secocnd_Example()
      {
            Frame f=new Frame();
            Button b=new Button("Click");
            b.setBounds(10,20,100,200);
            f.add(b);
            f.setSize(300,300);
            f.setTitle("Good Morning");
            f.setVisible(true);
            b.setBackground(Color.yellow);

      }
      public static void main(String[] args) {
            Secocnd_Example example=new Secocnd_Example();
      }
      
}
