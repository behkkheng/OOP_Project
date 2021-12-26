package system;

import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DecimalFormat;
import java.util.LinkedList;

public class FoodCart extends JFrame {

	private JPanel contentPane;
	private static LinkedList<Node> allOrder;
	String[] args = new String[1];

	//Launch the application.
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FoodCart frame = new FoodCart(allOrder);
					frame.setVisible(true);
					//set the icon of window frame
					ImageIcon imgIcon = new ImageIcon(getClass().getResource("./resources/KTF_logo-removebg-preview.png"));
					frame.setIconImage(imgIcon.getImage());
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	//Create the frame, set the title, icon and size of the frame
	public FoodCart(LinkedList<Node> allOrder) {
		Order order = new Order(allOrder);
		int numberOfNode = allOrder.size();
		DecimalFormat df = new DecimalFormat( "##.00" );
		this.allOrder = allOrder;
		
		//set the title of the frame
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 640, 600);
		setTitle("Food cart");
		
		//create a panel on the frame
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//confirm button 
		JButton confirmButton = new JButton("Buy");
		confirmButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (numberOfNode == 0){ //if no order in the linked list then show dialog window nothing had been added
					JOptionPane.showMessageDialog(null, "Nothing had been added!", "Success!", JOptionPane.INFORMATION_MESSAGE);
					dispose();
				}
				else{ // if gt order in linked list then show dialog window success, write the orders and waiting
					  // number in a file call orders.txt and delete all the order in the linked list
					  // waiting number append by 1 for each successful orders
					WaitingNumber.waitingNumber++;
					JOptionPane.showMessageDialog(null, "Order Success! Please make your payment at the counter!\nYour order number is "+WaitingNumber.waitingNumber+".", "Success!", JOptionPane.INFORMATION_MESSAGE);
					Order order = new Order(allOrder);
					OutputOrders outputOrders = new OutputOrders(allOrder, WaitingNumber.waitingNumber);
					String[] args = new String[1];
					OutputOrders.main(args);
					order.deleteAll(allOrder);
					dispose();
				}
			}
		});
		confirmButton.setFont(new Font("Segoe UI", Font.PLAIN, 25));
		confirmButton.setBounds(410, 487, 114, 46);
		contentPane.add(confirmButton);
		
		
		
		//16th delete button
		//subtract the quantity of order by one
		JButton delete16 = new JButton("Delete");
		delete16.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
					if (numberOfNode>=16){
						order.removeMenu(allOrder.get(15).menuName, allOrder.get(15).quantity, allOrder.get(15).price);
								dispose();
						FoodCart.main(args);
					}
		}});
		delete16.setBounds(516, 422, 100, 15);
		contentPane.add(delete16);
				
		//15th delete button
		//subtract the quantity of order by one
		JButton delete15 = new JButton("Delete");
		delete15.addMouseListener(new MouseAdapter() {
			@Override
					public void mouseClicked(MouseEvent e) {
				if (numberOfNode>=15){
					order.removeMenu(allOrder.get(14).menuName, allOrder.get(14).quantity, allOrder.get(14).price);
					dispose();
					FoodCart.main(args);
				}
			}
		});
		delete15.setBounds(516, 407, 100, 15);
		contentPane.add(delete15);
				
		//14th delete button
		//subtract the quantity of order by one
		JButton delete14 = new JButton("Delete");
		delete14.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (numberOfNode>=14){
					order.removeMenu(allOrder.get(13).menuName, allOrder.get(13).quantity, allOrder.get(13).price);
					dispose();
					FoodCart.main(args);
				}
			}
		});
		delete14.setBounds(516, 392, 100, 15);
		contentPane.add(delete14);
		
		
		//13th delete button
		//subtract the quantity of order by one
		JButton delete13 = new JButton("Delete");
		delete13.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (numberOfNode>=13){
					order.removeMenu(allOrder.get(12).menuName, allOrder.get(12).quantity, allOrder.get(12).price);
					dispose();
					FoodCart.main(args);
				}
			}
		});
		delete13.setBounds(516, 377, 100, 15);
		contentPane.add(delete13);

		
		//12th delete button
		//subtract the quantity of order by one
		JButton delete12 = new JButton("Delete");
		delete12.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (numberOfNode>=12){
					order.removeMenu(allOrder.get(11).menuName, allOrder.get(11).quantity, allOrder.get(11).price);
					dispose();
					FoodCart.main(args);
				}
			}
		});
		delete12.setBounds(516, 362, 100, 15);
		contentPane.add(delete12);
		
		//11th delete button
		//subtract the quantity of order by one
		JButton delete11 = new JButton("Delete");
		delete11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (numberOfNode>=11){
					order.removeMenu(allOrder.get(10).menuName, allOrder.get(10).quantity, allOrder.get(10).price);
					dispose();
					FoodCart.main(args);
				}
			}
		});
		delete11.setBounds(516, 347, 100, 15);
		contentPane.add(delete11);
		
		//10th delete button
		//subtract the quantity of order by one
		JButton delete10 = new JButton("Delete");
		delete10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (numberOfNode>=10){
					order.removeMenu(allOrder.get(9).menuName, allOrder.get(9).quantity, allOrder.get(9).price);
					dispose();
					FoodCart.main(args);
				}
			}
		});
		delete10.setBounds(516, 332, 100, 15);
		contentPane.add(delete10);
		
		//9th delete button
		//subtract the quantity of order by one
		JButton delete9 = new JButton("Delete");
		delete9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (numberOfNode>=9){
					order.removeMenu(allOrder.get(8).menuName, allOrder.get(8).quantity, allOrder.get(8).price);
					dispose();
					FoodCart.main(args);
				}
			}
		});
		delete9.setBounds(516, 317, 100, 15);
		contentPane.add(delete9);
		
		//8th delete button
		//subtract the quantity of order by one
		JButton delete8 = new JButton("Delete");
		delete8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (numberOfNode>=8){
					order.removeMenu(allOrder.get(7).menuName, allOrder.get(7).quantity, allOrder.get(7).price);
					dispose();
					FoodCart.main(args);
				}
			}
		});
		delete8.setBounds(516, 302, 100, 15);
		contentPane.add(delete8);
		
		//7th delete button
		//subtract the quantity of order by one
		JButton delete7 = new JButton("Delete");
		delete7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (numberOfNode>=7){
					order.removeMenu(allOrder.get(6).menuName, allOrder.get(6).quantity, allOrder.get(6).price);
					dispose();
					FoodCart.main(args);
				}
			}
		});
		delete7.setBounds(516, 287, 100, 15);
		contentPane.add(delete7);
		
		//6th delete button
		//subtract the quantity of order by one
		JButton delete6 = new JButton("Delete");
		delete6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (numberOfNode>=6){
					order.removeMenu(allOrder.get(5).menuName, allOrder.get(5).quantity, allOrder.get(5).price);
					dispose();
					FoodCart.main(args);
				}
			}
		});
		delete6.setBounds(516, 272, 100, 15);
		contentPane.add(delete6);
		
		//5th delete button
		//subtract the quantity of order by one
		JButton delete5 = new JButton("Delete");
		delete5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (numberOfNode>=5){
					order.removeMenu(allOrder.get(4).menuName, allOrder.get(4).quantity, allOrder.get(4).price);
					dispose();
					FoodCart.main(args);
				}
			}
		});
		delete5.setBounds(516, 257, 100, 15);
		contentPane.add(delete5);
		
		//4th delete button
		//subtract the quantity of order by one
		JButton delete4 = new JButton("Delete");
		delete4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (numberOfNode>=4){
					order.removeMenu(allOrder.get(3).menuName, allOrder.get(3).quantity, allOrder.get(3).price);
					dispose();
					FoodCart.main(args);
				}
			}
		});
		delete4.setBounds(516, 242, 100, 15);
		contentPane.add(delete4);
		
		//3rd delete button
		//subtract the quantity of order by one
		JButton delete3 = new JButton("Delete");
		delete3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (numberOfNode>=3){
					order.removeMenu(allOrder.get(2).menuName, allOrder.get(2).quantity, allOrder.get(2).price);
					dispose();
					FoodCart.main(args);
				}
			}
		});
		delete3.setBounds(516, 227, 100, 15);
		contentPane.add(delete3);
		
		//2th delete button
		//subtract the quantity of order by one
		JButton delete2 = new JButton("Delete");
		delete2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (numberOfNode>=2){
					order.removeMenu(allOrder.get(1).menuName, allOrder.get(1).quantity, allOrder.get(1).price);
					dispose();
					FoodCart.main(args);
				}
			}
		});
		delete2.setBounds(516, 212, 100, 15);
		contentPane.add(delete2);
		
		//1st delete button
		//subtract the quantity of order by one
		JButton delete1 = new JButton("Delete");
		delete1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (numberOfNode>=1){
					order.removeMenu(allOrder.get(0).menuName, allOrder.get(0).quantity, allOrder.get(0).price);
					dispose();
					FoodCart.main(args);
				}
			}
		});
		delete1.setBounds(516, 197, 100, 15);
		contentPane.add(delete1);
		
		
		//create a cancel button that dispose the window after clicked
		JButton cancelButton = new JButton("Cancel");
		cancelButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		cancelButton.setFont(new Font("Segoe UI", Font.PLAIN, 25));
		cancelButton.setBounds(96, 490, 124, 41);
		contentPane.add(cancelButton);
		
		//create the panel for the header
		JPanel header = new JPanel();
		header.setBackground(Color.WHITE);
		header.setBounds(0, 0, 630, 100);
		contentPane.add(header);
		header.setLayout(null);
		
		//show the words of order details
		JLabel orderDetailsTitle = new JLabel("Order Details");
		orderDetailsTitle.setFont(new Font("Segoe UI Black", Font.BOLD, 32));
		orderDetailsTitle.setHorizontalAlignment(SwingConstants.CENTER);
		orderDetailsTitle.setBounds(185, 110, 260, 60);
		contentPane.add(orderDetailsTitle);
		
		//show the logo of the KTF
		JLabel logo = new JLabel("");
		logo.setIcon(new ImageIcon(FoodCart.class.getResource("./resources/KTF_resize-removebg-preview.png")));
		logo.setBounds(32, 10, 98, 85);
		header.add(logo);
		
		//show the big title of the food cart window
		JLabel lblNewLabel = new JLabel("Food Cart");
		lblNewLabel.setFont(new Font("Gill Sans MT", Font.BOLD, 34));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(205, 22, 220, 55);
		header.add(lblNewLabel);

		//show total amount of the orders
		//calculate the sum of orders
		double sum = 0;
		for (int i = 0; i < allOrder.size(); i++) {
			sum += allOrder.get(i).price*allOrder.get(i).quantity;
		}

		JLabel total = new JLabel("Total: RM "+df.format(sum));
		total.setFont(new Font("Tahoma", Font.PLAIN, 17));
		total.setHorizontalAlignment(SwingConstants.RIGHT);
		total.setBounds(330, 450, 205, 40);
		contentPane.add(total);
		
		//create model for table
		DefaultTableModel model = new DefaultTableModel();
		//set name of column of the table
		model.setColumnIdentifiers(new Object[]{"No.", "Food Name", "Qty.", "Unit Price", "Total",""});
		model.addRow(new Object[]{"No.", "Food Name", "Qty.", "Unit Price","Total",""});
		//insert the detail of the order from the linked list into the table
		for (int i=0; i<allOrder.size();i++){
			model.addRow(new Object[]{String.valueOf(i+1), allOrder.get(i).menuName, allOrder.get(i).quantity, df.format(allOrder.get(i).price), df.format(allOrder.get(i).price*allOrder.get(i).quantity),""});
		}
		//create a table and put the model into the table
		JTable table = new JTable(model);
		table.setBounds(16,181,599,260);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		table.setCellSelectionEnabled(true);
		table.setModel(model);
		contentPane.add(table);
	}
}