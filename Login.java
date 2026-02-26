package Electricity;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Login extends JFrame implements ActionListener {
	
	JButton b1,b2,b3;
	
	Login(){
		super(" LOGIN PAGE");
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		
		ImageIcon image=new ImageIcon(ClassLoader.getSystemResource("myicon/Login.png"));
		Image im1=image.getImage().getScaledInstance(100, 150, DO_NOTHING_ON_CLOSE);
		ImageIcon im2=new ImageIcon(im1);
		JLabel im3=new JLabel(im2);
		im3.setBounds(0, 0, 500, 400);
		add(im3);

		JLabel i1=new JLabel(" Username:");
		i1.setBounds(400, 20, 100, 80);
		add(i1);
		JLabel i2=new JLabel(" Password:");
		i2.setBounds(400, 60, 100, 80);
		add(i2);
		JLabel i3=new JLabel(" Logging in as:");
		i3.setBounds(400, 100, 100, 80);
		add(i3);
		Choice c=new Choice();
		c.add("Customer");
		c.add("Admin");
		c.setBounds(500, 130, 120,100);
		add(c);
		
		JTextField i4=new JTextField();
		i4.setBounds(470, 50, 130, 20);
		add(i4);
		
		JTextField i5=new JTextField();
		i5.setBounds(470, 90, 130, 20);
		add(i5);
		//JTextField i6=new JTextField();
		//i6.setBounds(490, 130, 130, 20);
		//add(i6);
		
		 b1=new JButton(" Login");
		b1.setBounds(350, 250, 120, 30);
		b1.addActionListener(this);
		add(b1);
		 b2=new JButton(" CANCEL");
		b2.setBounds(410, 300, 120, 30);
		b2.addActionListener(this);
		add(b2);
		 b3=new JButton(" Signup");
		b3.setBounds(500, 250, 120, 30);
		b3.addActionListener(this);
		add(b3);
		
		setSize(700,500);
		setLocation(400,150);
		setVisible(true);
		
	}
	public void actionPerformed(ActionEvent x) {
		if(x.getSource()== b2) {
			setVisible(false);
		}
		else if(x.getSource()==b1) {
			
		}
		else if(x.getSource()==b3) {
			setVisible(false);
			new Signup();
		}
		
	}
	
	
	
	
	public static void main(String args[]) {
		new Login();
	}

}
