package Electricity;
import javax.swing.*;
import java.awt.*;
public  class Splash extends JFrame implements Runnable{
	
		Splash(){
			ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("myicon/first.jpg"));
			Image i2=i1.getImage().getScaledInstance(700, 500, DO_NOTHING_ON_CLOSE);
			ImageIcon i3=new ImageIcon(i2);
			JLabel image=new JLabel(i3);
			add(image);
			setVisible(true);
int x=1;
			for(int i=2;i<600;i+=4,x+=0) {
			setSize(i,i+x);
			setLocation(700-((i+x)/2),400-(i/2));
			try {
				Thread.sleep(8);
				
			}catch(Exception e) {
				
			}
			
			setVisible(true);
			
			
		}
			Thread t=new Thread(this);
			t.start();
		}
		public void run() {
			try {
				Thread.sleep(5000);
				setVisible(false);
				new Login();
				
			}catch(Exception e){
				e.printStackTrace();
			}
			
		}
	
	
	public static void main(String args[])
	{
		new Splash();
	}

}
