
package travel.management.system;

//-----------------------------------------------------------
import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Signup extends JFrame implements ActionListener{
    JButton b1,b2;
    JTextField t1,t2,t3,t4;
     
    Choice c1;
    Signup(){
        setBounds(410, 200, 600, 250);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JPanel p1=new JPanel();
        p1.setBackground(new Color(133,193,233));
       p1.setBounds(0, 0, 320, 250);
        p1.setLayout(null);
        add(p1);
        
        JLabel l1=new JLabel("Username");
        l1.setFont(new Font("Tohoma",Font.BOLD,14));
        l1.setBounds(20, 10, 100, 25);
        p1.add(l1);
        
         t1=new JTextField();
        t1.setBounds(140, 13, 150, 18);
        t1.setBorder(BorderFactory.createEmptyBorder());
        p1.add(t1);
        
        JLabel l2=new JLabel("Name");
        l2.setFont(new Font("Tohoma",Font.BOLD,14));
      l2.setBounds(20,38,100,25);
        p1.add(l2);
        
         t2=new JTextField();
       t2.setBounds(140,42,150,18);
        t2.setBorder(BorderFactory.createEmptyBorder());
        p1.add(t2);
        
        JLabel l3=new JLabel("Password");
        l3.setFont(new Font("Tohoma",Font.BOLD,14));
        l3.setBounds(20,68,100,25);
        p1.add(l3);
        
         t3=new JTextField();
        t3.setBounds(140,72,150,18);
        t3.setBorder(BorderFactory.createEmptyBorder());
        p1.add(t3);
        
        JLabel l4=new JLabel("Security Questions");
        l4.setFont(new Font("Tohoma",Font.BOLD,12));
        l4.setBounds(20,100,110,25);
        p1.add(l4);
        
         c1=new Choice();
        c1.add("Your fav Hero");
        c1.add("Which city you are born");
        c1.add("Your Favourite Color");
        c1.add("Your Lucky No.");
         c1.setBounds(140,100,150,16);
        p1.add(c1);
        
        JLabel l5=new JLabel("Answer");
        l5.setFont(new Font("Tohoma",Font.BOLD,14));
         l5.setBounds(20,130,100,25);
        p1.add(l5);
        
         t4=new JTextField();
        t4.setBounds(140,135,150,18);
        t4.setBorder(BorderFactory.createEmptyBorder());
        p1.add(t4);

        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/signup.png"));
        Image i2=i1.getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l6= new JLabel(i3);
        l6.setBounds(340,10,220,220);
        
        
         b1=new JButton("Create");
        b1.setFont(new Font("Tohoma",Font.BOLD,14)); 
        b1.setForeground(new Color(133,139,233));
        b1.setBackground(Color.WHITE);
        b1.addActionListener(this);
        b1.setBounds(40,170,100,20);
        p1.add(b1);
        
         b2=new JButton("Back");
        b2.setFont(new Font("Tohoma",Font.BOLD,14));
        b2.setBackground(Color.WHITE);
        b2.addActionListener(this);
        b2.setBounds(160,170,80,20);
        p1.add(b2);
    }
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==b1){
            String username=t1.getText();
            String name=t2.getText();
            String password=t3.getText();
            String security=c1.getSelectedItem();
            String answer=t4.getText();
            String query="insert into account values('"+username+"','"+name+"','"+password+"','"+security+"','"+answer+"')";
            try{
                Conn c=new Conn();
                //4. step of jdbc
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"Account Created Successfully");
                this.setVisible(false);
                new Login().setVisible(true);
           }catch(Exception e){
                
            }
        }else if(ae.getSource()==b2){
            new Login().setVisible(true);
            this.setVisible(false);
        }
    }

    public static void main(String[] args){
        new Signup().setVisible(true);
    }

    
    

    
}
