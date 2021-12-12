package system;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;

public class WelcomePage {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
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

	/**
	 * Create the application.
	 */
	public WelcomePage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Food ordering system");
		frame.setBounds(100, 100, 1280, 720);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		ImageIcon imgIcon = new ImageIcon(getClass().getResource("./KTF_logo.jpg"));
		frame.setIconImage(imgIcon.getImage());
		
		JLabel pressToContinue = new JLabel("Press anywhere to continue...");
		pressToContinue.setHorizontalAlignment(SwingConstants.CENTER);
		pressToContinue.setFont(new Font("Segoe UI Semibold", Font.BOLD, 36));
		pressToContinue.setBounds(416, 329, 480, 50);
		frame.getContentPane().add(pressToContinue);
		
		JLabel backgroundPicture = new JLabel("");
		backgroundPicture.setForeground(Color.BLACK);
		backgroundPicture.setHorizontalAlignment(SwingConstants.CENTER);
		backgroundPicture.setIcon(new ImageIcon(getClass().getResource("./food.jpg")));
		backgroundPicture.setBounds(0, 0, 1266, 683);
		frame.getContentPane().add(backgroundPicture);
		
	}
}
