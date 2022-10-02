
package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Payment extends JFrame implements ActionListener{
    JButton b1,b2;
    Payment(){
       setBounds(350,160,700,400);
     setLayout(null);
       getContentPane().setBackground(Color.WHITE);
       ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/paytm.jpeg"));
        Image i2 = i1.getImage().getScaledInstance(700, 400, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(0, 0, 700, 400);
        add(l1);
         b1 = new JButton("Pay");
        b1.setBounds(300, 2, 80, 30);
        b1.addActionListener(this);
        l1.add(b1);
        b2 = new JButton("Back");
        b2.setBounds(400, 2, 80, 30);
        b2.addActionListener(this);
        l1.add(b2);
    }
       public void actionPerformed(ActionEvent ae){
           
        if(ae.getSource()==b1){
            this.setVisible(false);
            new Paytm().setVisible(true);
        }
        else if(ae.getSource()==b2){
            this.setVisible(false);
        }  
    }
    public static void main(String args[]){
        new Payment().setVisible(true);
    }
}
