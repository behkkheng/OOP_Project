package system;

import java.awt.EventQueue;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.border.MatteBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;

public class MainPages {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
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

	/**
	 * Create the application.
	 */
	public MainPages() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Foor ordering system");
		frame.setResizable(false);
		frame.setBounds(0, 0, 1280, 720);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ImageIcon imgIcon = new ImageIcon(getClass().getResource("./KTF_logo.jpg"));
		frame.setIconImage(imgIcon.getImage());
		
		JPanel basePanel = new JPanel();
		basePanel.setBounds(0, 0, 1280, 720);
		frame.getContentPane().add(basePanel);
		basePanel.setLayout(null);
		
		JPanel KFC = new JPanel();
		KFC.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		KFC.setBackground(new Color(255, 0, 0));
		KFC.setForeground(new Color(255, 255, 255));
		KFC.setBounds(280, 113, 986, 570);
		basePanel.add(KFC);
		KFC.setLayout(null);
		
		JPanel KFCmenu1 = new JPanel();
		KFCmenu1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				FoodDesc kfcDesc = new FoodDesc();
			}
		});
		KFCmenu1.setBounds(21, 25, 300, 250);
		KFC.add(KFCmenu1);
		KFCmenu1.setLayout(null);

		KFC kfc = new KFC();
		JLabel kfcMenu1 = new JLabel(kfc.getMenuName(1));
		kfcMenu1.setFont(new Font("Calibri", Font.PLAIN, 22));
		kfcMenu1.setHorizontalAlignment(SwingConstants.CENTER);
		kfcMenu1.setBounds(0, 175, 300, 38);
		KFCmenu1.add(kfcMenu1);
		
		JLabel menuPic1 = new JLabel("");
		menuPic1.setIcon(new ImageIcon(MainPages.class.getResource("/system/resources/kfc1 resize.jpg")));
		menuPic1.setBounds(0, 0, 300, 175);
		KFCmenu1.add(menuPic1);
		
		JLabel kfcMenu1Price = new JLabel(kfc.getPrice(1));
		kfcMenu1Price.setHorizontalAlignment(SwingConstants.CENTER);
		kfcMenu1Price.setFont(new Font("Calibri", Font.PLAIN, 22));
		kfcMenu1Price.setBounds(0, 213, 300, 37);
		KFCmenu1.add(kfcMenu1Price);
		
		JPanel KFCmenu2 = new JPanel();
		KFCmenu2.setBounds(21, 300, 300, 250);
		KFC.add(KFCmenu2);
		KFCmenu2.setLayout(null);
		
		JLabel kfcMenu2 = new JLabel("Coleslaw");
		kfcMenu2.setHorizontalAlignment(SwingConstants.CENTER);
		kfcMenu2.setFont(new Font("Calibri", Font.PLAIN, 22));
		kfcMenu2.setBounds(0, 175, 300, 38);
		KFCmenu2.add(kfcMenu2);
		
		JLabel menuPic2 = new JLabel("");
		menuPic2.setIcon(new ImageIcon(MainPages.class.getResource("/system/resources/kfc4 resize.jpg")));
		menuPic2.setBounds(0, 0, 300, 175);
		KFCmenu2.add(menuPic2);
		
		JLabel kfcMenu2Price = new JLabel("RM 7.99");
		kfcMenu2Price.setHorizontalAlignment(SwingConstants.CENTER);
		kfcMenu2Price.setFont(new Font("Calibri", Font.PLAIN, 22));
		kfcMenu2Price.setBounds(0, 213, 300, 37);
		KFCmenu2.add(kfcMenu2Price);
		
		JPanel KFCmenu3 = new JPanel();
		KFCmenu3.setBounds(342, 25, 300, 250);
		KFC.add(KFCmenu3);
		KFCmenu3.setLayout(null);
		
		JLabel kfcMenu3 = new JLabel("3-pc Chicken");
		kfcMenu3.setFont(new Font("Calibri", Font.PLAIN, 22));
		kfcMenu3.setHorizontalAlignment(SwingConstants.CENTER);
		kfcMenu3.setBounds(0, 175, 300, 38);
		KFCmenu3.add(kfcMenu3);
		
		JLabel menuPic3 = new JLabel("");
		menuPic3.setIcon(new ImageIcon(MainPages.class.getResource("/system/resources/kfc2 resize.jpg")));
		menuPic3.setBounds(0, 0, 300, 175);
		KFCmenu3.add(menuPic3);
		
		JLabel kfcMenu3Price = new JLabel("RM 17.49");
		kfcMenu3Price.setHorizontalAlignment(SwingConstants.CENTER);
		kfcMenu3Price.setFont(new Font("Calibri", Font.PLAIN, 22));
		kfcMenu3Price.setBounds(0, 213, 300, 37);
		KFCmenu3.add(kfcMenu3Price);
		
		JPanel KFCmenu4 = new JPanel();
		KFCmenu4.setBounds(342, 300, 300, 250);
		KFC.add(KFCmenu4);
		KFCmenu4.setLayout(null);
		
		JLabel kfcMenu4 = new JLabel("Party box");
		kfcMenu4.setFont(new Font("Calibri", Font.PLAIN, 22));
		kfcMenu4.setHorizontalAlignment(SwingConstants.CENTER);
		kfcMenu4.setBounds(0, 175, 300, 38);
		KFCmenu4.add(kfcMenu4);
		
		JLabel menuPic4 = new JLabel("");
		menuPic4.setIcon(new ImageIcon(MainPages.class.getResource("/system/resources/kfc5 resize.jpg")));
		menuPic4.setBounds(0, 0, 300, 175);
		KFCmenu4.add(menuPic4);
		
		JLabel kfcMenu4Price = new JLabel("RM 36.99");
		kfcMenu4Price.setHorizontalAlignment(SwingConstants.CENTER);
		kfcMenu4Price.setFont(new Font("Calibri", Font.PLAIN, 22));
		kfcMenu4Price.setBounds(0, 213, 300, 37);
		KFCmenu4.add(kfcMenu4Price);
		
		JPanel KFCmenu5 = new JPanel();
		KFCmenu5.setBounds(663, 25, 300, 250);
		KFC.add(KFCmenu5);
		KFCmenu5.setLayout(null);
		
		JLabel kfcMenu5 = new JLabel("9-pc Nuggets");
		kfcMenu5.setFont(new Font("Calibri", Font.PLAIN, 22));
		kfcMenu5.setHorizontalAlignment(SwingConstants.CENTER);
		kfcMenu5.setBounds(0, 175, 300, 38);
		KFCmenu5.add(kfcMenu5);
		
		JLabel menuPic5 = new JLabel("");
		menuPic5.setIcon(new ImageIcon(MainPages.class.getResource("/system/resources/kfc3 resize.jpg")));
		menuPic5.setBounds(0, 0, 300, 175);
		KFCmenu5.add(menuPic5);
		
		JLabel kfcMenu5Price = new JLabel("RM 13.99");
		kfcMenu5Price.setHorizontalAlignment(SwingConstants.CENTER);
		kfcMenu5Price.setFont(new Font("Calibri", Font.PLAIN, 22));
		kfcMenu5Price.setBounds(0, 213, 300, 37);
		KFCmenu5.add(kfcMenu5Price);
		
		JPanel KFCmenu6 = new JPanel();
		KFCmenu6.setBounds(663, 300, 300, 250);
		KFC.add(KFCmenu6);
		KFCmenu6.setLayout(null);
		
		JLabel kfcMenu6 = new JLabel("Nasi Lemak");
		kfcMenu6.setFont(new Font("Calibri", Font.PLAIN, 22));
		kfcMenu6.setHorizontalAlignment(SwingConstants.CENTER);
		kfcMenu6.setBounds(0, 175, 300, 38);
		KFCmenu6.add(kfcMenu6);
		
		JLabel menuPic6 = new JLabel("");
		menuPic6.setIcon(new ImageIcon(MainPages.class.getResource("/system/resources/kfc6 resize.jpg")));
		menuPic6.setBounds(0, 0, 300, 175);
		KFCmenu6.add(menuPic6);
		
		JLabel kfcMenu6Price = new JLabel("RM 13.54");
		kfcMenu6Price.setHorizontalAlignment(SwingConstants.CENTER);
		kfcMenu6Price.setFont(new Font("Calibri", Font.PLAIN, 22));
		kfcMenu6Price.setBounds(0, 213, 300, 37);
		KFCmenu6.add(kfcMenu6Price);
		
		JPanel sideNavigationBar = new JPanel();
		sideNavigationBar.setBackground(Color.WHITE);
		sideNavigationBar.setBorder(new LineBorder(new Color(0, 0, 0)));
		sideNavigationBar.setBounds(0, 113, 280, 570);
		basePanel.add(sideNavigationBar);
		sideNavigationBar.setLayout(null);
		
		JLabel KFC_label = new JLabel("KFC");
		KFC_label.setForeground(Color.WHITE);
		KFC_label.setIcon(new ImageIcon(MainPages.class.getResource("/system/resources/kfc resize.jpg")));
		KFC_label.setFont(new Font("Segoe UI Semibold", Font.BOLD, 30));
		KFC_label.setHorizontalAlignment(SwingConstants.CENTER);
		KFC_label.setBounds(20, 20, 240, 95);
		KFC_label.setHorizontalTextPosition(JLabel.CENTER);
		KFC_label.setVerticalTextPosition(JLabel.CENTER);
		sideNavigationBar.add(KFC_label);
		
		JLabel tealive_label = new JLabel("");
		tealive_label.setIcon(new ImageIcon(MainPages.class.getResource("/system/resources/tealive resize.jpg")));
		tealive_label.setBounds(20, 135, 240, 95);
		sideNavigationBar.add(tealive_label);
		
		JLabel subaidah_label = new JLabel("");
		subaidah_label.setIcon(new ImageIcon(MainPages.class.getResource("/system/resources/subaidah resize.jpg")));
		subaidah_label.setBounds(20, 250, 240, 95);
		sideNavigationBar.add(subaidah_label);
		
		JPanel tealive = new JPanel();
		tealive.setBackground(new Color(0, 0, 139));
		tealive.setBounds(280, 113, 1000, 570);
		basePanel.add(tealive);
		tealive.setLayout(null);
		
		JPanel tlMenu1 = new JPanel();
		tlMenu1.setBounds(21, 25, 300, 250);
		tealive.add(tlMenu1);
		tlMenu1.setLayout(null);
		
		JLabel ktlMenu1 = new JLabel("Bang Bang Milk Tea");
		ktlMenu1.setHorizontalAlignment(SwingConstants.CENTER);
		ktlMenu1.setFont(new Font("Calibri", Font.PLAIN, 22));
		ktlMenu1.setBounds(0, 175, 300, 38);
		tlMenu1.add(ktlMenu1);
		
		JLabel tlMenu1Price = new JLabel("RM 7.40");
		tlMenu1Price.setHorizontalAlignment(SwingConstants.CENTER);
		tlMenu1Price.setFont(new Font("Calibri", Font.PLAIN, 22));
		tlMenu1Price.setBounds(0, 213, 300, 37);
		tlMenu1.add(tlMenu1Price);
		
		JLabel tlMenuPic1 = new JLabel("");
		tlMenuPic1.setIcon(new ImageIcon(MainPages.class.getResource("/system/resources/tl1 resize.jpg")));
		tlMenuPic1.setBounds(0, 0, 300, 175);
		tlMenu1.add(tlMenuPic1);
		
		JPanel tlMenu2 = new JPanel();
		tlMenu2.setBounds(342, 25, 300, 250);
		tealive.add(tlMenu2);
		tlMenu2.setLayout(null);
		
		JLabel ktlMenu2 = new JLabel("Signature Brown Sugar");
		ktlMenu2.setHorizontalAlignment(SwingConstants.CENTER);
		ktlMenu2.setFont(new Font("Calibri", Font.PLAIN, 22));
		ktlMenu2.setBounds(0, 175, 300, 38);
		tlMenu2.add(ktlMenu2);
		
		JLabel tlMenu2Price = new JLabel("RM 7.40");
		tlMenu2Price.setHorizontalAlignment(SwingConstants.CENTER);
		tlMenu2Price.setFont(new Font("Calibri", Font.PLAIN, 22));
		tlMenu2Price.setBounds(0, 213, 300, 37);
		tlMenu2.add(tlMenu2Price);
		
		JLabel tlMenuPic2 = new JLabel("");
		tlMenuPic2.setIcon(new ImageIcon(MainPages.class.getResource("/system/resources/tl2 resize.jpg")));
		tlMenuPic2.setBounds(0, 0, 300, 175);
		tlMenu2.add(tlMenuPic2);
		
		JPanel tlMenu3 = new JPanel();
		tlMenu3.setBounds(663, 25, 300, 250);
		tealive.add(tlMenu3);
		tlMenu3.setLayout(null);
		
		JLabel ktlMenu3 = new JLabel("MAMEE x tealive");
		ktlMenu3.setHorizontalAlignment(SwingConstants.CENTER);
		ktlMenu3.setFont(new Font("Calibri", Font.PLAIN, 22));
		ktlMenu3.setBounds(0, 175, 300, 38);
		tlMenu3.add(ktlMenu3);
		
		JLabel tlMenu3Price = new JLabel("RM 15.50");
		tlMenu3Price.setHorizontalAlignment(SwingConstants.CENTER);
		tlMenu3Price.setFont(new Font("Calibri", Font.PLAIN, 22));
		tlMenu3Price.setBounds(0, 213, 300, 37);
		tlMenu3.add(tlMenu3Price);
		
		JLabel tlMenuPic3 = new JLabel("");
		tlMenuPic3.setIcon(new ImageIcon(MainPages.class.getResource("/system/resources/tl3 resize.jpg")));
		tlMenuPic3.setBounds(0, 0, 300, 175);
		tlMenu3.add(tlMenuPic3);
		
		JPanel tlMenu4 = new JPanel();
		tlMenu4.setBounds(21, 300, 300, 250);
		tealive.add(tlMenu4);
		tlMenu4.setLayout(null);
		
		JLabel ktlMenu14 = new JLabel("Pop Pop Pearls");
		ktlMenu14.setHorizontalAlignment(SwingConstants.CENTER);
		ktlMenu14.setFont(new Font("Calibri", Font.PLAIN, 22));
		ktlMenu14.setBounds(0, 175, 300, 38);
		tlMenu4.add(ktlMenu14);
		
		JLabel tlMenu4Price = new JLabel("RM 10.99");
		tlMenu4Price.setHorizontalAlignment(SwingConstants.CENTER);
		tlMenu4Price.setFont(new Font("Calibri", Font.PLAIN, 22));
		tlMenu4Price.setBounds(0, 213, 300, 37);
		tlMenu4.add(tlMenu4Price);
		
		JLabel tlMenuPic4 = new JLabel("");
		tlMenuPic4.setIcon(new ImageIcon(MainPages.class.getResource("/system/resources/tl4 resize.jpg")));
		tlMenuPic4.setBounds(0, 0, 300, 175);
		tlMenu4.add(tlMenuPic4);
		
		JPanel topNavigationBar = new JPanel();
		topNavigationBar.setBounds(0, 0, 1266, 113);
		basePanel.add(topNavigationBar);
		topNavigationBar.setLayout(null);
		
		JLabel logo = new JLabel("");
		logo.setIcon(new ImageIcon(MainPages.class.getResource("/system/resources/KTF_resize.jpg")));
		logo.setBounds(93, 10, 100, 90);
		topNavigationBar.add(logo);
		
		JLabel systemName = new JLabel("Tun Fatimah Residential College Food Ordering System");
		systemName.setForeground(new Color(0, 0, 0));
		systemName.setFont(new Font("Gill Sans MT", Font.BOLD, 34));
		systemName.setBounds(203, 28, 905, 51);
		topNavigationBar.add(systemName);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBackground(Color.GRAY);
		lblNewLabel.setBounds(0, 0, 1266, 113);
		topNavigationBar.add(lblNewLabel);
		
		JButton foodCart = new JButton("");
		foodCart.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				FoodCart foodCart = new FoodCart();
				foodCart.main(null);
			}
		});
		foodCart.setIcon(new ImageIcon(MainPages.class.getResource("/system/resources/food cart resize.png")));
		foodCart.setBounds(1166, 10, 90, 90);
		topNavigationBar.add(foodCart);
		
		JPanel subaidah = new JPanel();
		subaidah.setBackground(new Color(60, 179, 113));
		subaidah.setSize(986, 570);
		subaidah.setLocation(280, 113);
		basePanel.add(subaidah);
		subaidah.setLayout(null);
		
		JPanel sbdMenu_1 = new JPanel();
		sbdMenu_1.setLayout(null);
		sbdMenu_1.setBounds(21, 25, 300, 250);
		subaidah.add(sbdMenu_1);
		
		JLabel sbdMenu1 = new JLabel("Nasi Lemak Daun Pisang");
		sbdMenu1.setHorizontalAlignment(SwingConstants.CENTER);
		sbdMenu1.setFont(new Font("Calibri", Font.PLAIN, 22));
		sbdMenu1.setBounds(0, 175, 300, 38);
		sbdMenu_1.add(sbdMenu1);
		
		JLabel sbdMenu1Price = new JLabel("RM 12.40");
		sbdMenu1Price.setHorizontalAlignment(SwingConstants.CENTER);
		sbdMenu1Price.setFont(new Font("Calibri", Font.PLAIN, 22));
		sbdMenu1Price.setBounds(0, 213, 300, 37);
		sbdMenu_1.add(sbdMenu1Price);
		
		JLabel sbdMenuPic1 = new JLabel("");
		sbdMenuPic1.setIcon(new ImageIcon(MainPages.class.getResource("/system/resources/sbd1 resize.jpg")));
		sbdMenuPic1.setBounds(0, 0, 300, 175);
		sbdMenu_1.add(sbdMenuPic1);
		
		JPanel sbdMenu_2 = new JPanel();
		sbdMenu_2.setLayout(null);
		sbdMenu_2.setBounds(343, 25, 300, 250);
		subaidah.add(sbdMenu_2);
		
		JLabel sbdMenu2 = new JLabel("Satay");
		sbdMenu2.setHorizontalAlignment(SwingConstants.CENTER);
		sbdMenu2.setFont(new Font("Calibri", Font.PLAIN, 22));
		sbdMenu2.setBounds(0, 175, 300, 38);
		sbdMenu_2.add(sbdMenu2);
		
		JLabel sbdMenu2Price = new JLabel("RM 1.00");
		sbdMenu2Price.setHorizontalAlignment(SwingConstants.CENTER);
		sbdMenu2Price.setFont(new Font("Calibri", Font.PLAIN, 22));
		sbdMenu2Price.setBounds(0, 213, 300, 37);
		sbdMenu_2.add(sbdMenu2Price);
		
		JLabel sbdMenuPic2 = new JLabel("");
		sbdMenuPic2.setIcon(new ImageIcon(MainPages.class.getResource("/system/resources/sbd2 resize.jpg")));
		sbdMenuPic2.setBounds(0, 0, 300, 175);
		sbdMenu_2.add(sbdMenuPic2);
		
		JPanel sbdMenu_3 = new JPanel();
		sbdMenu_3.setLayout(null);
		sbdMenu_3.setBounds(21, 298, 300, 250);
		subaidah.add(sbdMenu_3);
		
		JLabel sbdMenu3 = new JLabel("Roti Canai");
		sbdMenu3.setHorizontalAlignment(SwingConstants.CENTER);
		sbdMenu3.setFont(new Font("Calibri", Font.PLAIN, 22));
		sbdMenu3.setBounds(0, 175, 300, 38);
		sbdMenu_3.add(sbdMenu3);
		
		JLabel sbdMenu3Price = new JLabel("RM 1.00");
		sbdMenu3Price.setHorizontalAlignment(SwingConstants.CENTER);
		sbdMenu3Price.setFont(new Font("Calibri", Font.PLAIN, 22));
		sbdMenu3Price.setBounds(0, 213, 300, 37);
		sbdMenu_3.add(sbdMenu3Price);
		
		JLabel sbdMenuPic3 = new JLabel("");
		sbdMenuPic3.setIcon(new ImageIcon(MainPages.class.getResource("/system/resources/sbd4 resize.jpg")));
		sbdMenuPic3.setBounds(0, 0, 300, 175);
		sbdMenu_3.add(sbdMenuPic3);
		
		JPanel sbdMenu_4 = new JPanel();
		sbdMenu_4.setLayout(null);
		sbdMenu_4.setBounds(343, 298, 300, 250);
		subaidah.add(sbdMenu_4);
		
		JLabel sbdMenu4 = new JLabel("Teh Tarik");
		sbdMenu4.setHorizontalAlignment(SwingConstants.CENTER);
		sbdMenu4.setFont(new Font("Calibri", Font.PLAIN, 22));
		sbdMenu4.setBounds(0, 175, 300, 38);
		sbdMenu_4.add(sbdMenu4);
		
		JLabel sbdMenu4Price = new JLabel("RM 3.00");
		sbdMenu4Price.setHorizontalAlignment(SwingConstants.CENTER);
		sbdMenu4Price.setFont(new Font("Calibri", Font.PLAIN, 22));
		sbdMenu4Price.setBounds(0, 213, 300, 37);
		sbdMenu_4.add(sbdMenu4Price);
		
		JLabel sbdMenuPic4 = new JLabel("");
		sbdMenuPic4.setIcon(new ImageIcon(MainPages.class.getResource("/system/resources/sbd5 resize.jpg")));
		sbdMenuPic4.setBounds(0, 0, 300, 175);
		sbdMenu_4.add(sbdMenuPic4);
		
		JPanel sbdMenu_5 = new JPanel();
		sbdMenu_5.setLayout(null);
		sbdMenu_5.setBounds(664, 25, 300, 250);
		subaidah.add(sbdMenu_5);
		
		JLabel sbdMenu5 = new JLabel("Mee Rebus");
		sbdMenu5.setHorizontalAlignment(SwingConstants.CENTER);
		sbdMenu5.setFont(new Font("Calibri", Font.PLAIN, 22));
		sbdMenu5.setBounds(0, 175, 300, 38);
		sbdMenu_5.add(sbdMenu5);
		
		JLabel sbdMenu5Price = new JLabel("RM 8.30");
		sbdMenu5Price.setHorizontalAlignment(SwingConstants.CENTER);
		sbdMenu5Price.setFont(new Font("Calibri", Font.PLAIN, 22));
		sbdMenu5Price.setBounds(0, 213, 300, 37);
		sbdMenu_5.add(sbdMenu5Price);
		
		JLabel sbdMenuPic5 = new JLabel("");
		sbdMenuPic5.setIcon(new ImageIcon(MainPages.class.getResource("/system/resources/sbd3 resize.jpg")));
		sbdMenuPic5.setBounds(0, 0, 300, 175);
		sbdMenu_5.add(sbdMenuPic5);;
		
		//when side navigation bar is clicked
		KFC_label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				subaidah.setVisible(false);
				tealive.setVisible(false);
				KFC.setVisible(true);
			}
		});
		
		tealive_label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				subaidah.setVisible(false);
				tealive.setVisible(true);
				KFC.setVisible(false);
			}
		});
		
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
