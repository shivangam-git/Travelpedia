
package travel.management.system;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.sql.*;
public class Login extends JFrame implements ActionListener{
    JButton b1,b2,b3;
    JTextField t1;
     JPasswordField t2;
    Login(){
        setLayout(null);
        getContentPane().setBackground(Color.white);// take the jfame and sets its bg color
        setBounds(600,200,640,300);
        
        JPanel p1= new JPanel();// work same as div in html
        p1.setBackground(new Color(131,193,233));
        p1.setBounds(0, 0, 300, 300);
        p1.setLayout(null);
        add(p1);
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/login.png" ));
        Image i2= i1.getImage().getScaledInstance(200, 200,Image.SCALE_DEFAULT);// for scalling image
         ImageIcon i3= new ImageIcon(i2);
        JLabel l1= new JLabel(i3);
        l1.setBounds(50, 40, 200, 200);
        //setVisible(true);
        p1.add(l1);
        // right side pannel
         JPanel p2= new JPanel();
         p2.setLayout(null);
         p2.setBounds(300,30,300,250);
         add(p2);
         JLabel l2= new JLabel("Username");
         l2.setLayout(null);
         l2.setBounds(50, 10, 100, 25);
         l2.setFont(new Font("SAN_SERIF",Font.PLAIN,18));// need this bcz in l2.setbounds username didnt get proper size 
         p2.add(l2);
          t1= new JTextField();
          t1.setLayout(null);
         t1.setBounds(50,40,150,20);
         t1.setBorder(BorderFactory.createEmptyBorder());//to remove the border around textfield
         p2.add(t1);
         JLabel l3= new JLabel("Password");
         l3.setLayout(null);
         l3.setBounds(50, 75, 100, 25);
         l3.setFont(new Font("SAN_SERIF",Font.PLAIN,18));// need this bcz in l2.setbounds username didnt get proper size 
         p2.add(l3);
          t2= new JPasswordField();
          t2.setLayout(null);
         t2.setBounds(50,105,150,20);
         t2.setBorder(BorderFactory.createEmptyBorder());//to remove the border around textfield
         p2.add(t2);
          b1= new JButton("Login");
         b1.setBounds(50,140,90,20);
         b1.setBackground(new Color(133,193,233));
         b1.setForeground(Color.white);
         b1.setBorder(BorderFactory.createEmptyBorder());//to remove the border around textfield
       b1.addActionListener(this);
         p2.add(b1);
          b2= new JButton("SignUp");
         b2.setBounds(150,140,90,20);
         b2.setForeground(new Color(133,193,233));
         b2.setBackground(Color.white);
         b2.setBorder(new LineBorder(new Color(133,193,233)));//to remove the border around textfield
        b2.addActionListener(this);
         p2.add(b2);
         
         b3= new JButton("Forget Password");
         b3.setBounds(60,170,110,20);
         b3.setForeground(new Color(133,193,233));
         b3.setBackground(Color.white);
         b3.setBorder(new LineBorder(new Color(133,193,233)));//to remove the border around textfield
        b3.addActionListener(this);
         p2.add(b3);
         
         JLabel l4= new JLabel("Trouble in login..");
         l4.setBounds(180,170,110,20);
         l4.setForeground(Color.red);
         p2.add(l4);
         setVisible(true);
    }
    // override
    public void actionPerformed (ActionEvent ae){
        if(ae.getSource()==b1){// if button 1 clicked
            try{
                String username=t1.getText();
                char ch[] =t2.getPassword();
                String password=String.valueOf(ch);
                String sql="select * from account where username='"+username+"' AND password='"+password+"'";
               
                Conn c=new Conn();
                //  System.out.print(password);
                 ResultSet rs= c.s.executeQuery(sql);
              
                if(rs.next()){// if sql query is executed i.e.if login credential matches in db
                  
                    this.setVisible(false);// close login frame
                    new Loading(username).setVisible(true);// open loading frame
                }else{
                    JOptionPane.showMessageDialog(null,"invalid Login");
                }
            }catch(Exception e){
                
            }
        }
        else  if(ae.getSource()==b2){// if button 2 clicked
            this.setVisible(false);// this pont to login class and iski visibilty false lri kyunki ye sihnup frame khulne ke baad v show ho rha tha signup frame ke piche
            new Signup().setVisible(true);// to open the signup frame
        }
       else if(ae.getSource()==b3){// if button 3 clicked
            this.setVisible(false);
            new ForgotPassword().setVisible(true);
        }
    }
    public static void main(String args[]){
        new Login();
    }
}
