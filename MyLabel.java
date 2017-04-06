import javax.swing.*;
import java.awt.*;

class MyLabel 
{
	public static void main(String[] args)
	{
		System.out.println("aakash");
		JFrame frame=new JFrame();
		
		
		frame.setBounds(0,0,400,700);
		frame.setTitle("Shuttle Schedule");
		
		ImageIcon icon=new ImageIcon("umass_logo_white_200px.png");
		
		frame.setIconImage(icon.getImage());
		
		Container c=frame.getContentPane();
		c.setLayout(null);
		JLabel label = new JLabel("Route Map:");
		label.setText("Route Map:");
		label.setBounds(10,50,200,30);
		Font f=new Font("Arial",Font.BOLD,30);
		label.setFont(f);
		c.add(label); 
		ImageIcon icon1=new ImageIcon("map2.jpg");
		JLabel label2 = new JLabel(icon1);
		label2.setBounds(10,0,350,400);
		c.add(label2);
		JLabel label3 = new JLabel("Schedule:");
		label3.setText("Schedule:");
		label3.setBounds(10,300,200,30);
		Font f1=new Font("Arial",Font.BOLD,30);
		label3.setFont(f1);
		c.add(label3);
		JLabel label4 = new JLabel("<html>Monday-Thursday<br>1-6.30 am-9.30 pm (every 5-7 minutes)<br><html> &nbsp;&nbsp;&nbsp;&nbsp;9:30-10:30pm (every10-12 minutes) <br></html>");
		label4.setBounds(10,230,500,250);
		c.add(label4);
		
		frame.setDefaultLookAndFeelDecorated(true);
		frame.setVisible(true);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	
	}    
	
}