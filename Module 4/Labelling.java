import java.awt.*;
import java.awt.event.*;
public class Labelling extends Frame implements ActionListener {
      
      Button b,b1,b2;
      Label l;
      Labelling()
      {
            
            b=new Button("Click");
            b1=new Button("Add");
            b2=new Button("Sign up");
            l=new Label();
            b.setBounds(10,20,50,100);
            b1.setBounds(70,20,50,100);
            b2.setBounds(130,20,50,100);
            b2.setBackground(Color.LIGHT_GRAY);
            b2.setForeground(Color.yellow);
            setSize(300,300);
            setTitle("Hi");
            // setLayout(new FlowLayout());
            setVisible(true);
            setBackground(Color.pink);
            
            b.addActionListener(this);
            b1.addActionListener(this);
            b2.addActionListener(this);
            
            add(b);
            add(b1);
            add(b2);
            add(l);
            
           
      }
      public void actionPerformed(ActionEvent ae)
      { 

            Object s=ae.getSource();
            if(s==b){
                  System.out.println("click Button  is clicked");
                  // l.setText("Button is Clicked");
            }
            if(s==b1){
                  System.out.println("Add Button  is clicked");
                  // l.setText("Button is Clicked");
            }
            if(s==b2)
            {
                  System.out.println("Sign up Button  is clicked");
                  // l.setText("Button is Clicked");

            }
            
      }
      public static void main(String[] args) {
            Labelling f1 = new Labelling();  
      }
      
      
}
