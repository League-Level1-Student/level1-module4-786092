package _04_book_of_illusions;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
 
/** We’re going to make a slideshow of cool optical illusions. When the user clicks on an illusion, a new one will be loaded. **/

public class BookOfIllusions extends MouseAdapter {
	String image1 = "https://img.freepik.com/premium-photo/impossible-geometric-figure-optical-illusion-3d-illustration_151689-447.jpg";
	String image2 = "https://www.sciencealert.com/images/2020-12/010-shroeder-staircase-1.jpg";
	// 1. Make a JFrame variable and initialize it using "new JFrame()"
	JFrame frame = new JFrame();
	public void run() {
		// 2. make the frame visible
		frame.setVisible(true);
		// 3. set the size of the frame
		frame.setSize(500,500);
		// 4. find 2 images and save them to your project’s _06_book_of_illusions folder
		// 5. make a variable to hold the location of your image. e.g. "illusion.jpg"
		// 6. create a variable of type "JLabel" but don’t initialize it yet
		JLabel label;
		// 7. use the "loadImage..." methods below to initialize your JLabel
		label=loadImageFromComputer(image1);
		// 8. add your JLabel to the frame
		frame.add(label);
		// 9. call the pack() method on the frame
		frame.pack();
		// 10. add a mouse listener to your frame (hint: use *this*)
		frame.addMouseListener(this);
	}

	public void mousePressed(MouseEvent e) {
		// 11. Print "clicked!" to the console when the mouse is pressed
		System.out.println("Clicked!");
		// 12. remove everything from the frame that was added earlier
		frame.removeAll();
		// 13. load a new image like before (this is more than one line of code)
		JLabel label;
		label=loadImageFromComputer(image2);
		frame = new JFrame();
		frame.setSize(500,500);
		frame.add(label);
		frame.setVisible(true);
		// 14. pack the frame
		frame.pack();
	}

	// [OPTIONAL] 15. goad your users with some annoying or witty pop-ups

	/*
	 * To use this method, the image must be placed in your Eclipse project under "default package".
	 */
	public JLabel loadImageFromComputer(String fileName) {
		URL imageURL;
		try {
			imageURL = new URL(fileName);
			Icon icon = new ImageIcon(imageURL);
			return new JLabel(icon);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//getClass().getResource(fileName);
		return null;
		
	}

}


