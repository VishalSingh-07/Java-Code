import java.awt.*;
import java.awt.event.*;
public class Login {
      
      Frame f;
      Button b1,b2;
      Label l1,l2,l3;
      TextField t1,t2;
      Login()
      {
            f=new Frame("Log in ");
            b1=new Button(" Log in");
            b2=new Button("Cancel");

            f.setTitle("Log in");
            t1=new TextField(15);
            t2=new TextField(15);
            t2.setEchoChar('*');

            l1=new Label("User name");
            l2=new Label("Password");
            l3=new Label("");
            f.add(l1);
            f.add(t1);
            f.add(l2);
            f.add(t2);
            f.add(b1);
            f.add(b2);
            f.add(l3);
            f.setLayout(new FlowLayout());
            f.setSize(235,250);
            f.setVisible(true);
            b1.setBackground(Color.blue);
            b1.setForeground(Color.white);
            b2.setBackground(Color.blue);
            b2.setForeground(Color.white);
            b1.addActionListener(new ActionListener()
            {
                 public void actionPerformed(ActionEvent e){
                       String user=t1.getText();
                       String password=t2.getText();
                       if(user.equals("Vishal") && password.equals("123"))
                       {
                             l3.setText("Login Sucessfully");

                       }
                         
                 }
            });
            b2.addActionListener(new ActionListener()
            {
                 public void actionPerformed(ActionEvent e){
                       t1.setText("");
                       t2.setText("");
                         
                 }
            });

      

      }
      public static void main(String[] args) {
            Login lg=new Login();
      }
      
}
