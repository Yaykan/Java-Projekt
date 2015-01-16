package email;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class save {
	public save(String smtp, String imap,String email, String password) {
		char [] temp;
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
		
		try {
			FileOutputStream write = new FileOutputStream("text.txt");
			temp = smtp.toCharArray();
			int a;
			for (int i = 0; i < temp.length; i++) {
				a = temp[i];
			
				int c;
				while ((c = a) != -1) {
					write.write(c);
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException  e) {
			e.printStackTrace();
		}
		
	}

}
