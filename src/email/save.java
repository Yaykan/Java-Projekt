package email;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class save {
	public save(String smtp, String imap,String email, String password) {
		
		// Create file
		try {
			 
		      File file = new File("/Users/furkanyucel/git/Java-Projekt_Email/src/email/text.txt");
	 
		      if (file.createNewFile()){
		        System.out.println("File is created!");
		      }else{
		        System.out.println("File already exists.");
		      }
	 
	    	} catch (IOException e) {
		      e.printStackTrace();
		}
		
	}

}
