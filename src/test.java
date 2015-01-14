
public class test {
	
	public test(String title){

		JFrame frame = new JFrame(title);
		frame.getContentPane().setLayout(new BorderLayout());
		JLabel label = new JLabel();
		label.setText(ausgabe.getString());
		frame.getContentPane().add(label, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setSize(600,600);
		System.out.println("Selamu Aleykum Hocam");
		System.out.println("Eyvallah");
	}


}
