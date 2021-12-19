package system;

import java.awt.EventQueue;
import java.awt.Color;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.Font;
import javax.swing.border.MatteBorder;
import java.awt.event.*;
import java.text.DecimalFormat;
import java.util.LinkedList;

public class MainPages {

	private JFrame frame;
	private String[] args = new String[1];

	//Launch the application.
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainPages window = new MainPages();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	//Create the application.
	public MainPages() {
		initialize();
	}

	//Initialize the contents of the frame.
	private void initialize() {
		
		Tealive tea = new Tealive();
		KFC kfc = new KFC();
		Subaidah sbd = new Subaidah();
		LinkedList<Node> allOrder = new LinkedList<>();
		DecimalFormat df = new DecimalFormat( "#0.00" );

		//create window frame and set its title, icon and size
		frame = new JFrame("Food ordering system");
		frame.setResizable(false);
		frame.setBounds(0, 0, 1280, 720);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ImageIcon imgIcon = new ImageIcon(getClass().getResource("./resources/KTF_logo.jpg"));
		frame.setIconImage(imgIcon.getImage());;
		
		JPanel basePanel = new JPanel();
		basePanel.setBounds(0, 0, 1280, 720);
		frame.getContentPane().add(basePanel);
		basePanel.setLayout(null);
		
		//top navigation bar
		JPanel topNavigationBar = new JPanel();
		topNavigationBar.setBounds(0, 0, 1266, 113);
		basePanel.add(topNavigationBar);
		topNavigationBar.setLayout(null);
			
		//logo at the top navigation bar
		JLabel logo = new JLabel("");
		logo.setIcon(new ImageIcon(MainPages.class.getResource("/system/resources/KTF_resize.jpg")));
		logo.setBounds(93, 10, 100, 90);
		topNavigationBar.add(logo);
				
		//title at the top navigation bar
		JLabel systemName = new JLabel("Tun Fatimah Residential College Food Ordering System");
		systemName.setForeground(new Color(0, 0, 0));
		systemName.setFont(new Font("Gill Sans MT", Font.BOLD, 34));
		systemName.setBounds(203, 28, 905, 51);
		topNavigationBar.add(systemName);
				
		//background of the top navigation bar
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBackground(Color.GRAY);
		lblNewLabel.setBounds(0, 0, 1266, 113);
		topNavigationBar.add(lblNewLabel);
				
		//food cart button at the top navigation bar
		JButton foodCart = new JButton("");
		foodCart.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				FoodCart foodCart = new FoodCart(allOrder);
				foodCart.main(null);
			}
		});
		foodCart.setIcon(new ImageIcon(MainPages.class.getResource("/system/resources/food cart resize.png")));
		foodCart.setBounds(1166, 10, 90, 90);
		topNavigationBar.add(foodCart);
		
		//panel to show the menu of KFC, all food of KFC will show at this panel
		JPanel KFC = new JPanel();
		KFC.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		KFC.setBackground(new Color(255, 0, 0));
		KFC.setForeground(new Color(255, 255, 255));
		KFC.setBounds(280, 113, 986, 570);
		basePanel.add(KFC);
		KFC.setLayout(null);
		
				//panel of first food of KFC
				//food description will show after clicked in a window if the data of food is present
				JPanel KFCmenu1 = new JPanel();
				KFCmenu1.setBounds(21, 25, 300, 250);
				KFC.add(KFCmenu1);
				KFCmenu1.setLayout(null);
				if (kfc.getSize() >= 1 && ! kfc.getMenuName(1).equals("")) {
					KFCmenu1.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent e) {
							FoodDesc kfcDesc = new FoodDesc(kfc.getMenuName(1),kfc.getPrice(1),kfc.getMenuDesc(1),kfc.getBigPic(1),allOrder);
							FoodDesc.main(null);
						}
					});
				}
		
				//name of first food of KFC
				JLabel kfcMenu1 = new JLabel(kfc.getMenuName(1));
				kfcMenu1.setFont(new Font("Calibri", Font.PLAIN, 22));
				kfcMenu1.setHorizontalAlignment(SwingConstants.CENTER);
				kfcMenu1.setBounds(0, 175, 300, 38);
				KFCmenu1.add(kfcMenu1);
				
				//picture of first food of KFC
				JLabel menuPic1 = new JLabel("");
				menuPic1.setIcon(kfc.getMenuPic(1));
				menuPic1.setBounds(0, 0, 300, 175);
				KFCmenu1.add(menuPic1);
				
				//price of the first food of KFC
				JLabel kfcMenu1Price = new JLabel("RM "+df.format(kfc.getPrice(1)));
				kfcMenu1Price.setHorizontalAlignment(SwingConstants.CENTER);
				kfcMenu1Price.setFont(new Font("Calibri", Font.PLAIN, 22));
				kfcMenu1Price.setBounds(0, 213, 300, 37);
				KFCmenu1.add(kfcMenu1Price);
				
				//same like the first food of KFC, but it is the second one
				//food description will show after clicked in a window if the data of food is present
				JPanel KFCmenu2 = new JPanel();
				KFCmenu2.setBounds(342, 25, 300, 250);
				KFC.add(KFCmenu2);
				KFCmenu2.setLayout(null);
				if (kfc.getSize() >= 2 && ! kfc.getMenuName(2).equals("")) {
					KFCmenu2.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent e) {
							FoodDesc kfcDesc = new FoodDesc(kfc.getMenuName(2),kfc.getPrice(2),kfc.getMenuDesc(2),kfc.getBigPic(2),allOrder);
							FoodDesc.main(null);
						}
					});
				}
				
				JLabel kfcMenu2 = new JLabel(kfc.getMenuName(2));
				kfcMenu2.setHorizontalAlignment(SwingConstants.CENTER);
				kfcMenu2.setFont(new Font("Calibri", Font.PLAIN, 22));
				kfcMenu2.setBounds(0, 175, 300, 38);
				KFCmenu2.add(kfcMenu2);
				
				JLabel menuPic2 = new JLabel("");
				menuPic2.setIcon(kfc.getMenuPic(2));
				menuPic2.setBounds(0, 0, 300, 175);
				KFCmenu2.add(menuPic2);
				
				JLabel kfcMenu2Price = new JLabel("RM "+df.format(kfc.getPrice(2)));
				kfcMenu2Price.setHorizontalAlignment(SwingConstants.CENTER);
				kfcMenu2Price.setFont(new Font("Calibri", Font.PLAIN, 22));
				kfcMenu2Price.setBounds(0, 213, 300, 37);
				KFCmenu2.add(kfcMenu2Price);
				
				//third menu of KFC
				//food description will show after clicked in a window if the data of food is present
				JPanel KFCmenu3 = new JPanel();
				KFCmenu3.setBounds(663, 25, 300, 250);
				KFC.add(KFCmenu3);
				KFCmenu3.setLayout(null);
				if (kfc.getSize() >= 3 && ! kfc.getMenuName(3).equals("")) {
					KFCmenu3.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent e) {
							FoodDesc kfcDesc = new FoodDesc(kfc.getMenuName(3),kfc.getPrice(3),kfc.getMenuDesc(3),kfc.getBigPic(3),allOrder);
							FoodDesc.main(null);
						}
					});
				}
				
				JLabel kfcMenu3 = new JLabel(kfc.getMenuName(3));
				kfcMenu3.setFont(new Font("Calibri", Font.PLAIN, 22));
				kfcMenu3.setHorizontalAlignment(SwingConstants.CENTER);
				kfcMenu3.setBounds(0, 175, 300, 38);
				KFCmenu3.add(kfcMenu3);
				
				JLabel menuPic3 = new JLabel("");
				menuPic3.setIcon(kfc.getMenuPic(3));
				menuPic3.setBounds(0, 0, 300, 175);
				KFCmenu3.add(menuPic3);
				
				JLabel kfcMenu3Price = new JLabel("RM "+df.format(kfc.getPrice(3)));
				kfcMenu3Price.setHorizontalAlignment(SwingConstants.CENTER);
				kfcMenu3Price.setFont(new Font("Calibri", Font.PLAIN, 22));
				kfcMenu3Price.setBounds(0, 213, 300, 37);
				KFCmenu3.add(kfcMenu3Price);
				
				//fourth menu of KFC
				//food description will show after clicked in a window if the data of food is present
				JPanel KFCmenu4 = new JPanel();
				KFCmenu4.setBounds(21, 300, 300, 250);
				KFC.add(KFCmenu4);
				KFCmenu4.setLayout(null);
				if (kfc.getSize() >= 4 && ! kfc.getMenuName(4).equals("")) {
					KFCmenu4.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent e) {
							FoodDesc kfcDesc = new FoodDesc(kfc.getMenuName(4),kfc.getPrice(4),kfc.getMenuDesc(4),kfc.getBigPic(4),allOrder);
							FoodDesc.main(null);
						}
					});
				}
				
				JLabel kfcMenu4 = new JLabel(kfc.getMenuName(4));
				kfcMenu4.setFont(new Font("Calibri", Font.PLAIN, 22));
				kfcMenu4.setHorizontalAlignment(SwingConstants.CENTER);
				kfcMenu4.setBounds(0, 175, 300, 38);
				KFCmenu4.add(kfcMenu4);
				
				JLabel menuPic4 = new JLabel("");
				menuPic4.setIcon(kfc.getMenuPic(4));
				menuPic4.setBounds(0, 0, 300, 175);
				KFCmenu4.add(menuPic4);
				
				JLabel kfcMenu4Price = new JLabel("RM "+df.format(kfc.getPrice(4)));
				kfcMenu4Price.setHorizontalAlignment(SwingConstants.CENTER);
				kfcMenu4Price.setFont(new Font("Calibri", Font.PLAIN, 22));
				kfcMenu4Price.setBounds(0, 213, 300, 37);
				KFCmenu4.add(kfcMenu4Price);
				
				//Fifth menu of KFC
				//food description will show after clicked in a window if the data of food is present
				JPanel KFCmenu5 = new JPanel();
				KFCmenu5.setBounds(342, 300, 300, 250);
				KFC.add(KFCmenu5);
				KFCmenu5.setLayout(null);
				if (kfc.getSize() >= 5 && ! kfc.getMenuName(5).equals("")) {
					KFCmenu5.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent e) {
							FoodDesc kfcDesc = new FoodDesc(kfc.getMenuName(5),kfc.getPrice(5),kfc.getMenuDesc(5),kfc.getBigPic(5),allOrder);
							FoodDesc.main(null);
						}
					});
				}
				
				JLabel kfcMenu5 = new JLabel(kfc.getMenuName(5));
				kfcMenu5.setFont(new Font("Calibri", Font.PLAIN, 22));
				kfcMenu5.setHorizontalAlignment(SwingConstants.CENTER);
				kfcMenu5.setBounds(0, 175, 300, 38);
				KFCmenu5.add(kfcMenu5);
				
				JLabel menuPic5 = new JLabel("");
				menuPic5.setIcon(kfc.getMenuPic(5));
				menuPic5.setBounds(0, 0, 300, 175);
				KFCmenu5.add(menuPic5);
				
				JLabel kfcMenu5Price = new JLabel("RM "+df.format(kfc.getPrice(5)));
				kfcMenu5Price.setHorizontalAlignment(SwingConstants.CENTER);
				kfcMenu5Price.setFont(new Font("Calibri", Font.PLAIN, 22));
				kfcMenu5Price.setBounds(0, 213, 300, 37);
				KFCmenu5.add(kfcMenu5Price);
				
				//Sixth menu of KFC
				//food description will show after clicked in a window if the data of food is present
				JPanel KFCmenu6 = new JPanel();
				KFCmenu6.setBounds(663, 300, 300, 250);
				KFC.add(KFCmenu6);
				KFCmenu6.setLayout(null);
				if (kfc.getSize() >= 6 && ! kfc.getMenuName(6).equals("")) {
					KFCmenu6.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent e) {
							FoodDesc kfcDesc = new FoodDesc(kfc.getMenuName(6),kfc.getPrice(6),kfc.getMenuDesc(6),kfc.getBigPic(6),allOrder);
							FoodDesc.main(null);
						}
					});
				}
				
				JLabel kfcMenu6 = new JLabel(kfc.getMenuName(6));
				kfcMenu6.setFont(new Font("Calibri", Font.PLAIN, 22));
				kfcMenu6.setHorizontalAlignment(SwingConstants.CENTER);
				kfcMenu6.setBounds(0, 175, 300, 38);
				KFCmenu6.add(kfcMenu6);
				
				JLabel menuPic6 = new JLabel("");
				menuPic6.setIcon(kfc.getMenuPic(6));
				menuPic6.setBounds(0, 0, 300, 175);
				KFCmenu6.add(menuPic6);
				
				JLabel kfcMenu6Price = new JLabel("RM "+df.format(kfc.getPrice(6)));
				kfcMenu6Price.setHorizontalAlignment(SwingConstants.CENTER);
				kfcMenu6Price.setFont(new Font("Calibri", Font.PLAIN, 22));
				kfcMenu6Price.setBounds(0, 213, 300, 37);
				KFCmenu6.add(kfcMenu6Price);
		
		//Panel for tealive menu, all food of tealive will show at here
		//food description will show after clicked in a window if the data of food is present
		JPanel tealive = new JPanel();
		tealive.setBackground(new Color(0, 0, 139));
		tealive.setBounds(280, 113, 1000, 570);
		basePanel.add(tealive);
		tealive.setLayout(null);
		
		//Panel for first tealive's menu
		JPanel tlMenu1 = new JPanel();
		tlMenu1.setBounds(21, 25, 300, 250);
		tealive.add(tlMenu1);
		tlMenu1.setLayout(null);
		if (tea.getSize() >= 1 && ! tea.getMenuName(1).equals("")) {
			tlMenu1.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						FoodDesc teaDetails = new FoodDesc(tea.getMenuName(1), tea.getPrice(1), tea.getMenuDesc(1), tea.getBigPic(1),allOrder);
						teaDetails.main(null);
					}
				});
		}
		
		//Name for first tealive's menu
		JLabel ktlMenu1 = new JLabel(tea.getMenuName(1));
		ktlMenu1.setHorizontalAlignment(SwingConstants.CENTER);
		ktlMenu1.setFont(new Font("Calibri", Font.PLAIN, 22));
		ktlMenu1.setBounds(0, 175, 300, 38);
		tlMenu1.add(ktlMenu1);
		
		//Price for first tealive's menu
		JLabel tlMenu1Price = new JLabel("RM "+df.format(tea.getPrice(1)));
		tlMenu1Price.setHorizontalAlignment(SwingConstants.CENTER);
		tlMenu1Price.setFont(new Font("Calibri", Font.PLAIN, 22));
		tlMenu1Price.setBounds(0, 213, 300, 37);
		tlMenu1.add(tlMenu1Price);
		
		//Picture for first tealive;s menu
		JLabel tlMenuPic1 = new JLabel("");
		tlMenuPic1.setIcon(tea.getMenuPic(1));
		tlMenuPic1.setBounds(0, 0, 300, 175);
		tlMenu1.add(tlMenuPic1);
		
		//Second food for tealive
		JPanel tlMenu2 = new JPanel();
		tlMenu2.setBounds(342, 25, 300, 250);
		tealive.add(tlMenu2);
		tlMenu2.setLayout(null);
		if (tea.getSize() >= 2 && ! tea.getMenuName(2).equals("")) {
			tlMenu2.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					FoodDesc teaDetails = new FoodDesc(tea.getMenuName(2), tea.getPrice(2), tea.getMenuDesc(2), tea.getBigPic(2),allOrder);
					teaDetails.main(null);
				}
			});
		}
		
		JLabel ktlMenu2 = new JLabel(tea.getMenuName(2));
		ktlMenu2.setHorizontalAlignment(SwingConstants.CENTER);
		ktlMenu2.setFont(new Font("Calibri", Font.PLAIN, 22));
		ktlMenu2.setBounds(0, 175, 300, 38);
		tlMenu2.add(ktlMenu2);
		
		JLabel tlMenu2Price = new JLabel("RM "+df.format(tea.getPrice(2)));
		tlMenu2Price.setHorizontalAlignment(SwingConstants.CENTER);
		tlMenu2Price.setFont(new Font("Calibri", Font.PLAIN, 22));
		tlMenu2Price.setBounds(0, 213, 300, 37);
		tlMenu2.add(tlMenu2Price);
		
		JLabel tlMenuPic2 = new JLabel("");
		tlMenuPic2.setIcon(tea.getMenuPic(2));
		tlMenuPic2.setBounds(0, 0, 300, 175);
		tlMenu2.add(tlMenuPic2);
		
		//third food for tealive
		//food description will show after clicked in a window if the data of food is present
		JPanel tlMenu3 = new JPanel();
		tlMenu3.setBounds(663, 25, 300, 250);
		tealive.add(tlMenu3);
		tlMenu3.setLayout(null);
		if (tea.getSize() >= 3 && ! tea.getMenuName(3).equals("")) {
			tlMenu3.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					FoodDesc teaDetails = new FoodDesc(tea.getMenuName(3), tea.getPrice(3), tea.getMenuDesc(3), tea.getBigPic(3),allOrder);
					teaDetails.main(null);
				}
			});
		}
		
		JLabel ktlMenu3 = new JLabel(tea.getMenuName(3));
		ktlMenu3.setHorizontalAlignment(SwingConstants.CENTER);
		ktlMenu3.setFont(new Font("Calibri", Font.PLAIN, 22));
		ktlMenu3.setBounds(0, 175, 300, 38);
		tlMenu3.add(ktlMenu3);
		
		JLabel tlMenu3Price = new JLabel("RM "+df.format(tea.getPrice(3)));
		tlMenu3Price.setHorizontalAlignment(SwingConstants.CENTER);
		tlMenu3Price.setFont(new Font("Calibri", Font.PLAIN, 22));
		tlMenu3Price.setBounds(0, 213, 300, 37);
		tlMenu3.add(tlMenu3Price);
		
		JLabel tlMenuPic3 = new JLabel("");
		tlMenuPic3.setIcon(tea.getMenuPic(3));
		tlMenuPic3.setBounds(0, 0, 300, 175);
		tlMenu3.add(tlMenuPic3);
		
		//Fourth food of tealive
		//food description will show after clicked in a window if the data of food is present
		JPanel tlMenu4 = new JPanel();
		tlMenu4.setBounds(21, 300, 300, 250);
		tealive.add(tlMenu4);
		tlMenu4.setLayout(null);
		if (tea.getSize() >= 4 && ! tea.getMenuName(4).equals("")) {
			tlMenu4.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					FoodDesc teaDetails = new FoodDesc(tea.getMenuName(4), tea.getPrice(4), tea.getMenuDesc(4), tea.getBigPic(4),allOrder);
					teaDetails.main(null);
				}
			});
		}
		
		JLabel ktlMenu4 = new JLabel(tea.getMenuName(4));
		ktlMenu4.setHorizontalAlignment(SwingConstants.CENTER);
		ktlMenu4.setFont(new Font("Calibri", Font.PLAIN, 22));
		ktlMenu4.setBounds(0, 175, 300, 38);
		tlMenu4.add(ktlMenu4);
		
		JLabel tlMenu4Price = new JLabel("RM "+df.format(tea.getPrice(4)));
		tlMenu4Price.setHorizontalAlignment(SwingConstants.CENTER);
		tlMenu4Price.setFont(new Font("Calibri", Font.PLAIN, 22));
		tlMenu4Price.setBounds(0, 213, 300, 37);
		tlMenu4.add(tlMenu4Price);
		
		JLabel tlMenuPic4 = new JLabel("");
		tlMenuPic4.setIcon(tea.getMenuPic(4));
		tlMenuPic4.setBounds(0, 0, 300, 175);
		tlMenu4.add(tlMenuPic4);
		tealive.add(tlMenu4);
		
		//Fifth food of tealive
		//food description will show after clicked in a window if the data of food is present
		JPanel tlMenu5 = new JPanel();
		if (tea.getSize() >= 5 && ! tea.getMenuName(5).equals("")) {
			tlMenu5.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					FoodDesc teaDetails = new FoodDesc(tea.getMenuName(5), tea.getPrice(5), tea.getMenuDesc(5), tea.getBigPic(5),allOrder);
					teaDetails.main(null);
				}
			});
		}
		tlMenu5.setBounds(342, 300, 300, 250);
		tlMenu5.setLayout(null);
		tealive.add(tlMenu5);
				
		JLabel ktlMenu5 = new JLabel(tea.getMenuName(5));
		ktlMenu5.setHorizontalAlignment(SwingConstants.CENTER);
		ktlMenu5.setFont(new Font("Calibri", Font.PLAIN, 22));
		ktlMenu5.setBounds(0, 175, 300, 38);
		tlMenu5.add(ktlMenu5);
				
		JLabel tlMenu5Price = new JLabel("RM "+df.format(tea.getPrice(5)));
		tlMenu5Price.setHorizontalAlignment(SwingConstants.CENTER);
		tlMenu5Price.setFont(new Font("Calibri", Font.PLAIN, 22));
		tlMenu5Price.setBounds(0, 213, 300, 37);
		tlMenu5.add(tlMenu5Price);
				
		JLabel tlMenuPic5 = new JLabel("");
		tlMenuPic5.setIcon(tea.getMenuPic(5));
		tlMenuPic5.setBounds(0, 0, 300, 175);
		tlMenu5.add(tlMenuPic5);
		
		//Sixth food of tealive
		//food description will show after clicked in a window if the data of food is present
		JPanel tlMenu6 = new JPanel();
		tlMenu6.setBounds(663, 300, 300, 250);
		tealive.add(tlMenu6);
		tlMenu6.setLayout(null);
		if (tea.getSize() >= 6 && ! tea.getMenuName(6).equals("")) {
			tlMenu6.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					FoodDesc teaDetails = new FoodDesc(tea.getMenuName(6), tea.getPrice(6), tea.getMenuDesc(6), tea.getBigPic(6),allOrder);
					teaDetails.main(null);
				}
			});
		}
		
		JLabel ktlMenu6 = new JLabel(tea.getMenuName(6));
		ktlMenu6.setHorizontalAlignment(SwingConstants.CENTER);
		ktlMenu6.setFont(new Font("Calibri", Font.PLAIN, 22));
		ktlMenu6.setBounds(0, 175, 300, 38);
		tlMenu6.add(ktlMenu6);
		
		JLabel tlMenu6Price = new JLabel("RM "+df.format(tea.getPrice(6)));
		tlMenu6Price.setHorizontalAlignment(SwingConstants.CENTER);
		tlMenu6Price.setFont(new Font("Calibri", Font.PLAIN, 22));
		tlMenu6Price.setBounds(0, 213, 300, 37);
		tlMenu6.add(tlMenu6Price);
		
		JLabel tlMenuPic6 = new JLabel("");
		tlMenuPic6.setIcon(tea.getMenuPic(6));
		tlMenuPic6.setBounds(0, 0, 300, 175);
		tlMenu6.add(tlMenuPic6);

		
		//Panel for subaidah, all food of subaidah will put at here
		JPanel subaidah = new JPanel();
		subaidah.setBackground(new Color(60, 179, 113));
		subaidah.setSize(986, 570);
		subaidah.setLocation(280, 113);
		basePanel.add(subaidah);
		subaidah.setLayout(null);
		
		//Panel of the first food of subaidah
		//food description will show after clicked in a window if the data of food is present
		JPanel sbdMenu_1 = new JPanel();
		if (sbd.getSize() >= 1 && ! sbd.getMenuName(1).equals("")) {
			sbdMenu_1.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					FoodDesc sbdDetails = new FoodDesc(sbd.getMenuName(1), sbd.getPrice(1), sbd.getMenuDesc(1), sbd.getBigPic(1),allOrder);
					sbdDetails.main(null);
				}
			});
		}
		sbdMenu_1.setLayout(null);
		sbdMenu_1.setBounds(21, 25, 300, 250);
		subaidah.add(sbdMenu_1);
		
		//Name of the first subaidah food
		JLabel sbdMenu1 = new JLabel(sbd.getMenuName(1));
		sbdMenu1.setHorizontalAlignment(SwingConstants.CENTER);
		sbdMenu1.setFont(new Font("Calibri", Font.PLAIN, 22));
		sbdMenu1.setBounds(0, 175, 300, 38);
		sbdMenu_1.add(sbdMenu1);
		
		//Price of the first subaidah food
		JLabel sbdMenu1Price = new JLabel("RM "+df.format(sbd.getPrice(1)));
		sbdMenu1Price.setHorizontalAlignment(SwingConstants.CENTER);
		sbdMenu1Price.setFont(new Font("Calibri", Font.PLAIN, 22));
		sbdMenu1Price.setBounds(0, 213, 300, 37);
		sbdMenu_1.add(sbdMenu1Price);
		
		//Picture of the first subaidah food
		JLabel sbdMenuPic1 = new JLabel("");
		sbdMenuPic1.setIcon(sbd.getMenuPic(1));
		sbdMenuPic1.setBounds(0, 0, 300, 175);
		sbdMenu_1.add(sbdMenuPic1);
		
		//Second of the subaidah food
		//food description will show after clicked in a window if the data of food is present
		JPanel sbdMenu_2 = new JPanel();
		if (sbd.getSize() >= 2 && ! sbd.getMenuName(2).equals("")) {
			sbdMenu_2.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					FoodDesc sbdDetails = new FoodDesc(sbd.getMenuName(2), sbd.getPrice(2), sbd.getMenuDesc(2), sbd.getBigPic(2),allOrder);
					sbdDetails.main(null);
				}
			});
		}
		sbdMenu_2.setLayout(null);
		sbdMenu_2.setBounds(343, 25, 300, 250);
		subaidah.add(sbdMenu_2);
		
		JLabel sbdMenu2 = new JLabel(sbd.getMenuName(2));
		sbdMenu2.setHorizontalAlignment(SwingConstants.CENTER);
		sbdMenu2.setFont(new Font("Calibri", Font.PLAIN, 22));
		sbdMenu2.setBounds(0, 175, 300, 38);
		sbdMenu_2.add(sbdMenu2);
		
		JLabel sbdMenu2Price = new JLabel("RM "+df.format(sbd.getPrice(2)));
		sbdMenu2Price.setHorizontalAlignment(SwingConstants.CENTER);
		sbdMenu2Price.setFont(new Font("Calibri", Font.PLAIN, 22));
		sbdMenu2Price.setBounds(0, 213, 300, 37);
		sbdMenu_2.add(sbdMenu2Price);
		
		JLabel sbdMenuPic2 = new JLabel("");
		sbdMenuPic2.setIcon(sbd.getMenuPic(2));
		sbdMenuPic2.setBounds(0, 0, 300, 175);
		sbdMenu_2.add(sbdMenuPic2);
		
		//Third food of subaidah
		//food description will show after clicked in a window if the data of food is present
		JPanel sbdMenu_3 = new JPanel();
		if (sbd.getSize() >= 3 && ! sbd.getMenuName(3).equals("")) {
			sbdMenu_3.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					FoodDesc sbdDetails = new FoodDesc(sbd.getMenuName(3), sbd.getPrice(3), sbd.getMenuDesc(3), sbd.getBigPic(3),allOrder);
					sbdDetails.main(null);
				}
			});
		}
		sbdMenu_3.setLayout(null);
		sbdMenu_3.setBounds(21, 298, 300, 250);
		subaidah.add(sbdMenu_3);
		
		JLabel sbdMenu3 = new JLabel(sbd.getMenuName(3));
		sbdMenu3.setHorizontalAlignment(SwingConstants.CENTER);
		sbdMenu3.setFont(new Font("Calibri", Font.PLAIN, 22));
		sbdMenu3.setBounds(0, 175, 300, 38);
		sbdMenu_3.add(sbdMenu3);
		
		JLabel sbdMenu3Price = new JLabel("RM "+df.format(sbd.getPrice(3)));
		sbdMenu3Price.setHorizontalAlignment(SwingConstants.CENTER);
		sbdMenu3Price.setFont(new Font("Calibri", Font.PLAIN, 22));
		sbdMenu3Price.setBounds(0, 213, 300, 37);
		sbdMenu_3.add(sbdMenu3Price);
		
		JLabel sbdMenuPic3 = new JLabel("");
		sbdMenuPic3.setIcon(sbd.getMenuPic(3));
		sbdMenuPic3.setBounds(0, 0, 300, 175);
		sbdMenu_3.add(sbdMenuPic3);
		
		//Fourth food of subaidah
		//food description will show after clicked in a window if the data of food is present
		JPanel sbdMenu_4 = new JPanel();
		if (sbd.getSize() >= 4 && ! sbd.getMenuName(4).equals("")) {
			sbdMenu_4.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					FoodDesc sbdDetails = new FoodDesc(sbd.getMenuName(4), sbd.getPrice(4), sbd.getMenuDesc(4), sbd.getBigPic(4),allOrder);
					sbdDetails.main(null);
				}
			});
		}
		sbdMenu_4.setLayout(null);
		sbdMenu_4.setBounds(343, 298, 300, 250);
		subaidah.add(sbdMenu_4);
		
		JLabel sbdMenu4 = new JLabel(sbd.getMenuName(4));
		sbdMenu4.setHorizontalAlignment(SwingConstants.CENTER);
		sbdMenu4.setFont(new Font("Calibri", Font.PLAIN, 22));
		sbdMenu4.setBounds(0, 175, 300, 38);
		sbdMenu_4.add(sbdMenu4);
		
		JLabel sbdMenu4Price = new JLabel("RM "+df.format(sbd.getPrice(4)));
		sbdMenu4Price.setHorizontalAlignment(SwingConstants.CENTER);
		sbdMenu4Price.setFont(new Font("Calibri", Font.PLAIN, 22));
		sbdMenu4Price.setBounds(0, 213, 300, 37);
		sbdMenu_4.add(sbdMenu4Price);
		
		JLabel sbdMenuPic4 = new JLabel("");
		sbdMenuPic4.setIcon(sbd.getMenuPic(4));
		sbdMenuPic4.setBounds(0, 0, 300, 175);
		sbdMenu_4.add(sbdMenuPic4);
		
		//Fifth food of subaidah
		//food description will show after clicked in a window if the data of food is present
		JPanel sbdMenu_5 = new JPanel();
		if (sbd.getSize() >= 5 && ! sbd.getMenuName(5).equals("")) {
			sbdMenu_5.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					FoodDesc sbdDetails = new FoodDesc(sbd.getMenuName(5), sbd.getPrice(5), sbd.getMenuDesc(5), sbd.getBigPic(5),allOrder);
					sbdDetails.main(null);
				}
			});
		}
		sbdMenu_5.setLayout(null);
		sbdMenu_5.setBounds(664, 25, 300, 250);
		subaidah.add(sbdMenu_5);
		
		JLabel sbdMenu5 = new JLabel(sbd.getMenuName(5));
		sbdMenu5.setHorizontalAlignment(SwingConstants.CENTER);
		sbdMenu5.setFont(new Font("Calibri", Font.PLAIN, 22));
		sbdMenu5.setBounds(0, 175, 300, 38);
		sbdMenu_5.add(sbdMenu5);
		
		JLabel sbdMenu5Price = new JLabel("RM "+df.format(sbd.getPrice(5)));
		sbdMenu5Price.setHorizontalAlignment(SwingConstants.CENTER);
		sbdMenu5Price.setFont(new Font("Calibri", Font.PLAIN, 22));
		sbdMenu5Price.setBounds(0, 213, 300, 37);
		sbdMenu_5.add(sbdMenu5Price);
		
		JLabel sbdMenuPic5 = new JLabel("");
		sbdMenuPic5.setIcon(sbd.getMenuPic(5));
		sbdMenuPic5.setBounds(0, 0, 300, 175);
		sbdMenu_5.add(sbdMenuPic5);
		
		//Sixth food of subaidah
		//food description will show after clicked in a window if the data of food is present
		JPanel sbdMenu_6 = new JPanel();
		if (sbd.getSize() >= 6 && ! sbd.getMenuName(6).equals("")) {
			sbdMenu_6.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					FoodDesc sbdDetails = new FoodDesc(sbd.getMenuName(6), sbd.getPrice(6), sbd.getMenuDesc(6), sbd.getBigPic(6),allOrder);
					sbdDetails.main(null);
				}
			});
		}
		sbdMenu_6.setLayout(null);
		sbdMenu_6.setBounds(663, 300, 300, 250);
		subaidah.add(sbdMenu_6);
		
		JLabel sbdMenu6 = new JLabel(sbd.getMenuName(6));
		sbdMenu6.setHorizontalAlignment(SwingConstants.CENTER);
		sbdMenu6.setFont(new Font("Calibri", Font.PLAIN, 22));
		sbdMenu6.setBounds(0, 175, 300, 38);
		sbdMenu_6.add(sbdMenu6);
		
		JLabel sbdMenu6Price = new JLabel("RM "+df.format(sbd.getPrice(6)));
		sbdMenu6Price.setHorizontalAlignment(SwingConstants.CENTER);
		sbdMenu6Price.setFont(new Font("Calibri", Font.PLAIN, 22));
		sbdMenu6Price.setBounds(0, 213, 300, 37);
		sbdMenu_6.add(sbdMenu6Price);
		
		JLabel sbdMenuPic6 = new JLabel(sbd.getBigPic(6));
		sbdMenuPic6.setBounds(0, 0, 300, 175);
		sbdMenu_6.add(sbdMenuPic6);;
		
		//Panel of the side navigation bar
		JPanel sideNavigationBar = new JPanel();
		sideNavigationBar.setBackground(Color.WHITE);
		sideNavigationBar.setBorder(new LineBorder(new Color(0, 0, 0)));
		sideNavigationBar.setBounds(0, 113, 280, 570);
		basePanel.add(sideNavigationBar);
		sideNavigationBar.setLayout(null);
						
		//kfc button at the side navigation bar
		JLabel KFC_label = new JLabel("KFC");
		KFC_label.setForeground(Color.WHITE);
		KFC_label.setIcon(new ImageIcon(MainPages.class.getResource("/system/resources/kfc resize.jpg")));
		KFC_label.setFont(new Font("Segoe UI Semibold", Font.BOLD, 30));
		KFC_label.setHorizontalAlignment(SwingConstants.CENTER);
		KFC_label.setBounds(20, 20, 240, 95);
		KFC_label.setHorizontalTextPosition(JLabel.CENTER);
		KFC_label.setVerticalTextPosition(JLabel.CENTER);
		sideNavigationBar.add(KFC_label);
		KFC_label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				subaidah.setVisible(false);
				tealive.setVisible(false);
				KFC.setVisible(true);
			}
		});
						
		//tealive button at the side navigation bar
		JLabel tealive_label = new JLabel("");
		tealive_label.setIcon(new ImageIcon(MainPages.class.getResource("/system/resources/tealive resize.jpg")));
		tealive_label.setBounds(20, 135, 240, 95);
		sideNavigationBar.add(tealive_label);
		tealive_label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				subaidah.setVisible(false);
				tealive.setVisible(true);
				KFC.setVisible(false);
			}
		});
						
		//subaidah button at the side navigation bar
		JLabel subaidah_label = new JLabel("");
		subaidah_label.setIcon(new ImageIcon(MainPages.class.getResource("/system/resources/subaidah resize.jpg")));
		subaidah_label.setBounds(20, 250, 240, 95);
		sideNavigationBar.add(subaidah_label);
		subaidah_label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				subaidah.setVisible(true);
				tealive.setVisible(false);
				KFC.setVisible(false);
			}
		});
	}
}
