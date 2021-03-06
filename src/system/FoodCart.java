package system;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
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
		DecimalFormat df = new DecimalFormat( "#0.00" );
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
					Toolkit.getDefaultToolkit().beep();
					JOptionPane.showMessageDialog(null, "Order Success! Please make your payment at the counter!\nYour order number is "+WaitingNumber.waitingNumber+".", "Success!", JOptionPane.INFORMATION_MESSAGE);
					Order order = new Order(allOrder);
					new OutputOrders(allOrder, WaitingNumber.waitingNumber);
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
		JButton delete16 = new JButton("-");
		delete16.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
					if (numberOfNode>=16){
						order.removeMenu(allOrder.get(15).menuName, allOrder.get(15).quantity, allOrder.get(15).price);
								dispose();
						FoodCart.main(args);
					}
		}});
		delete16.setBounds(566, 421, 49, 15);
		if (numberOfNode>=16) {
			contentPane.add(delete16);
		}
				
		//15th delete button
		//subtract the quantity of order by one
		JButton delete15 = new JButton("-");
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
		delete15.setBounds(566, 406, 49, 15);
		if (numberOfNode>=15) {
			contentPane.add(delete15);
		}
				
		//14th delete button
		//subtract the quantity of order by one
		JButton delete14 = new JButton("-");
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
		delete14.setBounds(566, 391, 49, 15);
		if (numberOfNode>=14) {
			contentPane.add(delete14);
		}
		
		
		//13th delete button
		//subtract the quantity of order by one
		JButton delete13 = new JButton("-");
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
		delete13.setBounds(566, 376, 49, 15);
		if (numberOfNode>=13) {
			contentPane.add(delete13);
		}

		
		//12th delete button
		//subtract the quantity of order by one
		JButton delete12 = new JButton("-");
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
		delete12.setBounds(566, 361, 49, 15);
		if (numberOfNode>=12) {
			contentPane.add(delete12);
		}
		
		//11th delete button
		//subtract the quantity of order by one
		JButton delete11 = new JButton("-");
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
		delete11.setBounds(566, 346, 49, 15);
		if (numberOfNode>=11) {
			contentPane.add(delete11);
		}
		
		//10th delete button
		//subtract the quantity of order by one
		JButton delete10 = new JButton("-");
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
		delete10.setBounds(566, 331, 49, 15);
		if (numberOfNode>=10) {
			contentPane.add(delete10);
		}
		
		//9th delete button
		//subtract the quantity of order by one
		JButton delete9 = new JButton("-");
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
		delete9.setBounds(566, 316, 49, 15);
		if (numberOfNode>=9) {
			contentPane.add(delete9);
		}
		
		//8th delete button
		//subtract the quantity of order by one
		JButton delete8 = new JButton("-");
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
		delete8.setBounds(566, 301, 49, 15);
		if (numberOfNode>=8) {
			contentPane.add(delete8);
		}
		
		//7th delete button
		//subtract the quantity of order by one
		JButton delete7 = new JButton("-");
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
		delete7.setBounds(566, 286, 49, 15);
		if (numberOfNode>=7) {
			contentPane.add(delete7);
		}
		
		//6th delete button
		//subtract the quantity of order by one
		JButton delete6 = new JButton("-");
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
		delete6.setBounds(566, 271, 49, 15);
		if (numberOfNode>=6) {
			contentPane.add(delete6);
		}
		
		//5th delete button
		//subtract the quantity of order by one
		JButton delete5 = new JButton("-");
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
		delete5.setBounds(566, 256, 49, 15);
		if (numberOfNode>=5) {
			contentPane.add(delete5);
		}
		
		//4th delete button
		//subtract the quantity of order by one
		JButton delete4 = new JButton("-");
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
		delete4.setBounds(566, 241, 49, 15);
		if (numberOfNode>=4) {
			contentPane.add(delete4);
		}
		
		//3rd delete button
		//subtract the quantity of order by one
		JButton delete3 = new JButton("-");
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
		delete3.setBounds(566, 226, 49, 15);
		if (numberOfNode>=3) {
			contentPane.add(delete3);
		}
		
		//2th delete button
		//subtract the quantity of order by one
		JButton delete2 = new JButton("-");
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
		delete2.setBounds(566, 211, 49, 15);
		if (numberOfNode>=2) {
			contentPane.add(delete2);
		}
		
		//1st delete button
		//subtract the quantity of order by one
		JButton delete1 = new JButton("-");
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
		delete1.setBounds(566, 196, 49, 15);
		if (numberOfNode>=1) {
			contentPane.add(delete1);
		}
		
		//1st add button
		//add the quantity of order by one
		JButton add1 = new JButton("+");
		add1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (numberOfNode>=1){
					order.addMenu(allOrder.get(0).menuName, 1, allOrder.get(0).price);
					dispose();
					FoodCart.main(args);
				}
			}
		});
		add1.setBounds(516, 196, 50, 15);
		if (numberOfNode>=1) {
			contentPane.add(add1);
		}
		
		//2nd add button
		//add the quantity of order by one
		JButton add2 = new JButton("+");
		add2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (numberOfNode>=2){
					order.addMenu(allOrder.get(1).menuName, 1, allOrder.get(1).price);
					dispose();
					FoodCart.main(args);
				}
			}
		});
		add2.setBounds(516, 211, 50, 15);
		if (numberOfNode>=2) {
			contentPane.add(add2);
		}
		
		//3rd add button
		//add the quantity of order by one
		JButton add3 = new JButton("+");
		add3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (numberOfNode>=3){
					order.addMenu(allOrder.get(2).menuName, 1, allOrder.get(2).price);
					dispose();
					FoodCart.main(args);
				}
			}
		});
		add3.setBounds(516, 226, 50, 15);
		if (numberOfNode>=3) {
			contentPane.add(add3);
		}
		
		//4th add button
		//add the quantity of order by one
		JButton add4 = new JButton("+");
		add4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (numberOfNode>=4){
					order.addMenu(allOrder.get(3).menuName, 1, allOrder.get(3).price);
					dispose();
					FoodCart.main(args);
				}
			}
		});
		add4.setBounds(516, 241, 50, 15);
		if (numberOfNode>=4) {
			contentPane.add(add4);
		}
		
		//5th add button
		//add the quantity of order by one
		JButton add5 = new JButton("+");
		add5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (numberOfNode>=5){
					order.addMenu(allOrder.get(4).menuName, 1, allOrder.get(4).price);
					dispose();
					FoodCart.main(args);
				}
			}
		});
		add5.setBounds(516, 256, 50, 15);
		if (numberOfNode>=5) {
			contentPane.add(add5);
		}
		
		//6th add button
		//add the quantity of order by one
		JButton add6 = new JButton("+");
		add6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (numberOfNode>=6){
					order.addMenu(allOrder.get(5).menuName, 1, allOrder.get(5).price);
					dispose();
					FoodCart.main(args);
				}
			}
		});
		add6.setBounds(516, 271, 50, 15);
		if (numberOfNode>=6) {
			contentPane.add(add6);
		}
		
		//7th add button
		//add the quantity of order by one
		JButton add7 = new JButton("+");
		add7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (numberOfNode>=7){
					order.addMenu(allOrder.get(6).menuName, 1, allOrder.get(6).price);
					dispose();
					FoodCart.main(args);
				}
			}
		});
		add7.setBounds(516, 286, 50, 15);
		if (numberOfNode>=7) {
			contentPane.add(add7);
		}
		
		//8th add button
		//add the quantity of order by one
		JButton add8 = new JButton("+");
		add8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (numberOfNode>=8){
					order.addMenu(allOrder.get(7).menuName, 1, allOrder.get(7).price);
					dispose();
					FoodCart.main(args);
				}
			}
		});
		add8.setBounds(516, 301, 50, 15);
		if (numberOfNode>=8) {
			contentPane.add(add8);
		}
		
		//9th add button
		//add the quantity of order by one
		JButton add9 = new JButton("+");
		add9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (numberOfNode>=9){
					order.addMenu(allOrder.get(8).menuName, 1, allOrder.get(8).price);
					dispose();
					FoodCart.main(args);
				}
			}
		});
		add9.setBounds(516, 316, 50, 15);
		if (numberOfNode>=9) {
			contentPane.add(add9);
		}
		
		//10th add button
		//add the quantity of order by one
		JButton add10 = new JButton("+");
		add10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (numberOfNode>=1){
					order.addMenu(allOrder.get(9).menuName, 1, allOrder.get(9).price);
					dispose();
					FoodCart.main(args);
				}
			}
		});
		add10.setBounds(516, 331, 50, 15);
		if (numberOfNode>=10) {
			contentPane.add(add10);
		}
		
		//11th add button
		//add the quantity of order by one
		JButton add11 = new JButton("+");
		add11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (numberOfNode>=11){
					order.addMenu(allOrder.get(10).menuName, 1, allOrder.get(10).price);
					dispose();
					FoodCart.main(args);
				}
			}
		});
		add11.setBounds(516, 346, 50, 15);
		if (numberOfNode>=11) {
			contentPane.add(add11);
		}
		
		//12th add button
		//add the quantity of order by one
		JButton add12 = new JButton("+");
		add12.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (numberOfNode>=12){
					order.addMenu(allOrder.get(11).menuName, 1, allOrder.get(11).price);
					dispose();
					FoodCart.main(args);
				}
			}
		});
		add12.setBounds(516, 361, 50, 15);
		if (numberOfNode>=12) {
			contentPane.add(add12);
		}
		
		//13th add button
		//add the quantity of order by one
		JButton add13 = new JButton("+");
		add13.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (numberOfNode>=1){
					order.addMenu(allOrder.get(12).menuName, 1, allOrder.get(12).price);
					dispose();
					FoodCart.main(args);
				}
			}
		});
		add13.setBounds(516, 376, 50, 15);
		if (numberOfNode>=13) {
			contentPane.add(add13);
		}
		
		//14th add button
		//add the quantity of order by one
		JButton add14 = new JButton("+");
		add14.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (numberOfNode>=14){
					order.addMenu(allOrder.get(13).menuName, 1, allOrder.get(13).price);
					dispose();
					FoodCart.main(args);
				}
			}
		});
		add14.setBounds(516, 391, 50, 15);
		if (numberOfNode>=14) {
			contentPane.add(add14);
		}
		
		//15th add button
		//add the quantity of order by one
		JButton add15 = new JButton("+");
		add15.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (numberOfNode>=15){
					order.addMenu(allOrder.get(14).menuName, 1, allOrder.get(14).price);
					dispose();
					FoodCart.main(args);
				}
			}
		});
		add15.setBounds(516, 406, 50, 15);
		if (numberOfNode>=15) {
			contentPane.add(add15);
		}
		
		//16th add button
		//add the quantity of order by one
		JButton add16 = new JButton("+");
		add16.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (numberOfNode>=16){
					order.addMenu(allOrder.get(15).menuName, 1, allOrder.get(15).price);
					dispose();
					FoodCart.main(args);
				}
			}
		});
		add16.setBounds(516, 421, 50, 15);
		if (numberOfNode>=16) {
			contentPane.add(add16);
		}
		
		//create a button that clear all the orders after clicked
		JButton clearAllButton = new JButton("Clear All");
		clearAllButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				order.deleteAll(allOrder);
				dispose();
				FoodCart.main(args);
			}
		});
		clearAllButton.setFont(new Font("Segoe UI", Font.PLAIN, 25));
		clearAllButton.setBounds(96, 487, 133, 46);
		contentPane.add(clearAllButton);
		
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
		total.setHorizontalAlignment(SwingConstants.LEFT);
		total.setBounds(411, 450, 142, 40);
		contentPane.add(total);
		
		//create model for table
		DefaultTableModel model = new DefaultTableModel();
		//set name of column of the table
		model.setColumnIdentifiers(new Object[]{"No.", "Food Name", "Qty.", "Unit Price", "Total"});
		model.addRow(new Object[]{"No.", "Food Name", "Qty.", "Unit Price","Total"});
		//insert the detail of the order from the linked list into the table
		for (int i=0; i<allOrder.size();i++){
			model.addRow(new Object[]{String.valueOf(i+1), allOrder.get(i).menuName, allOrder.get(i).quantity, df.format(allOrder.get(i).price), df.format(allOrder.get(i).price*allOrder.get(i).quantity),""});
		}
		//create a table and put the model into the table
		JTable table = new JTable(model);
		table.setBounds(16,181,500,260);
		table.getColumnModel().getColumn(0).setPreferredWidth(5);
		table.getColumnModel().getColumn(1).setPreferredWidth(200);
		table.getColumnModel().getColumn(2).setPreferredWidth(20);
		table.getColumnModel().getColumn(3).setPreferredWidth(20);
		table.getColumnModel().getColumn(4).setPreferredWidth(20);
		table.setModel(model);
		table.setRowHeight(15);

		contentPane.add(table);
	}
}