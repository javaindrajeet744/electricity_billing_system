package Electricity;
import javax.swing.*;
import java.awt.*;
public class PMain extends JFrame{
	PMain(){
		super(" WELCOME TO NEA ");
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		//setSize(1380,780);
		//setLocation(0,0);
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("myicon/main4.jpg"));
		Image i2=i1.getImage().getScaledInstance(1380, 700, DO_NOTHING_ON_CLOSE);
		ImageIcon i3=new ImageIcon(i2);
		JLabel image=new JLabel(i3);
		add(image);
		
		JMenuBar m1=new JMenuBar();
		setJMenuBar(m1);
		setLayout(new FlowLayout());
		
		JMenu menu=new JMenu(" Master");
		m1.add(menu);
		
		setVisible(true);
	}
public static void main(String args[]) {
	new PMain();
}
}
