package system;

import javax.swing.*;
import java.util.ArrayList;

public class Tealive {
    private ArrayList<String> menuName;
    private ArrayList<String> menuDesc;
    private ArrayList<Double> price;
    private ArrayList<ImageIcon> menuPic;
    private ArrayList<ImageIcon> bigPic;

    Tealive(){
        ArrayList<String> menuName = new ArrayList<String>();
        menuName.add("Bang Bang Milk Tea");
        menuName.add("Signature Brown Sugar");
        menuName.add("MAMEE x tealive");
        menuName.add("Strawberry Pop Pop Pearls");
        this.menuName = menuName;

        ArrayList<Double> price = new ArrayList<>();
        price.add(7.40);
        price.add(7.40);
        price.add(15.50);
        price.add(10.99);
        this.price = price;

        ArrayList<String> menuDesc = new ArrayList<String>();
        menuDesc.add("A locally-upgraded version of the Original Milk Tea, now with brown sugar! Combined with the irresistible chew of pearls and the rich, toffee-like flavor of brown sugar, this drink is unforgettable.");
        menuDesc.add("The Original Pearl Milk Tea tops the chart as the most famous type of milk tea in the world. A must-try for everyone!");
        menuDesc.add("You can eat it HOT, or enjoy it COLD; but one thing's for sure, the Spicy Mi Boba is not your usual cup of noodle.");
        menuDesc.add("Pop Pop Pearls introduces pearls that’ll ‘pop’ in your mouth as you bite into them.");
        this.menuDesc = menuDesc;

        ArrayList<ImageIcon> menuPic = new ArrayList<>();
        menuPic.add(new ImageIcon(MainPages.class.getResource("/system/resources/tl1 resize.jpg")));
        menuPic.add(new ImageIcon(MainPages.class.getResource("/system/resources/tl2 resize.jpg")));
        menuPic.add(new ImageIcon(MainPages.class.getResource("/system/resources/tl3 resize.jpg")));
        menuPic.add(new ImageIcon(MainPages.class.getResource("/system/resources/tl4 resize.jpg")));
        this.menuPic = menuPic;
        
        ArrayList<ImageIcon> bigPic = new ArrayList<>();
		bigPic.add(new ImageIcon(MainPages.class.getResource("/system/resources/tl1 expand.jpg")));
		bigPic.add(new ImageIcon(MainPages.class.getResource("/system/resources/tl2 expand.jpg")));
		bigPic.add(new ImageIcon(MainPages.class.getResource("/system/resources/tl3 expand.jpg")));
		bigPic.add(new ImageIcon(MainPages.class.getResource("/system/resources/tl4 expand.jpg")));
		this.bigPic = bigPic;
    }

    public double getPrice(int number) {
        return price.get(number-1);
    }

    public String getMenuDesc(int number) {
        return menuDesc.get(number-1);
    }

    public String getMenuName(int number) {
        return menuName.get(number-1);
    }

    public ImageIcon getMenuPic(int number){
        return menuPic.get(number-1);
    }
    
    public ImageIcon getBigPic(int number) {
		return bigPic.get(number-1);
	}
}
