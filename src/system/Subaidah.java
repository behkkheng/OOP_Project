package system;

import javax.swing.*;
import java.util.ArrayList;

public class Subaidah {
    private ArrayList<String> menuName;
    private ArrayList<String> menuDesc;
    private ArrayList<Double> price;
    private ArrayList<ImageIcon> menuPic;
    private ArrayList<ImageIcon> bigPic;

    Subaidah(){
    	//name of the food
    	//save to array list
    	//just change the name of food directly
        ArrayList<String> menuName = new ArrayList<String>();
        menuName.add("Nasi Lemak Daun Pisang");
        menuName.add("Satay");
        menuName.add("Mee Rebus");
        menuName.add("Roti Canai");
        menuName.add("Teh Tarik");
        menuName.add("");
        this.menuName = menuName;

        //price of the food
        //save to array list
        //just change the value of the price directly
        ArrayList<Double> price = new ArrayList<Double>();
        price.add(12.40);
        price.add(1.00);
        price.add(8.30);
        price.add(1.00);
        price.add(3.00);
        price.add(0.00);
        this.price = price;

        //description of the food
        //save to array list
        //just add or change the description directly
        ArrayList<String> menuDesc = new ArrayList<String>();
        menuDesc.add("A famous breakfast for Malaysian.");
        menuDesc.add("Chicken satay with delicious peanut sauces");
        menuDesc.add("Noodle soup");
        menuDesc.add("A popular flat bread in Malaysia.");
        menuDesc.add("Hot milk tea beverage");
        menuDesc.add("");
        this.menuDesc = menuDesc;

        //picture of the food
        //save to array list
        //please save the image in /system/resources and add the image name after the path
        //recommended picture size: 300 x 175 px
        ArrayList<ImageIcon> menuPic = new ArrayList<>();
        menuPic.add(new ImageIcon(MainPages.class.getResource("/system/resources/sbd1 resize.jpg")));
        menuPic.add(new ImageIcon(MainPages.class.getResource("/system/resources/sbd2 resize.jpg")));
        menuPic.add(new ImageIcon(MainPages.class.getResource("/system/resources/sbd3 resize.jpg")));
        menuPic.add(new ImageIcon(MainPages.class.getResource("/system/resources/sbd4 resize.jpg")));
        menuPic.add(new ImageIcon(MainPages.class.getResource("/system/resources/sbd5 resize.jpg")));
        menuPic.add(new ImageIcon(MainPages.class.getResource("")));
        this.menuPic = menuPic;
        
        //big picture of the food
        //save to array list
        //please save the image in /system/resources and add the image name after the path
        //recommended picture size: 630 x 215 px
        ArrayList<ImageIcon> bigPic = new ArrayList<>();
		bigPic.add(new ImageIcon(MainPages.class.getResource("/system/resources/sbd1 expand.jpg")));
		bigPic.add(new ImageIcon(MainPages.class.getResource("/system/resources/sbd2 expand.jpg")));
		bigPic.add(new ImageIcon(MainPages.class.getResource("/system/resources/sbd3 expand.jpg")));
		bigPic.add(new ImageIcon(MainPages.class.getResource("/system/resources/sbd4 expand.jpg")));
		bigPic.add(new ImageIcon(MainPages.class.getResource("/system/resources/sbd5 expand.jpg")));
		bigPic.add(new ImageIcon(MainPages.class.getResource("")));
		this.bigPic = bigPic;
    }

    //get the price of chosen food
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

    //get the picture of the food
    public ImageIcon getMenuPic(int number){
        return menuPic.get(number-1);
    }
    
    //get the big picture of the food
    public ImageIcon getBigPic(int number) {
		return bigPic.get(number-1);
	}
    
    //get the number of food store in array list
    public int getSize() {
    	return menuName.size();
    }
}
