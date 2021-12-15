package system;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JSpinner;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FoodDesc extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FoodDesc frame = new FoodDesc();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FoodDesc() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 640, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel header = new JPanel();
		header.setBounds(0, 0, 630, 100);
		contentPane.add(header);
		header.setLayout(null);
		
		JPanel bottomPanel = new JPanel();
		bottomPanel.setBounds(0, 500, 630, 71);
		contentPane.add(bottomPanel);
		bottomPanel.setLayout(null);
		
		JSpinner spinner = new JSpinner();
		spinner.setFont(new Font("Segoe UI", Font.PLAIN, 17));
		spinner.setBounds(108, 15, 72, 39);
		bottomPanel.add(spinner);
		
		JLabel quantityLabel = new JLabel("Quantity:");
		quantityLabel.setFont(new Font("Segoe UI", Font.PLAIN, 22));
		quantityLabel.setHorizontalAlignment(SwingConstants.CENTER);
		quantityLabel.setBounds(10, 15, 98, 39);
		bottomPanel.add(quantityLabel);
		
		JButton addToCart = new JButton("Add To Cart");
		addToCart.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "Add to cart successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
				dispose();
			}
		});
		addToCart.setBounds(443, 15, 177, 41);
		bottomPanel.add(addToCart);
		addToCart.setBackground(Color.GREEN);
		addToCart.setForeground(Color.WHITE);
		addToCart.setFont(new Font("Segoe UI", Font.BOLD, 22));
		
		JPanel showDesc = new JPanel();
		showDesc.setBounds(0, 100, 630, 400);
		contentPane.add(showDesc);
		showDesc.setLayout(null);
		
		JLabel foodImage = new JLabel("");
		foodImage.setBounds(0, 0, 630, 229);
		showDesc.add(foodImage);
		
		JLabel foodDesc = new JLabel("New label");
		foodDesc.setFont(new Font("Segoe UI", Font.PLAIN, 22));
		foodDesc.setBounds(0, 229, 630, 171);
		showDesc.add(foodDesc);
	}
}
