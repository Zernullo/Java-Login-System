package Project6;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Welcome {

	JFrame frame = new JFrame();
	JLabel welcome = new JLabel("Hello");
	
	Welcome(String userID){
		
		welcome.setBounds(0,0,200,35);
		welcome.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		welcome.setText("Hello " + userID);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setLayout(null);
		
		frame.add(welcome);
		frame.setVisible(true);
	}
}
