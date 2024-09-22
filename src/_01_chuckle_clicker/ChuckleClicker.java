package _01_chuckle_clicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	void makeButtons() {
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		panel.add(button1);
		panel.add(button2);
		button1.setText("Joke");
		button2.setText("Punchline");
		frame.pack();
		button1.addActionListener(this);
		button2.addActionListener(this);
	}
	public static void main(String[]args) {
		ChuckleClicker chuckle = new ChuckleClicker();
		chuckle.makeButtons();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==button1) {
			JOptionPane.showMessageDialog(null, "Why don't eggs tell jokes?");
		}
		else if(e.getSource()==button2) {
			JOptionPane.showMessageDialog(null, "Because they will crack each other up");
		}
	}
}