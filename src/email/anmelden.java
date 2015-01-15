package email;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.*;
public class anmelden{
	private JFrame fenster = new JFrame();
	static String title = "Java E-Mail-Client Connection Init Beta v.01";
	
	public anmelden(){
		fenster = new JFrame(title);
		fenster.setSize(600,600);
		fenster.setLayout(new BorderLayout());
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(5,2));
		panel.setOpaque(true);
		
		// Label for SMTP
		JLabel lsmtp = new JLabel("SMTP:");
		panel.add(lsmtp);
		
		// Textfield SMTP
		JTextField smtp = new JTextField("Please enter SMTP server", 25);
		smtp.setForeground(Color.black);
		smtp.setBackground(Color.white);
		panel.add(smtp);
		
		// Label for POP3
		JLabel lpop3 = new JLabel("POP3:");
		panel.add(lpop3);
		
		// Textfield POP3
		JTextField pop3 = new JTextField("Please enter POP3 server", 25);
		smtp.setForeground(Color.black);
		smtp.setBackground(Color.white);
		panel.add(pop3);
		
		// Label for E-Mail
		JLabel lmail = new JLabel("Email:");
		panel.add(lmail);
		
		// Textfield Email
		JTextField email = new JTextField("Please enter E-Mail Adress");
		smtp.setForeground(Color.black);
		smtp.setBackground(Color.white);
		panel.add(email);
		
		// Label for Password
		JLabel lpass = new JLabel("Password:");
		panel.add(lpass);
		
		// Passwordfield
		JPasswordField pass = new JPasswordField("",15);
		panel.add(pass);
		
		// Button for send
		JButton senden = new JButton("Senden");
		panel.add(senden);
		
		
		fenster.add(panel);
		fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenster.setLocationRelativeTo(null);
		fenster.setVisible(true);
		
	}
	
	//public void actionPerfomed
	
}
