package Electricity;
import java.awt.*;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
public class Signup extends JFrame implements ActionListener{
	
	JTextField j1,j2;
	Choice c;
	JButton b1,b2;
	Signup(){
		super(" CREATE ACCOUNT");

		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		
		
		
		
		JPanel panel=new JPanel();
		panel.setBounds(10, 10, 460, 300);
		panel.setBorder(new TitledBorder(new LineBorder(Color.blue)));
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		panel.setForeground(Color.BLACK);
		add(panel);

		JLabel i1=new JLabel("Create Contact as:");
		i1.setBounds(50, 2,150, 70);
		i1.setFont(new Font("Tahoma",Font.BOLD,14));
		panel.add(i1);
		
		 c=new Choice();
		c.add("Customer");
		c.add("Admin");
		c.setBounds(200, 28, 100,80);
		panel.add(c);
		
		JLabel meter=new JLabel(" Meter No:");
		meter.setBounds(50, 40,150, 70);
		meter.setFont(new Font("Tahoma",Font.BOLD,14));
		panel.add(meter);
		
		JLabel user=new JLabel("Username:");
		user.setBounds(50, 70,150, 70);
		user.setFont(new Font("Tahoma",Font.BOLD,14));
		panel.add(user);
		
		 j1=new JTextField();
		j1.setBounds(140,65,130,20);
		panel.add(j1);
		
		 j2=new JTextField();
		j2.setBounds(140,95,130,20);
		panel.add(j2);
		
		ImageIcon image=new ImageIcon(ClassLoader.getSystemResource("myicon/sign.jpg"));
		Image image2=image.getImage().getScaledInstance(250, 250, DO_NOTHING_ON_CLOSE);
		ImageIcon image6=new ImageIcon(image2);
		JLabel i5=new JLabel(image6);
		i5.setBounds(100, 140, 160, 70);
		panel.add(i5);
		
		 b1=new JButton("CREATE");
		b1.setBounds(50, 220, 110, 25);
		b1.setBackground(Color.black);
		b1.setForeground(Color.WHITE);
		b1.addActionListener(this);

		panel.add(b1);
		
		 b2=new JButton("BACK");
		b2.setBounds(200, 220, 110, 25);
		b2.setBackground(Color.BLACK);
		b2.setForeground(Color.WHITE);
		b2.addActionListener(this);
		panel.add(b2);
		setSize(500,400);
		setLocation(500,200);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent y) {
		if(y.getSource()==b1) {
			String acctype=c.getSelectedItem();
			String suser=j2.getText();
			String smeter=j1.getText();
			//String sname=i1.getText();
			try {
				Connect c=new Connect();
				String query=" insert into login values('"+smeter+"','"+suser+"')";
				c.s.executeUpdate(query);
				
				JOptionPane.showMessageDialog(null, " ACCOUNT CREATED SUCCESSFULLY");
				setVisible(false);
				new Login();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		else if(y.getSource()==b2) {
			setVisible(false);
			new Login();
		}
		
	}
	
	
	
public static void main(String args[]) {
	new Signup();
}
}
