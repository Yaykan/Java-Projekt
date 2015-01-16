package email;
import java.awt.Checkbox;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class anmelden {
	
	private JDialog dialog = new JDialog();
	private String ssmtp;
	private String simap;
	private String semail;
	private String spass;
	
	public anmelden(String title){
		int auswahl;
		
		// Textfield SMTP
		JTextField smtp = new JTextField("Please enter SMTP server", 25);
		
		// Textfield IMAP
		JTextField imap = new JTextField("Please enter IMAP server", 25);
		
		// Textfield Email
		JTextField email = new JTextField("Please enter E-Mail Adress",25);
		
		// Passwordfield
		JPasswordField pass = new JPasswordField("",15);
		
		// Remember me 
		Checkbox remember = new Checkbox("Remember me!");
		
		// Objecst they are listening on the popup frame
		Object[] props = {title,"IMAP",imap,"SMTP",smtp,"E-Mail:",email,"Password:",pass,remember};
		
		// create the popupPane
		JOptionPane fenster = new JOptionPane(props, 
				JOptionPane.PLAIN_MESSAGE,
				JOptionPane.DEFAULT_OPTION);
		fenster.createDialog(null,"Properties").setVisible(true);
		
		
		// checked for remember properties from email server 
		if (remember.getState()) {
			setSsmtp(smtp.getText());
			setSimap(imap.getText());
			setSemail(email.getText());
			setSpass(pass.getPassword());
			System.out.println(getSsmtp()+getSimap()+getSemail()+getSpass());
			
			
		} else {
			System.exit(0);
		}
		
		System.exit(0);
		
	}
	
	public String getSsmtp() {
		return ssmtp;
	}

	public void setSsmtp(String ssmtp) {
		this.ssmtp = ssmtp;
	}

	public String getSimap() {
		return simap;
	}

	public void setSimap(String simap) {
		this.simap = simap;
	}

	public String getSemail() {
		return semail;
	}

	public void setSemail(String semail) {
		this.semail = semail;
	}

	public String getSpass() {
		return spass;
	}

	public void setSpass(char[] password) {
		this.spass = new String(password);
	}
	
}
