
package travel.management.system;
import javax.swing.*;
import java.awt.*;
public class Loading extends JFrame implements Runnable{
     JProgressBar p;
      Thread t;
      String username;
      public void run(){
        try{
            for(int i=1;i<=101;i++){
                int m=p.getMaximum();//eg 100
                int n=p.getValue();// eg 33
                if(n<m){
                    p.setValue(p.getValue()+1);// 33+1=34.. show 34 in progress bar
                }else{
                    i=101;
                    setVisible(false);
                    new Dashboard(username).setVisible(true);//dashboar frame will open when loading frame is closed 
                }
                Thread.sleep(50);// for showing the incresing bar
            }
        }catch(Exception e){
            
        }
    }
    
    Loading(String user){
        t=new Thread(this);
        username=user;
       setLayout(null);
        getContentPane().setBackground(Color.white);// take the jfame and sets its bg color
        setBounds(410, 200, 600, 250);
         JLabel l1=new JLabel("Welcome To Travel World");
        l1.setBounds(110,10,400,30);
        l1.setForeground(Color.BLUE);
        l1.setFont(new Font("Raleway",Font.BOLD,25));
        add(l1);
        p= new JProgressBar();
        p.setStringPainted(true);// for showing percentage value in bar
        p.setBounds(110,70,300,20);
        add(p);
         JLabel l2=new JLabel("Please Wait...");
        l2.setBounds(200,95,120,25);
        l2.setForeground(Color.RED);
        l2.setFont(new Font("Tohoma",Font.BOLD,16));
        add(l2);
        JLabel l3=new JLabel("Welcome "+username);
        l3.setBounds(20,180,400,25);
        l3.setForeground(Color.RED);
        l3.setFont(new Font("Tohoma",Font.BOLD,16));
        add(l3);
        t.start();
    }
    public static void main(String args[]){
        new Loading("").setVisible(true);
    }
}
