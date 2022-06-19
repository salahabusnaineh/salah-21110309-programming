# salah-21110309-programming
package eventdriven;

import java.awt.*;
import javax.swing.*;

public class Eventdriven {

	public static void main(String[] args) {
		JFrame frame1 = new JFrame("Frame1");
		frame1.setSize(500, 400);
		frame1.setVisible(true);
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel lable1 = new JLabel("Welcome to Swing");
		lable1.setBounds(140, 10, 150, 50);
		frame1.add(lable1);

		Font font1 = new Font("Arial", Font.BOLD, 16);
		JButton button1 = new JButton("Button1");
		button1.setBounds(10, 10, 100, 50);
		button1.setBackground(Color.blue);
		button1.setForeground(Color.red);
		frame1.add(button1);
		frame1.setLayout(null);
	}

}
