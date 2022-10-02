
package travel.management.system;
import java.awt.BorderLayout;
import java.awt.*;
import java.awt.EventQueue;

import javax.swing.border.EmptyBorder;

import java.awt.Font;
import java.awt.Image;
import java.sql.*;	
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class BookHotel extends JFrame implements ActionListener{
    JLabel l21,l22,l23,l24,l25;
    Choice c1,c2,c3;
    JTextField t1,t2;
    JButton b1,b2,b3;
  public BookHotel(String username) {
		setBounds(300,150,850,550);
                getContentPane().setBackground(Color.white);
                setLayout(null);
                JLabel l1= new JLabel("BOOK Hotel");
                l1.setFont(new Font("Tahome",Font.PLAIN,24));
                l1.setBounds(140,6,200,30);
                add(l1);
                JLabel l2=new JLabel("Username: ");
        l2.setBounds(40,70,100,30);
        l2.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(l2);
        
        l21=new JLabel();
        l21.setBounds(250,70,200,30);
        l21.setFont(new Font("Tahoma",Font.PLAIN,20));
        add(l21);
         JLabel l3=new JLabel("Select Hotel: ");
        l3.setBounds(40,110,100,30);
        l3.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(l3);    
       
        c1= new Choice();
         try{
         Conn c= new Conn();
         ResultSet rs=c.s.executeQuery("select * from hotel");
         while(rs.next()){
             c1.add(rs.getString("name"));
         }
         }catch(Exception e){}
        
        c1.setBounds(250, 110, 200, 30);
        add(c1);
         JLabel l4=new JLabel("No of Person: ");
        l4.setBounds(40,150,150,30);
        l4.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(l4); 
        t1=new JTextField();
        t1.setBounds(250,150,200,25);
        add(t1);
          JLabel l5=new JLabel("No of Days: ");
        l5.setBounds(40,190,100,30);
        l5.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(l5); 
        t2=new JTextField();
        t2.setBounds(250,190,200,25);
        add(t2);
JLabel l6=new JLabel("AC/ Non-AC: ");
        l6.setBounds(40,230,100,30);
        l6.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(l6);    
        
        c2= new Choice();
        c2.add("Yes");
        c2.add("No");
        c2.setBounds(250, 230, 200, 30);
        add(c2);
        JLabel l7=new JLabel("Food Included: ");
        l7.setBounds(40,270,150,30);
        l7.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(l7);    
        
        c3= new Choice();
        c3.add("Yes");
        c3.add("No");
        c3.setBounds(250, 270, 200, 30);
        add(c3);
                JLabel l8=new JLabel("ID: ");
        l8.setBounds(40,310,100,30);
        l8.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(l8);
        
        l22=new JLabel();
        l22.setBounds(250,310,200,30);
        l22.setFont(new Font("Tahoma",Font.PLAIN,20));
        add(l22);
                JLabel l9=new JLabel("Number: ");
        l9.setBounds(40,350,100,30);
        l9.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(l9);
        
        l23=new JLabel();
        l23.setBounds(250,350,200,30);
        l23.setFont(new Font("Tahoma",Font.PLAIN,20));
        add(l23);
                JLabel l10=new JLabel("Phone: ");
        l10.setBounds(40,390,100,30);
        l10.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(l10);
        
        l24=new JLabel();
        l24.setBounds(250,390,200,30);
        l24.setFont(new Font("Tahoma",Font.PLAIN,20));
        add(l24);
                JLabel l11=new JLabel("Total Price: ");
        l11.setBounds(40,430,100,30);
        l11.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(l11);
        
        l25=new JLabel();
        l25.setBounds(240,430,300,30);
        l25.setForeground(Color.red);
        l25.setFont(new Font("Tahoma",Font.PLAIN,20));
        add(l25);
        // db
        try{
            Conn c= new Conn();
            ResultSet rs=c.s.executeQuery("select * from customer where username='"+username+"'");
            while(rs.next()){
                l21.setText(rs.getString("username"));
                l22.setText(rs.getString("id"));
                l23.setText(rs.getString("number"));
                l24.setText(rs.getString("phone"));
            }
        }
        catch(Exception e){}
        b1= new JButton("Check Price");
        b1.setBackground(Color.blue);
        b1.setForeground(Color.white);
        b1.setBounds(60,470,110,30);
        b1.addActionListener(this);
        add(b1);
        
       
        b2= new JButton("Book");
        b2.setBackground(Color.blue);
        b2.setForeground(Color.white);
        b2.setBounds(210,470,100,30);
        b2.addActionListener(this);
        add(b2);
        
        b3= new JButton("Back");
        b3.setBackground(Color.blue);
        b3.setForeground(Color.white);
        b3.setBounds(350,470,100,30);
        b3.addActionListener(this);
        add(b3);
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/book.jpg" ));
        Image i2= i1.getImage().getScaledInstance(350, 400,Image.SCALE_DEFAULT);// for scalling image
         ImageIcon i3= new ImageIcon(i2);
         JLabel l12= new JLabel(i3);
         l12.setBounds(500,50,350,400);
         add(l12);
         
  } 

 public void actionPerformed (ActionEvent ae){
    if(ae.getSource()==b1){
        try{
            Conn c= new Conn();
            ResultSet rs =c.s.executeQuery("select * from hotel where name='"+c1.getSelectedItem()+"'");
            while(rs.next()){
                int cost=Integer.parseInt(rs.getString("cost_per_day"));
                int food=Integer.parseInt(rs.getString("food_charges"));
                int ac=Integer.parseInt(rs.getString("ac_charges"));
                int persons=Integer.parseInt(t1.getText());
                int days=Integer.parseInt(t2.getText());
                String acprice=c2.getSelectedItem();
                String foodprice=c3.getSelectedItem();
                if(persons*days>0){
                    int total=0;
                    total+=acprice.equals("Yes")?ac:0;
                    total+=foodprice.equals("Yes")?food:0;
                    total+=cost;
                    total*=persons*days;
                    l25.setText(""+total);
                }else{
                    l25.setText("please enter a valid number");
                }
            }
        }catch(Exception e){}
       
    }
     else if(ae.getSource()==b2){// put aall the data of all fields in db
         try{
             Conn c= new Conn();
           //  ResultSet rs= c.s.executeUpdate("insert into bookHotel values('"+l21.getText()+"','"+c1.getSelectedItem()+"','"+t1.getText()+"','"+t2.getText()+"','"+c2.getSelectedItem()+"','"+c3.getSelectedItem()+"','"+l22.getText()+"','"+l23.getText()+"','"+l24.getText()+"','"+l25.getText()+"')");
          String q1 = "insert into bookHotel values('"+l21.getText()+"', '"+c1.getSelectedItem()+"', '"+t1.getText()+"', '"+t2.getText()+"', '"+c2.getSelectedItem()+"', '"+c3.getSelectedItem()+"', '"+l22.getText()+"', '"+l23.getText()+"', '"+l24.getText()+"', '"+l25.getText()+"')";
          c.s.executeUpdate(q1);
          JOptionPane.showMessageDialog(null, "Hotel Booked Successfully");
           this.setVisible(false);
         }catch(Exception e){}
                 
                }
     else if(ae.getSource()==b3){
         this.setVisible(false);
     }
}

  public static void main(String args[]){
      new BookHotel("").setVisible(true);
  }
}
