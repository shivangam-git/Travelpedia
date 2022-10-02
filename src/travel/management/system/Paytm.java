//
//package travel.management.system;
//import javax.swing.*;
//import java.awt.event.*;
//
//public class Paytm extends JFrame implements ActionListener{
//    Paytm(){
//         JEditorPane j = new JEditorPane();// same as text area in which we edit content
//        j.setEditable(false); // dont edit the paytm page  
//
//        try {
//            j.setPage("https://paytm.com/electricity-bill-payment");
//        }catch (Exception e) {
//            j.setContentType("text/html");
//            j.setText("<html>Could not load,Error 404</html>");
//        }
//        setBounds(600,200,500,400);
//        add(j);
//        JScrollPane js = new JScrollPane(j);     
//        getContentPane().add(js);
//        JButton b1= new JButton();
//        b1.setBounds(550,20,80,30);
//        b1.addActionListener(this);
//    }
//     public void actionPerformed (ActionEvent ae){
//        this.setVisible(false);
//        new Payment().setVisible(true);
//    }
//     public static void main(String[] args){
//         
//        new Paytm().setVisible(true);
//    }
//}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travel.management.system;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Paytm extends JFrame{
    Paytm(){
        JEditorPane j = new JEditorPane();
        j.setEditable(false);   

        try {
            j.setPage("https://paytm.com/electricity-bill-payment");
        }catch (Exception e) {
            j.setContentType("text/html");
            j.setText("<html>Could not load</html>");
        } 

        JScrollPane scrollPane = new JScrollPane(j);     
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().add(scrollPane);
        setPreferredSize(new Dimension(800,600));
        
        JButton back=new JButton("Back");
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });
        back.setBounds(610, 20, 80, 40);
        j.add(back);
        
        setSize(800,600);
        setLocation(600,220);
        setVisible(true);
    }
    public static void main(String[] args){
        new Paytm().setVisible(true);
    }
}