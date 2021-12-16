package system;

import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DecimalFormat;
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
		DecimalFormat df = new DecimalFormat( "##.00" );
		this.allOrder = allOrder;
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 640, 600);
		setTitle("Food cart");
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton confirmButton = new JButton("Buy");
		confirmButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "Order Success! Please wait a while for preparing food!", "Success!", JOptionPane.INFORMATION_MESSAGE);
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

		double sum = 0;
		for (int i = 0; i < allOrder.size(); i++) {
			sum += allOrder.get(i).price*allOrder.get(i).quantity;
			}

		JLabel total = new JLabel("Total: RM "+sum);
		total.setFont(new Font("Tahoma", Font.PLAIN, 17));
		total.setHorizontalAlignment(SwingConstants.RIGHT);
		total.setBounds(330, 450, 205, 40);
		contentPane.add(total);

		DefaultTableModel model = new DefaultTableModel();
		model.setColumnIdentifiers(new Object[]{"No.", "Food Name", "Qty.", "Unit Price", "Total",""});
		JTable table = new JTable(model) {
			private static final long serialVersionUID = 1L;

			public boolean isCellEditable(int row, int column) {
				return false;
			};
		};
		model.addRow(new Object[]{"No.", "Food Name", "Qty.", "Unit Price","Total",""});
		table.setBounds(16,180,599,260);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		table.setCellSelectionEnabled(true);
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int row = table.rowAtPoint(e.getPoint());
				int col = table.columnAtPoint(e.getPoint());
				if (col == 6){
					for(int i=0; i<allOrder.size(); i++){
						if (row == i+1){
							Order order = new Order(allOrder);
							order.removeMenu(allOrder.get(i).menuName,allOrder.get(i).quantity,allOrder.get(i).price);
						}
					}
				}
			}
		});

		contentPane.add(table);

		for (int i=0; i<allOrder.size();i++){
			model.addRow(new Object[]{String.valueOf(i+1), allOrder.get(i).menuName, allOrder.get(i).quantity, allOrder.get(i).price, df.format(allOrder.get(i).price*allOrder.get(i).quantity),"Delete"});

		}
	}

}