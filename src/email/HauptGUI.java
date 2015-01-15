package email;

import java.awt.*;

import javax.swing.*;

public class HauptGUI {
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("E-mail Client");
		frame.getContentPane().setLayout(new BorderLayout());
		
		JMenuBar bar = new JMenuBar();
		JMenu menu1 = new JMenu("File");
		JMenuItem item1 = new JMenuItem("Quit");
		menu1.add(item1);
		JMenu menu2 = new JMenu("Help");
		JMenuItem item2 = new JMenuItem("About");
		menu2.add(item2);
		bar.add(menu1);
		bar.add(menu2);
		frame.add(bar, BorderLayout.NORTH);
		
		JPanel backg = new JPanel(new BorderLayout());
		
		String [] columns = {"sender", "subject"};
		Object [][] data = {{"Furkan Yuecel", ""}, {"Suepriz Yaykan", ""}, {"Ali Selvi", ""}, {"Test", "test"}};
		JTable table = new JTable(data, columns);
		table.setRowSelectionAllowed(true);
		JScrollPane scroll = new JScrollPane(table, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scroll.setPreferredSize(new Dimension(200, 650));
		
		
		JTabbedPane tabbed = new JTabbedPane();
		JPanel tab1 = new JPanel();
		tab1.add(scroll);
		JPanel tab2 = new JPanel();
		JPanel tab3 = new JPanel();
		tabbed.addTab("Inbox", tab1);
		tabbed.addTab("Sent", tab2);
		tabbed.addTab("Tab 3", tab3);
				
		JTextArea area = new JTextArea("Text entry here: ", 50, 100);
		JPanel panel1 = new JPanel(new GridLayout());
		panel1.add(area);
		
		JPanel main = new JPanel();
		
		main.add(tabbed);
		main.add(area);
		
		backg.add(tabbed, BorderLayout.WEST);
		backg.add(area, BorderLayout.CENTER);
		
		frame.getContentPane().add(backg, BorderLayout.CENTER);
		
		
		frame.setSize(800, 480);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
}
