
package travel.management.system;
import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class ForgotPassword extends JFrame implements ActionListener{
    JTextField t1,t2,t3,t4,t5;
    JButton b1,b2,b3;
    ForgotPassword(){
        setBounds(410, 200, 700, 300);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
          JPanel p=new JPanel();
       // p1.setBackground(new Color(133,193,233));
       p.setBounds(0, 0, 420, 250);
        p.setLayout(null);
        add(p);
        JLabel l1=new JLabel("Username");
        l1.setBounds(20, 10, 100, 25);
        l1.setFont(new Font("Tohoma",Font.BOLD,14));
        p.add(l1);          
        t1=new JTextField();
         t1.setBounds(150, 13, 150, 18);
        t1.setBorder(BorderFactory.createEmptyBorder());
        p.add(t1);
         b1=new JButton("Search");
        b1.setBackground(Color.GRAY);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        b1.setBounds(320, 12, 90, 20);
        p.add(b1);
        JLabel l2=new JLabel("Name");
        l2.setFont(new Font("Tohoma",Font.BOLD,14));
      l2.setBounds(20,38,100,25);
        p.add(l2);
        
        
         t2=new JTextField();
       t2.setBounds(150,42,150,18);
        t2.setBorder(BorderFactory.createEmptyBorder());
        p.add(t2);
        
         JLabel l3=new JLabel("Your Security Question");
        l3.setFont(new Font("Tohoma",Font.BOLD,12));
        l3.setBounds(10,68,140,25);
        p.add(l3);
        
         t3=new JTextField();
        t3.setBounds(150,72,200,18);
        t3.setBorder(BorderFactory.createEmptyBorder());
        p.add(t3);
         JLabel l4=new JLabel("Answer");
        l4.setFont(new Font("Tohoma",Font.BOLD,14));
       l4.setBounds(20,100,110,25);
        p.add(l4);
        
        t4=new JTextField();
        t4.setBounds(150,100,150,18);
        t4.setBorder(BorderFactory.createEmptyBorder());
        p.add(t4);
        b2=new JButton("Retrieve");
        b2.setBackground(Color.GRAY);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        b2.setBounds(320, 100, 90, 20);
        p.add(b2);
        JLabel l5=new JLabel("Password");
        l5.setFont(new Font("Tohoma",Font.BOLD,14));
         l5.setBounds(20,130,100,25);
        p.add(l5);
        
         t5=new JTextField();
        t5.setBounds(150,135,150,18);
        t5.setBorder(BorderFactory.createEmptyBorder());
        p.add(t5);
  b3=new JButton("Back");
        b3.setBackground(Color.GRAY);
        b3.setForeground(Color.WHITE);
        b3.setBounds(120, 180, 100, 25);
        b3.addActionListener(this);
        p.add(b3);
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/forgotpassword.jpg"));
  Image i2= i1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l6=new JLabel(i3);
        l6.setBounds(450,40,200,200);
        add(l6);
    }
        public void actionPerformed(ActionEvent ae){
            Conn c= new Conn();
             if(ae.getSource()==b1){
                 try{
                    String sql="Select * from account where username='"+t1.getText()+"'";
                       ResultSet rs= c.s.executeQuery(sql);
                       while(rs.next()){
                            t2.setText(rs.getString("name"));
                            t3.setText(rs.getString("security"));
                        }
                 }catch(Exception e){
                     
                 }
                
             }
             else if(ae.getSource()==b2){
            try{
                String sql="select * from account where answer='"+t4.getText()+"' AND username='"+t4.getText()+"'";
                ResultSet rs=c.s.executeQuery(sql);
                while(rs.next()){
                    t5.setText(rs.getString("password"));               
                }
            }catch(Exception e){
                
            }
        }
            else if(ae.getSource()==b3){
            this.setVisible(false);
            new Login().setVisible(true);
        }
        }
    public static void main(String args[]){
        new ForgotPassword().setVisible(true);
    }
}
