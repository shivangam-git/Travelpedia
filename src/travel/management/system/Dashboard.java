
package travel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Dashboard extends JFrame implements ActionListener{
       JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15;
       String username;
    Dashboard(String username){
        this.username=username;
        setExtendedState(JFrame.MAXIMIZED_BOTH);// set the jframe to full size window
        setLayout(null);
        JPanel p1= new JPanel();// top bar panel
        p1.setLayout(null);
        p1.setBounds(0,0,1950,65);
        p1.setBackground(new Color(0,0,102));
        add(p1);

    
//     ImageIcon i4= new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/dashboard.png"));
//    Image i5= i4.getImage().getScaledInstance(70, 70,Image.SCALE_DEFAULT);// for scalling image
//     ImageIcon i6= new ImageIcon(i5);
//        JLabel l2= new JLabel(i6);
//        l2.setBounds(5, 0, 70, 70);
//    p1.add(l2);
    
        JLabel l3=new JLabel("Dashboard");
        l3.setFont(new Font("Tohoma",Font.BOLD,25));
        l3.setForeground(Color.WHITE);
        l3.setBounds(60,10,300,40);
        p1.add(l3);
     JPanel p2= new JPanel();// left bar panel
        p2.setLayout(null);
        p2.setBounds(0,65,200,1000);
        p2.setBackground(new Color(0,0,102));
        add(p2);
                 ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/home.jpg"));
    Image i2= i1.getImage().getScaledInstance(1950, 1000,Image.SCALE_DEFAULT);// for scalling image
     ImageIcon i3= new ImageIcon(i2);
        JLabel l1= new JLabel(i3);
        l1.setBounds(0, 0, 1950, 1000);// 160 bcz we want to move the image to left inorder to show left panel
    add(l1);
        b1= new JButton("Add Personal Details");
        b1.setBackground(new Color(0,0,102));
        b1.setForeground(Color.WHITE);
        b1.setFont(new Font("Tahoma",Font.PLAIN,16));
       b1.setMargin(new Insets(0,0,0,40));// for align the text of button to left side
        b1.setBounds(0,0,250,40);
        b1.addActionListener(this);
        p2.add(b1);
        b2= new JButton("Update Personal Details");
        b2.setBackground(new Color(0,0,102));
        b2.setForeground(Color.WHITE);
        b2.setFont(new Font("Tahoma",Font.PLAIN,16));
         b2.setMargin(new Insets(0,0,0,20));// for align the text of button to left side
        b2.setBounds(0,40,250,40);
        b2.addActionListener(this);
        p2.add(b2);
         b3= new JButton("View Details");
        b3.setBackground(new Color(0,0,102));
        b3.setForeground(Color.WHITE);
        b3.setFont(new Font("Tahoma",Font.PLAIN,18));
        b3.setBounds(0,80,200,40);
        b3.addActionListener(this);
        p2.add(b3);
         b4= new JButton("Delete Personal Details");
        b4.setBackground(new Color(0,0,102));
        b4.setForeground(Color.WHITE);
        b4.setFont(new Font("Tahoma",Font.PLAIN,16));
            b4.addActionListener(this);
        b4.setBounds(0,120,200,40);
       
        p2.add(b4);
         b5= new JButton("Check Package");
        b5.setBackground(new Color(0,0,102));
        b5.setForeground(Color.WHITE);
        b5.setFont(new Font("Tahoma",Font.PLAIN,18));
        b5.setBounds(0,160,200,40);
         b5.addActionListener(this);
        p2.add(b5);
         b6= new JButton("Book Package");
        b6.setBackground(new Color(0,0,102));
        b6.setForeground(Color.WHITE);
        b6.setFont(new Font("Tahoma",Font.PLAIN,18));
        b6.setBounds(0,200,200,40);
        b6.addActionListener(this);
        p2.add(b6);
         b7= new JButton("View Package");
        b7.setBackground(new Color(0,0,102));
        b7.setForeground(Color.WHITE);
        b7.setFont(new Font("Tahoma",Font.PLAIN,18));
        b7.setBounds(0,240,200,40);
        b7.addActionListener(this);
        p2.add(b7);
         b8= new JButton("View Hotels");
        b8.setBackground(new Color(0,0,102));
        b8.setForeground(Color.WHITE);
        b8.setFont(new Font("Tahoma",Font.PLAIN,18));
        b8.setBounds(0,280,200,40);
        b8.addActionListener(this);
        p2.add(b8);
         b9= new JButton("Book Hotel");
        b9.setBackground(new Color(0,0,102));
        b9.setForeground(Color.WHITE);
        b9.setFont(new Font("Tahoma",Font.PLAIN,18));
        b9.setBounds(0,320,200,40);
        b9.addActionListener(this);
        p2.add(b9);
         b10= new JButton("View Booked Hotel");
        b10.setBackground(new Color(0,0,102));
        b10.setForeground(Color.WHITE);
        b10.setFont(new Font("Tahoma",Font.PLAIN,16));
        b10.setBounds(0,360,200,40);
        b10.addActionListener(this);
        p2.add(b10);
         b11= new JButton("Destinations");
        b11.setBackground(new Color(0,0,102));
        b11.setForeground(Color.WHITE);
        b11.setFont(new Font("Tahoma",Font.PLAIN,18));
        b11.setBounds(0,400,200,40);
        p2.add(b11);
         b12= new JButton("Payement");
        b12.setBackground(new Color(0,0,102));
        b12.setForeground(Color.WHITE);
        b12.setFont(new Font("Tahoma",Font.PLAIN,18));
        b12.setBounds(0,440,200,40);
        p2.add(b12);
         b13= new JButton("Calculator");
        b13.setBackground(new Color(0,0,102));
        b13.setForeground(Color.WHITE);
        b13.setFont(new Font("Tahoma",Font.PLAIN,18));
        b13.setBounds(0,480,200,40);
        b13.addActionListener(this);
        p2.add(b13);
         b14= new JButton("Notepad");
        b14.setBackground(new Color(0,0,102));
        b14.setForeground(Color.WHITE);
        b14.setFont(new Font("Tahoma",Font.PLAIN,18));
        b14.setBounds(0,520,200,40);
        b14.addActionListener(this);
        p2.add(b14);
         b15= new JButton("About");
        b15.setBackground(new Color(0,0,102));
        b15.setForeground(Color.WHITE);
        b15.setFont(new Font("Tahoma",Font.PLAIN,18));
        b15.setBounds(0,560,200,40);
          b15.addActionListener(this);
        p2.add(b15);
         JLabel l4=new JLabel("Traveling Zone");
       l4.setBounds(620,60,1000,70);
       l4.setForeground(Color.WHITE);
       l4.setFont(new Font("Tohama",Font.PLAIN,55));
       l1.add(l4);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b13){
            try{
                Runtime.getRuntime().exec("calc.exe");// this class and method is used to open calc
            }catch(Exception e){
                
            }
        }else if(ae.getSource()==b14){
            try{
                Runtime.getRuntime().exec("notepad.exe");// this class and method is used to open notepad
            }catch(Exception e){
                
            }
        }
        else if(ae.getSource()==b1){
            new AddCustomer(username).setVisible(true);
        }
         else if(ae.getSource()==b2){
            new UpdateCustomer(username).setVisible(true);
        }
         else if(ae.getSource()==b3){
            new ViewCustomer(username).setVisible(true);
        }
        else if(ae.getSource()==b5){
            new CheckPackage().setVisible(true);
        }
          else if(ae.getSource()==b6){
            new BookPackage(username).setVisible(true);
        }
         else if(ae.getSource()==b7){
            new ViewPackage(username).setVisible(true);
        }
          else if(ae.getSource()==b8){
            new CheckHotels().setVisible(true);
        }
          else if(ae.getSource()==b10){
            new ViewBookedHotel(username).setVisible(true);
        }
         else if(ae.getSource()==b15){
            new About().setVisible(true);
        }
         else if(ae.getSource()==b4){
            new DeleteCustomer(username).setVisible(true);
        }
    }
    public static void main(String args[]){
        new Dashboard("").setVisible(true);
    }
}
