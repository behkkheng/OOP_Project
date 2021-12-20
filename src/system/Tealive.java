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
    	//name of the food
    	//save to array list
    	//just change the name of food directly
    	ArrayList<String> menuName = new ArrayList<String>();
        menuName.add("Bang Bang Milk Tea");
        menuName.add("Signature Brown Sugar");
        menuName.add("MAMEE x tealive");
        menuName.add("Strawberry Pop Pop Pearls");
        menuName.add("Malty Smoothies (Horlicks)");
        menuName.add("Sparkling Lychee with 3Q Jelly");
        this.menuName = menuName;

        //price of the food
    	//save to array list
        //just change the value of the price directly
        ArrayList<Double> price = new ArrayList<>();
        price.add(7.40);
        price.add(7.40);
        price.add(15.50);
        price.add(10.99);
        price.add(11.80);
        price.add(9.40);
        this.price = price;

        //Description of the food
    	//save to array list
        //just add or change the description directly
        ArrayList<String> menuDesc = new ArrayList<String>();
        menuDesc.add("A locally-upgraded version of the Original Milk Tea, now with brown sugar! Combined with the irresistible chew of pearls and the rich, toffee-like flavor of brown sugar, this drink is unforgettable.");
        menuDesc.add("The Original Pearl Milk Tea tops the chart as the most famous type of milk tea in the world. A must-try for everyone!");
        menuDesc.add("You can eat it HOT, or enjoy it COLD; but one thing's for sure, the Spicy Mi Boba is not your usual cup of noodle.");
        menuDesc.add("Pop Pop Pearls introduces pearls that’ll ‘pop’ in your mouth as you bite into them.");
        menuDesc.add("Cool off with our one-and-only malt based smoothie, packed with milky and nutritious goodness. Great to suppress hunger!");
        menuDesc.add("A top favourite, this sparkling beverage is amongst our most recommended! Try it with 3Q Jelly which combines sago, coconut jelly and pearl so you’ll be in ultimate chewy paradise.");
        this.menuDesc = menuDesc;

        //picture of the food
    	//save to array list
        //please save the image in /system/resources and add the image name after the path
        //recommended picture size: 300 x 175 px
        ArrayList<ImageIcon> menuPic = new ArrayList<>();
        menuPic.add(new ImageIcon(MainPages.class.getResource("/system/resources/tl1 resize.jpg")));
        menuPic.add(new ImageIcon(MainPages.class.getResource("/system/resources/tl2 resize.jpg")));
        menuPic.add(new ImageIcon(MainPages.class.getResource("/system/resources/tl3 resize.jpg")));
        menuPic.add(new ImageIcon(MainPages.class.getResource("/system/resources/tl4 resize.jpg")));
        menuPic.add(new ImageIcon(MainPages.class.getResource("/system/resources/tl5 resize.png")));
        menuPic.add(new ImageIcon(MainPages.class.getResource("/system/resources/tl6 resize.png")));
        this.menuPic = menuPic;
        
        //big picture of the food
    	//save to array list
        //please save the image in /system/resources and add the image name after the path
        //recommended picture size: 630 x 215 px
        ArrayList<ImageIcon> bigPic = new ArrayList<>();
		bigPic.add(new ImageIcon(MainPages.class.getResource("/system/resources/tl1 expand.jpg")));
		bigPic.add(new ImageIcon(MainPages.class.getResource("/system/resources/tl2 expand.jpg")));
		bigPic.add(new ImageIcon(MainPages.class.getResource("/system/resources/tl3 expand.jpg")));
		bigPic.add(new ImageIcon(MainPages.class.getResource("/system/resources/tl4 expand.jpg")));
		bigPic.add(new ImageIcon(MainPages.class.getResource("/system/resources/tl5 expand.png")));
		bigPic.add(new ImageIcon(MainPages.class.getResource("/system/resources/tl6 expand.png")));
		this.bigPic = bigPic;
    }

    //get the price of food
    public double getPrice(int number) {
        return price.get(number-1);
    }

    //get the description of the chosen food
    public String getMenuDesc(int number) {
        return menuDesc.get(number-1);
    }

    //get the name of the chosen food
    public String getMenuName(int number) {
        return menuName.get(number-1);
    }

    //get the picture of the chosen food
    public ImageIcon getMenuPic(int number){
        return menuPic.get(number-1);
    }
    
    //get the big picture of the chosen food
    public ImageIcon getBigPic(int number) {
		return bigPic.get(number-1);
	}
    
    //get the size of the chosen food
    public int getSize() {
    	return menuName.size();
    }
}
