package system;

import java.awt.EventQueue;

import javax.swing.*;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class WelcomePage extends JFrame{

	private JFrame frame;

	//Launch the application.
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WelcomePage window = new WelcomePage();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}


	 //Create the application.
	public WelcomePage() {
		initialize();
	}


	//Initialize the contents of the frame.
	private void initialize() {
		//set the size, title and icon of the window frame
		frame = new JFrame("Food ordering system");
		frame.setBounds(100, 100, 1280, 720);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		ImageIcon imgIcon = new ImageIcon(getClass().getResource("./resources/KTF_logo.jpg"));
		frame.setIconImage(imgIcon.getImage());
		
		//add the "Press to continue..." at the center of the frame
		JLabel pressToContinue = new JLabel("Press anywhere to continue...");
		pressToContinue.setHorizontalAlignment(SwingConstants.CENTER);
		pressToContinue.setFont(new Font("Segoe UI Semibold", Font.BOLD, 36));
		pressToContinue.setBounds(378, 329, 480, 50);
		frame.getContentPane().add(pressToContinue);
		
		//background of the welcome page
		JLabel backgroundPicture = new JLabel("");
		//if detect mouse clicked, it will direct user to main pages and close
		backgroundPicture.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				MainPages.main(null);
				frame.dispose();
			}
		});
		backgroundPicture.setForeground(Color.BLACK);
		backgroundPicture.setHorizontalAlignment(SwingConstants.CENTER);
		backgroundPicture.setIcon(new ImageIcon(getClass().getResource("./resources/food.jpg")));
		backgroundPicture.setBounds(0, 0, 1266, 683);
		frame.getContentPane().add(backgroundPicture);
	}
}
