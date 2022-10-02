


package travel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class ViewCustomer extends JFrame implements ActionListener {
    
      JButton b2;
     ViewCustomer(String username){
        setBounds(350, 80, 860, 600);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
          
        JLabel l1=new JLabel("Username : ");
        l1.setBounds(20,30,150,25);
        add(l1);
        
        JLabel l11=new JLabel();
        l11.setBounds(220,30,150,25);
        add(l11);
         JLabel l2=new JLabel("ID : ");
        l2.setBounds(20,90,150,25);
        add(l2);
        
         JLabel l12=new JLabel();
        l12.setBounds(220,90,150,25);
        add(l12);
        JLabel l3=new JLabel("Number : ");
        l3.setBounds(20,150,100,25);
        add(l3);
        
        JLabel l13=new JLabel();
        l13.setBounds(220,150,150,25);
        add(l13);
        JLabel l5=new JLabel("Gender : ");
        l5.setBounds(20,210,100,25);
        add(l5);
      JLabel l14=new JLabel();
        l14.setBounds(220,210,150,25);
        add(l14);
        JLabel l6=new JLabel("Country : ");
        l6.setBounds(20,270,150,25);
        add(l6);
        
       JLabel l15=new JLabel();
        l15.setBounds(220,270,150,25);
        add(l15);
        JLabel l7=new JLabel("Address : ");
        l7.setBounds(500,30,150,25);
        add(l7);
        
        JLabel l16=new JLabel();
        l16.setBounds(690,30,150,25);
        add(l16);
        JLabel l8=new JLabel("Phone : ");
        l8.setBounds(500,90,150,25);
        add(l8);
        
        JLabel l17=new JLabel();
        l17.setBounds(690,90,150,25);
        add(l17);
         JLabel l9=new JLabel("Email : ");
        l9.setBounds(500,150,150,25);
        add(l9);
        
       JLabel l18=new JLabel();
        l18.setBounds(690,150,150,25);
        add(l18);
        JLabel l4=new JLabel("Name : ");
        l4.setBounds(500,210,150,25);
        add(l4);
        JLabel l19=new JLabel();
        l19.setBounds(690,210,150,25);
        add(l19);
       
         b2=new JButton("Back");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
      b2.addActionListener(this);
        b2.setBounds(300,350,90,20);
        add(b2);
         ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/viewall.jpg"));
        Image i2=i1.getImage().getScaledInstance(400, 200, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l10= new JLabel(i3);
        l10.setBounds(0,400,400,200);
        add(l10);
          ImageIcon i4=new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/viewall.jpg"));
        Image i5=i1.getImage().getScaledInstance(400, 200, Image.SCALE_DEFAULT);
        ImageIcon i6=new ImageIcon(i5);
        JLabel l20= new JLabel(i6);
        l20.setBounds(400,400,400,200);
        add(l20);
        // jab bhi addpersonal detail or add customer vala frame khule toh username and name pehle se filled hue ane chaiye 
          try{
            Conn c=new Conn();
            ResultSet rs= c.s.executeQuery("select * from customer where username = '"+username+"'");
            
            while(rs.next()){// jump from col to col
                // System.out.println("hello");
                l11.setText(rs.getString("username"));
                l12.setText(rs.getString("id"));
                l13.setText(rs.getString("number"));
                l14.setText(rs.getString("gender"));
                l15.setText(rs.getString("country"));
                l16.setText(rs.getString("address"));
                l17.setText(rs.getString("phone"));
                l18.setText(rs.getString("email"));
                l19.setText(rs.getString("name"));
                // System.out.println("hello");
            }
            // System.out.println("hello");
        }catch(Exception e){
        
        }   
     }
         public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b2){
            this.setVisible(false);
        }
             
         }
     public static void main(String args[]){
         new ViewCustomer("").setVisible(true);
     }
}
