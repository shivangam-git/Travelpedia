
package travel.management.system;
import java.awt.Image;
import javax.swing.*;
public class Splash {
    public static void main(String args[]){
       SplashFrame frame= new SplashFrame();
        frame.setVisible(true);
        int x=1;
       for(int i=1;i<=500;i+=6,x+=7){
       frame.setLocation(750-(x+    i)/2, 400-(i/2));// we want ki ye center se start ho or charo taraf faaile
       frame.setSize(x+i, i);//x bcz we want width dheere dheere badti rhe
       try{
           Thread.sleep(10);//----------------------used bcz frame ko shote se bda hote hue dikhana tha
       }catch(Exception e){}
       }
      
       
    }
    
}
 class SplashFrame extends JFrame implements Runnable{
     Thread t1;
   //  JFrame f= new JFrame();
    SplashFrame(){
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/splash.jpg" ));
     Image i2= i1.getImage().getScaledInstance(1600, 1000,Image.SCALE_DEFAULT);// for scalling image
     ImageIcon i3= new ImageIcon(i2);
        JLabel l1= new JLabel(i3);
        add(l1);
        setUndecorated(true);// for better vision of frame when it get expand
        t1= new Thread(this);
        t1.start();
    }
    public void run(){// used to fix the frame
        try{
            Thread.sleep(7000);
            this.setVisible(false);// make jframe not visbile after 7 secs
            new Login().setVisible(true);// after 7 sec of pic jframe ,login page is shown automatically 
        }catch(Exception e){}
    }
}