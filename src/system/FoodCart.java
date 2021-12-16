package system;

import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.LinkedList;

public class FoodCart extends JFrame {

	private JPanel contentPane;
	private static LinkedList<Node> allOrder;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FoodCart frame = new FoodCart(allOrder);
					frame.setVisible(true);
					ImageIcon imgIcon = new ImageIcon(getClass().getResource("./resources/KTF_logo.jpg"));
					frame.setIconImage(imgIcon.getImage());
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FoodCart(LinkedList<Node> allOrder) {
		this.allOrder = allOrder;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 640, 600);
		setTitle("Food cart");
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton confirmButton = new JButton("Confirm");
		confirmButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "Order Success! Your waiting number is ", "Success!", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		confirmButton.setFont(new Font("Segoe UI", Font.PLAIN, 25));
		confirmButton.setBounds(411, 500, 124, 41);
		contentPane.add(confirmButton);
		
		JButton cancelButton = new JButton("Cancel");
		cancelButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		cancelButton.setFont(new Font("Segoe UI", Font.PLAIN, 25));
		cancelButton.setBounds(96, 500, 124, 41);
		contentPane.add(cancelButton);
		
		JPanel header = new JPanel();
		header.setBackground(Color.GRAY);
		header.setBounds(0, 0, 630, 100);
		contentPane.add(header);
		header.setLayout(null);
		
		JLabel orderDetailsTitle = new JLabel("Order Details");
		orderDetailsTitle.setFont(new Font("Segoe UI Black", Font.BOLD, 32));
		orderDetailsTitle.setHorizontalAlignment(SwingConstants.CENTER);
		orderDetailsTitle.setBounds(185, 110, 260, 60);
		contentPane.add(orderDetailsTitle);
		
		JLabel logo = new JLabel("");
		logo.setIcon(new ImageIcon(FoodCart.class.getResource("/system/resources/KTF_resize.jpg")));
		logo.setBounds(10, 5, 98, 85);
		header.add(logo);
		
		JLabel lblNewLabel = new JLabel("Food Cart");
		lblNewLabel.setFont(new Font("Gill Sans MT", Font.BOLD, 34));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(205, 22, 220, 55);
		header.add(lblNewLabel);
		
		JButton back = new JButton("");
		back.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		back.setIcon(new ImageIcon(FoodCart.class.getResource("/system/resources/back resize.png")));
		back.setBounds(530, 5, 90, 90);
		header.add(back);
		
		JLabel orderDetails = new JLabel("New label");
		orderDetails.setFont(new Font("Tahoma", Font.PLAIN, 17));
		orderDetails.setHorizontalAlignment(SwingConstants.CENTER);
		orderDetails.setBounds(96, 180, 439, 260);
		contentPane.add(orderDetails);
		
		JLabel total = new JLabel("Total: RM ");
		total.setFont(new Font("Tahoma", Font.PLAIN, 17));
		total.setHorizontalAlignment(SwingConstants.RIGHT);
		total.setBounds(330, 450, 205, 40);
		contentPane.add(total);

		DefaultTableModel model = new DefaultTableModel();
		JTable table = new JTable(model);
		table.setBounds(16,180,599,260);
		model.addRow(new Object[]{"No.", "Food Name", "Qty.", "Unit Price", "Total"});

		for (int i=0; i<allOrder.size();i++){
			model.addRow(new Object[]{String.valueOf(i+1), allOrder.get(i).menuName, allOrder.get(i).quantity, allOrder.get(i).price, allOrder.get(i).price*allOrder.get(i).quantity});

		}
	}
}
