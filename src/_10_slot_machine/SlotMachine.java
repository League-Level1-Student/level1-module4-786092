package _10_slot_machine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SlotMachine implements ActionListener {
	private JLabel createLabelImage(String fileName) throws MalformedURLException {
		URL imageURL = getClass().getResource(fileName);
		if (imageURL == null) {
			System.err.println("Could not find image " + fileName);
			return new JLabel();
		}
		Icon icon = new ImageIcon(imageURL);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton("Spin");
	JLabel label1;
	JLabel label2;
	JLabel label3;

	public SlotMachine() {
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		try {
			label1 = createLabelImage("Slot Machine(1).png");
			label2 = createLabelImage("Slot Machine(2).png");
			label3 = createLabelImage("Slot Machine(3).jpg");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		panel.add(button);
		panel.add(label1);
		panel.add(label2);
		panel.add(label3);
		button.addActionListener(this);
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int num1 = rand.nextInt(3);
		int num2 = rand.nextInt(3);
		int num3 = rand.nextInt(3);
		try {
			switch (num1) {
			case 0:
				label1 = createLabelImage("Slot Machine(1).png");
				break;
			case 1:
				label1 = createLabelImage("Slot Machine(2).png");
				break;
			case 2:
				label1 = createLabelImage("Slot Machine(3).jpg");
			}
			switch (num2) {
			case 0:
				label2 = createLabelImage("Slot Machine(1).png");
				break;
			case 1:
				label2 = createLabelImage("Slot Machine(2).png");
				break;
			case 2:
				label2 = createLabelImage("Slot Machine(3).jpg");
			}
			switch (num3) {
			case 0:
				label3 = createLabelImage("Slot Machine(1).png");
				break;
			case 1:
				label3 = createLabelImage("Slot Machine(2).png");
				break;
			case 2:
				label3 = createLabelImage("Slot Machine(3).jpg");
			}
		} catch (MalformedURLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		frame.dispose();
		frame = new JFrame();
		panel = new JPanel();	
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel.add(label1);
		panel.add(label2);
		panel.add(label3);
		panel.add(button);
		frame.add(panel);
		frame.pack();
		if(num1==num2&&num2==num3) {
			JOptionPane.showMessageDialog(null, "Congratulations, You WIN!");
		}
	}
}
