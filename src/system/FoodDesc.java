package system;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.DecimalFormat;
import java.util.LinkedList;

public class FoodDesc extends JFrame {

	private JPanel contentPane;
	private static String menuName;
	private static String menuDesc;
	private static double menuPrice;
	private static ImageIcon menuPic;
	private int quantity;
	private static LinkedList<Node> allOrder;

	//Launch the application.
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FoodDesc frame = new FoodDesc(menuName, menuPrice, menuDesc, menuPic, allOrder);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	//Create the frame.
	public FoodDesc(String menuName, double menuPrice, String menuDesc, ImageIcon menuPic, LinkedList<Node> allOrder) {
		setResizable(false);
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
		this.quantity = 0;
		this.allOrder = allOrder;
		DecimalFormat df = new DecimalFormat( "##.00" );

		//set the title, icon and size of the frame
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 640, 600);
		setTitle("Description of food");
		ImageIcon imgIcon = new ImageIcon(getClass().getResource("./resources/KTF_logo-removebg-preview.png"));
		setIconImage(imgIcon.getImage());
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// Panel for bottom bar (to put spinner, quantity word and add to cart button)
		JPanel bottomPanel = new JPanel();
		bottomPanel.setBounds(0, 500, 630, 71);
		contentPane.add(bottomPanel);
		bottomPanel.setLayout(null);

		//show spinner at the bottom of the window
		SpinnerModel spinnerModel = new SpinnerNumberModel(1, 0, 50, 1);
		JSpinner spinner = new JSpinner(spinnerModel);
		((JSpinner.NumberEditor) spinner.getEditor()).getFormat().setMaximumFractionDigits(1);
		spinner.setFont(new Font("Segoe UI", Font.PLAIN, 17));
		spinner.setBounds(108, 15, 72, 39);
		bottomPanel.add(spinner);
		
		//show Quantity: at the bottom of the window
		JLabel quantityLabel = new JLabel("Quantity:");
		quantityLabel.setFont(new Font("Segoe UI", Font.PLAIN, 22));
		quantityLabel.setHorizontalAlignment(SwingConstants.CENTER);
		quantityLabel.setBounds(10, 15, 98, 39);
		bottomPanel.add(quantityLabel);
		
		//add to cart button
		//if nothing had been added then print nothing had been add
		//if add successfully then print add to cart successfully
		JButton addToCart = new JButton("Add To Cart");
		addToCart.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if ((int)spinner.getValue()==0){
					//if the value of spinner is 0 then beep a sound and show a message dialog
					Toolkit.getDefaultToolkit().beep();
					JOptionPane.showMessageDialog(null, "Nothing had been added!", "Warning", JOptionPane.INFORMATION_MESSAGE);
				}
				else{
					//add the food into the linked list if added successfully
					Toolkit.getDefaultToolkit().beep();
					JOptionPane.showMessageDialog(null, "Add to cart successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
					dispose();
					quantity = (int)spinner.getValue();
					Order order = new Order(allOrder);
					order.addMenu(menuName,quantity,menuPrice);
				}
			}
		});
		addToCart.setBounds(443, 15, 177, 41);
		bottomPanel.add(addToCart);
		addToCart.setBackground(Color.GREEN);
		addToCart.setForeground(Color.WHITE);
		addToCart.setFont(new Font("Segoe UI", Font.BOLD, 22));

		//border decoration
		Border blackLine = BorderFactory.createLineBorder(Color.black);
		
		//panel to put all the information of food
		JPanel showDesc = new JPanel();
		showDesc.setBounds(0, 0, 630, 500);
		contentPane.add(showDesc);
		showDesc.setLayout(null);
		
		//show the description of the food
		JTextArea foodDesc = new JTextArea(menuDesc);
		foodDesc.setLineWrap(true);
		foodDesc.setBorder(blackLine);
		foodDesc.setBackground(Color.WHITE);
		foodDesc.setWrapStyleWord(true);
		foodDesc.setFont(new Font("Segoe UI", Font.PLAIN, 22));
		foodDesc.setBounds(0, 285, 630, 215);
		foodDesc.setEditable(false);
		showDesc.add(foodDesc);
		
		//show the picture of the food
		JLabel foodImage = new JLabel("");
		foodImage.setHorizontalAlignment(SwingConstants.CENTER);
		foodImage.setIcon(menuPic);
		foodImage.setBounds(0, 0, 630, 205);
		showDesc.add(foodImage);
		
		//show the name of the food
		JLabel foodName = new JLabel(menuName);
		foodName.setBorder(blackLine);
		foodName.setBackground(Color.WHITE);
		foodName.setFont(new Font("Segoe UI", Font.PLAIN, 22));
		foodName.setHorizontalAlignment(SwingConstants.CENTER);
		foodName.setBounds(0, 205, 630, 40);
		showDesc.add(foodName);
		
		
		//show the unit price of food
		JLabel foodPrice = new JLabel("Unit Price: RM "+df.format(menuPrice));
		foodPrice.setBorder(blackLine);
		foodPrice.setBackground(Color.WHITE);
		foodPrice.setHorizontalAlignment(SwingConstants.CENTER);
		foodPrice.setFont(new Font("Segoe UI", Font.PLAIN, 22));
		foodPrice.setBounds(0, 245, 630, 40);
		showDesc.add(foodPrice);
	}

}
