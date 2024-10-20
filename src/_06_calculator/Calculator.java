package _06_calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton bAdd = new JButton();
	JButton bSubtract = new JButton();
	JButton bMultiply = new JButton();
	JButton bDivide = new JButton();
	JTextField num1 = new JTextField(10);
	JTextField num2 = new JTextField(10);
	JLabel label = new JLabel();
	
	Calculator() {
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		panel.add(num1);
		panel.add(num2);
		panel.add(bAdd);
		panel.add(bSubtract);
		panel.add(bMultiply);
		panel.add(bDivide);
		bAdd.setText("Add");
		bSubtract.setText("Subtract");
		bMultiply.setText("Multiply");
		bDivide.setText("Divide");
		panel.add(label);
		frame.pack();
		bAdd.addActionListener(this);
		bSubtract.addActionListener(this);
		bMultiply.addActionListener(this);
		bDivide.addActionListener(this);
		
	}
	
	public int add(int a, int b) {
		return a+b;
		
	}
	public int subtract(int a, int b) {
		return a-b;
		
	}
	public int multiply(int a, int b) {
		return a*b;
	}
	public int divide(int a, int b) {
		return a/b;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==bAdd) {
			String a = num1.getText();
			int number1 = Integer.parseInt(a);
			String b = num2.getText();
			int number2 = Integer.parseInt(b);
		}
	}
}