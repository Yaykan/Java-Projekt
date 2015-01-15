package email;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.plaf.basic.BasicBorders.RadioButtonBorder;
public class anmelden {
	
	private JDialog fenster = new JDialog();
	static String title = "Java E-Mail-Client Connection Init Beta v.01";
	public String ssmtp,simap,semail;
	char[] spass;
	
	public anmelden(String title){
		
		// Textfield SMTP
		JTextField smtp = new JTextField("Please enter SMTP server", 25);
		ssmtp = smtp.getText();
		
		
		// Textfield IMAP
		JTextField imap = new JTextField("Please enter IMAP server", 25);
		simap = imap.getText();
		
		// Textfield Email
		JTextField email = new JTextField("Please enter E-Mail Adress");
		semail = email.getText();
		
		// Passwordfield
		JPasswordField pass = new JPasswordField("",15);
		spass = pass.getPassword();
		
		// Remember me 
		final JRadioButton remember = new JRadioButton("Remember me!");
		
		ActionListener action = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (remember.isSelected()) {
					
					
				}
				
			}
		};
		
		Object[] props = {title,"IMAP",imap,"SMTP",smtp,"E-Mail:",email,"Password:",pass,remember};
		
		JOptionPane fenster = new JOptionPane(props, 
				JOptionPane.PLAIN_MESSAGE,
				JOptionPane.OK_CANCEL_OPTION);
		fenster.createDialog(null,"Properties").setVisible(true);
		
		System.exit(0);
		
	}
	
	public String getImap(){
		return simap;
	}
	
	public String getSmtp(){
		return ssmtp;
	}
	
	public String getEmail(){
		return semail;
	} 
	
	public String getPass(){
		return String.valueOf(spass);
	}
	
}
