package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	JButton button2 = new JButton();
	ArrayList<String> strings= new ArrayList<String>();
	String aksel = "";
	void run(){
	frame.setVisible(true);
	frame.add(panel);
	panel.add(button);
	panel.add(button2);
	
	button.addActionListener(this);
	button2.addActionListener(this);
	
	
	
	
	
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==button) {
			String x = JOptionPane.showInputDialog("what is your name?");
		strings.add(x);
		}
		else if(e.getSource()==button2) {
			for (int i=0; i<strings.size(); i++) {
				aksel=aksel+"Guest #"+(i+1)+strings.get(i) +"\n";
						
			}
		JOptionPane.showMessageDialog(null,aksel);	
		}
	
		
	
	}
}