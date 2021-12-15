package system;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.basic.BasicBorders;
import javax.swing.text.AttributeSet.ColorAttribute;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FoodDesc extends JFrame {

	private JPanel contentPane;
	private static String menuName;
	private static String menuDesc;
	private static double menuPrice;
	private static ImageIcon menuPic;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FoodDesc frame = new FoodDesc(menuName, menuPrice, menuDesc, menuPic);
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
	public FoodDesc(String menuName, double menuPrice, String menuDesc, ImageIcon menuPic) {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowDeactivated(WindowEvent e) {
				dispose();
			}
		});
		this.menuName = menuName;
		this.menuDesc = menuDesc;
		this.menuPrice = menuPrice;
		this.menuPic = menuPic;
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 640, 600);
		setTitle("Description of food");
		ImageIcon imgIcon = new ImageIcon(getClass().getResource("./resources/KTF_logo.jpg"));
		setIconImage(imgIcon.getImage());
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
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
		
		Border blackLine = BorderFactory.createLineBorder(Color.black);
		
		addToCart.setBounds(443, 15, 177, 41);
		bottomPanel.add(addToCart);
		addToCart.setBackground(Color.GREEN);
		addToCart.setForeground(Color.WHITE);
		addToCart.setFont(new Font("Segoe UI", Font.BOLD, 22));
		
		JPanel showDesc = new JPanel();
		showDesc.setBounds(0, 0, 630, 500);
		contentPane.add(showDesc);
		showDesc.setLayout(null);
		
		JLabel foodDesc = new JLabel(menuDesc);
		foodDesc.setBorder(blackLine);
		foodDesc.setBackground(Color.WHITE);
		foodDesc.setHorizontalAlignment(SwingConstants.CENTER);
		foodDesc.setFont(new Font("Segoe UI", Font.PLAIN, 22));
		foodDesc.setBounds(0, 285, 630, 215);
		showDesc.add(foodDesc);
		
		JLabel foodImage = new JLabel("");
		foodImage.setHorizontalAlignment(SwingConstants.CENTER);
		foodImage.setIcon(menuPic);
		foodImage.setBounds(0, 0, 630, 205);
		showDesc.add(foodImage);
		
		JLabel foodName = new JLabel(menuName);
	
		foodName.setBorder(blackLine);
		foodName.setBackground(Color.WHITE);
		foodName.setFont(new Font("Segoe UI", Font.PLAIN, 22));
		foodName.setHorizontalAlignment(SwingConstants.CENTER);
		foodName.setBounds(0, 205, 630, 40);
		showDesc.add(foodName);
		
		JLabel foodPrice = new JLabel("Unit Price: RM "+menuPrice);
		foodPrice.setBorder(blackLine);
		foodPrice.setBackground(Color.WHITE);
		foodPrice.setHorizontalAlignment(SwingConstants.CENTER);
		foodPrice.setFont(new Font("Segoe UI", Font.PLAIN, 22));
		foodPrice.setBounds(0, 245, 630, 40);
		showDesc.add(foodPrice);
	}
}
