

package travel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class DeleteCustomer extends JFrame implements ActionListener{
    JLabel l11,l12,l13,l14,l15,l16,l17,l18,l19;
     JComboBox c1;
      JRadioButton r1,r2;
      JButton b1,b2;
     DeleteCustomer(String username){
        setBounds(410, 200, 600, 500);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
           JLabel heading=new JLabel("Delete CUSTOMER DETAILS");
        heading.setBounds(50,0,300,25);
        heading.setFont(new Font("Tohoma",Font.PLAIN,20));
        add(heading);
        JLabel l1=new JLabel("Username : ");
        l1.setBounds(20,30,150,25);
        add(l1);
        
         l11=new JLabel();
        l11.setBounds(180,30,150,25);
        add(l11);
         JLabel l2=new JLabel("Name : ");
        l2.setBounds(20,70,150,25);
        add(l2);
        
          l12=new JLabel();
        l12.setBounds(180,70,150,25);
        add(l12);
        JLabel l3=new JLabel("ID: ");
        l3.setBounds(20,110,100,25);
        add(l3);
        
       l13=new JLabel();;
       l13.setBounds(180,110,150,25);
        add(l13);
        JLabel l4=new JLabel("Number : ");
        l4.setBounds(20,150,100,25);
        add(l4);
          l14=new JLabel();
        l14.setBounds(180,150,150,25);
        add(l14);
        JLabel l5=new JLabel("Gender : ");
        l5.setBounds(20,190,150,25);
        add(l5);
        
        l15=new JLabel();
        l15.setBounds(180,190,150,25);
        add(l15);
        JLabel l6=new JLabel("Country : ");
        l6.setBounds(20,230,150,25);
        add(l6);
        
        l16=new JLabel();
        l16.setBounds(180,230,150,25);
        add(l16);
        JLabel l7=new JLabel("Address : ");
        l7.setBounds(20,270,150,25);
        add(l7);
        
        l17=new JLabel();
        l17.setBounds(180,270,150,25);
        add(l17);
         JLabel l8=new JLabel("Phone : ");
        l8.setBounds(20,310,150,25);
        add(l8);
        
        l18=new JLabel();
        l18.setBounds(180,310,150,25);
        add(l18);
        JLabel l9=new JLabel("Email : ");
        l9.setBounds(20,350,150,25);
        add(l9);
        
        l19=new JLabel();
        l19.setBounds(180,350,150,25);
        add(l19);
         b1=new JButton("Delete");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        b1.setBounds(50,398,90,20);
        add(b1);
         b2=new JButton("Back");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
       b2.addActionListener(this);
        b2.setBounds(180,398,90,20);
        add(b2);
         ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/delete.png"));
        Image i2=i1.getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l10= new JLabel(i3);
        l10.setBounds(300,35,300,300);
        add(l10);
        // jab bhi addpersonal detail or add customer vala frame khule toh username and name pehle se filled hue ane chaiye 
          try{
            Conn c=new Conn();
            ResultSet rs= c.s.executeQuery("select * from customer where username = '"+username+"'");
            while(rs.next()){// jump from col to col
                l11.setText(rs.getString("username"));
                l12.setText(rs.getString("name"));
                l13.setText(rs.getString("id"));
                l14.setText(rs.getString("number"));
                l15.setText(rs.getString("gender"));
                l16.setText(rs.getString("country"));
                l17.setText(rs.getString("address"));
                l18.setText(rs.getString("phone"));
                l19.setText(rs.getString("email"));
                
            }
        }catch(Exception e){
        
        }
     }
         public void actionPerformed(ActionEvent ae){
             if(ae.getSource()==b1){
            // delete customer data from all tables except hotel
        
//        String username=t1.getText();
//        String id=t8.getText();
//        String number=t2.getText();
//        String name=t3.getText();
//        String radio=t9.getText();
//      
//        String country=t4.getText();
//        String address=t5.getText();
//        String phone=t6.getText();
//        String email=t7.getText();
        
       // String  q="update customer set username='"+username+"',id='"+id+"',number='"+number+"',name='"+name+"',gender='"+radio+"',country='"+country+"',address='"+address+"',phone='"+phone+"',email='"+email+"'";
        try{
            Conn c=new Conn();
            c.s.executeUpdate("delete from account where username='shivu'");
            c.s.executeUpdate("delete from bookHotel where username='shivu'");
            c.s.executeUpdate("delete from bookPackage where username='shivu'");
            c.s.executeUpdate("delete from customer where username='shivu'");
            JOptionPane.showMessageDialog(null, "Customer Details Deleted Successfully");
            System.exit(0);// close the project
            
            JOptionPane.showMessageDialog(null,"Customer Details Updated Successfully");
            this.setVisible(false);
        }catch(Exception e){
            
        }
        }else if(ae.getSource()==b2){
            this.setVisible(false);
        }
             
         }
     public static void main(String args[]){
         new DeleteCustomer("").setVisible(true);
     }
}
