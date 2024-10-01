package Project6;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login implements ActionListener{

	JFrame frame = new JFrame();
	
	JButton loginButton = new JButton("Login");
	JButton resetButton = new JButton("Reset");
	
	JTextField insertID = new JTextField();
	JPasswordField insertPassword = new JPasswordField();

	JLabel userID = new JLabel("UserID");
	JLabel passwordID = new JLabel("Password");
	JLabel message = new JLabel();

	HashMap<String, String> info = new HashMap<String, String>();
	
	Login(HashMap<String, String> login){
		info = login;
		
		userID.setBounds(50,100,75,25);
		passwordID.setBounds(50,150,75,25);
		
		message.setBounds(125,250,250,35);
		message.setFont(new Font("Times New Roman", Font.BOLD, 25));
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setLayout(null);
		
		
		insertID.setBounds(125,100,200,25);
		insertPassword.setBounds(125,150,200,25);

		loginButton.setBounds(125,200,100,25);
		loginButton.addActionListener(this);
		resetButton.setBounds(225,200,100,25);
		resetButton.addActionListener(this);
		
		loginButton.setFocusable(false);
		resetButton.setFocusable(false);
		
		
		frame.add(message);
		frame.add(userID);
		frame.add(insertID);
		frame.add(insertPassword);
		frame.add(passwordID);
		frame.add(loginButton);
		frame.add(resetButton);
		frame.setVisible(true);

		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == resetButton) {
			insertID.setText("");
			insertPassword.setText("");
		}
		if(e.getSource() == loginButton) {
			String userID = insertID.getText();
			String password = String.valueOf(insertPassword.getPassword());
			
			if(info.containsKey(userID)) {
				if(info.get(userID).equals(password)) {
					message.setForeground(Color.green);
					message.setText("Login Successful");
					frame.dispose();//remove the login frame once login successful
					@SuppressWarnings("unused")
					Welcome welcome = new Welcome(userID);
				}
				else {
					message.setForeground(Color.red);
					message.setText("Wrong Password");
				}
			}
			else {
				message.setForeground(Color.red);
				message.setText("Username Not Found");
			}
		
		}
	}
}
