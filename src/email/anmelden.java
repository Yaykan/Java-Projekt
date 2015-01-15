package email;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class anmelden {
	
	private JDialog fenster = new JDialog();
	static String title = "Java E-Mail-Client Connection Init Beta v.01";
	private String ssmtp;
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

	public char[] getSpass() {
		return spass;
	}

	public void setSpass(char[] spass) {
		this.spass = spass;
	}

	private String simap;
	private String semail;
	char[] spass;
	
	public anmelden(String title){
		
		// Textfield SMTP
		JTextField smtp = new JTextField("Please enter SMTP server", 25);
		setSsmtp(smtp.getText());
		
		
		// Textfield IMAP
		JTextField imap = new JTextField("Please enter IMAP server", 25);
		setSimap(imap.getText());
		
		// Textfield Email
		JTextField email = new JTextField("Please enter E-Mail Adress");
		setSemail(email.getText());
		
		// Passwordfield
		JPasswordField pass = new JPasswordField("",15);
		setSpass(pass.getPassword());
		
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

	
}
