package system;

import javax.swing.*;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class Subaidah {
    private ArrayList<String> menuName;
    private ArrayList<String> menuDesc;
    private ArrayList<Double> price;
    private ArrayList<ImageIcon> menuPic;

    Subaidah(){
        ArrayList<String> menuName = new ArrayList<String>();
        menuName.add("Nasi Lemak Daun Pisang");
        menuName.add("Satay");
        menuName.add("Mee Rebus");
        menuName.add("Roti Canai");
        menuName.add("Teh Tarik");
        this.menuName = menuName;

        ArrayList<Double> price = new ArrayList<Double>();
        price.add(12.40);
        price.add(1.00);
        price.add(8.30);
        price.add(1.00);
        price.add(3.00);
        this.price = price;

        ArrayList<String> menuDesc = new ArrayList<String>();
        menuDesc.add("Potato wedges that drip with cheese sauce and mayonnaise.");
        menuDesc.add("3 pieces of chicken");
        menuDesc.add("9 pieces of chicken nuggets");
        menuDesc.add("Salad that made up of carrot, cabbage and mayonnaise.");
        menuDesc.add("2 burger + 2 pack of fries + 2 wrapper + 10 pcs nugget.");
        this.menuDesc = menuDesc;

        ArrayList<ImageIcon> menuPic = new ArrayList<>();
        menuPic.add(new ImageIcon(MainPages.class.getResource("/system/resources/sbd1 resize.jpg")));
        menuPic.add(new ImageIcon(MainPages.class.getResource("/system/resources/sbd2 resize.jpg")));
        menuPic.add(new ImageIcon(MainPages.class.getResource("/system/resources/sbd3 resize.jpg")));
        menuPic.add(new ImageIcon(MainPages.class.getResource("/system/resources/sbd4 resize.jpg")));
        menuPic.add(new ImageIcon(MainPages.class.getResource("/system/resources/sbd5 resize.jpg")));
        this.menuPic = menuPic;
    }
    public int getArraylistNumber(){
        return price.size();
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
}
