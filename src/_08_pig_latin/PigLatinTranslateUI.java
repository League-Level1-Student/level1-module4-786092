package _08_pig_latin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import game_tools.Sound;

public class PigLatinTranslateUI implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextField text1 = new JTextField(10);
	JTextField text2 = new JTextField(10);
	JButton button1 = new JButton(">>");
	JButton button2 = new JButton("<<");
	JButton button3 = new JButton("Speak");
	public 	PigLatinTranslateUI() {
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel.add(text1);
		panel.add(text2);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		frame.add(panel);
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		frame.pack();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==button1) {
			String latin = PigLatinTranslator.translateEnglishToPigLatin(text1.getText());
			text2.setText(latin);
		}
		else if(e.getSource()==button2) {
			String english = PigLatinTranslator.translatePigLatinToEnglish(text2.getText());
			text1.setText(english);
		}
		else {
			Sound.speak(text2.getText());
		}
	}
}
