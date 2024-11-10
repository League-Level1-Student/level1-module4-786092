package _09_whack_a_mole;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {
	static void speak(String words) {
        if( System.getProperty( "os.name" ).contains( "Windows" ) ) {
            String cmd = "PowerShell -Command \"Add-Type -AssemblyName System.Speech; (New-Object System.Speech.Synthesis.SpeechSynthesizer).Speak('"
                    + words + "');\"";
            try {
                Runtime.getRuntime().exec( cmd ).waitFor();
            } catch( Exception e ) {
                e.printStackTrace();
            }
        } else {
            try {
                Runtime.getRuntime().exec( "say " + words ).waitFor();
            } catch( Exception e ) {
                e.printStackTrace();
            }
        }
    }
	public WhackAMole() {
		
		int number = random.nextInt(24);
		drawButtons(number);
		
	}
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton moleButton = new JButton();
	Random random = new Random();
	Date date = new Date();
	int score = 0;
	public void drawButtons(int num) {
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel.setLayout(new GridLayout(8,3));
		frame.add(panel);
		for(int i=0; i<24; i++) {
			JButton button = new JButton();
			panel.add(button);
			button.addActionListener(this);
			if(i==num) {
				moleButton = button;
				button.setText("Mole");
			}
		}
		frame.pack();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==moleButton) {
			score+=1;
		}
		else {
			speak("You Missed!");
		}
		frame.dispose();
		frame = new JFrame();
		panel = new JPanel();
		int number = random.nextInt(24);
		moleButton.setText("");
		drawButtons(number);
		if(score>=10) {
			endGame(date, score);
		}
	}
	private void endGame(Date timeAtStart, int molesWhacked) { 
	    Date timeAtEnd = new Date();
	    JOptionPane.showMessageDialog(null, "Your whack rate is "
	            + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
	                  + " moles per second.");
	}
}
