package system;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;

public class OutputOrders {

    private static LinkedList<Node> allOrders;
    private static int waitingNumber;

    public  OutputOrders(LinkedList<Node> allOrders, int waitingNumber){
        OutputOrders.allOrders = allOrders;
        OutputOrders.waitingNumber = waitingNumber;
    }

    public static void main(String[] args) {

        try {
            //check the file exist or not, if not exist then create, if exist then print file is exists and skip
            DecimalFormat df = new DecimalFormat( "##.00" );
            Date date = new Date();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd") ;
            File ordersTXT = new File(dateFormat.format(date)+" orders.txt");
            if (ordersTXT.createNewFile()) {
                System.out.println("File created: " + ordersTXT.getName());
            } else {
                System.out.println("File already exists.");
            }

            //print waiting number, food name and quantity into orders.txt
            FileWriter fileWriter = new FileWriter(dateFormat.format(date)+" orders.txt", true);
            SimpleDateFormat dateTime = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            fileWriter.write("Waiting number: "+waitingNumber+"\n");
            fileWriter.write(dateTime.format(date)+"\n");
            fileWriter.write("No.\tQty.\tUnit Price\tTotal\t\tFood Name\n");
            double sum = 0;
            for (int i=0; i<allOrders.size(); i++){
                fileWriter.write(i+1+".\tx"+allOrders.get(i).quantity+"\t\tRM "+String.format("%6s",df.format(allOrders.get(i).price))+"\tRM "+String.format("%6s",df.format(allOrders.get(i).price*allOrders.get(i).quantity))+"\t"+allOrders.get(i).menuName+"\n");
                sum += allOrders.get(i).price*allOrders.get(i).quantity;
            }
            fileWriter.write("Total amount: RM "+df.format(sum)+"\n");
            fileWriter.write("\n");
            fileWriter.close();
        } catch (IOException e){
            System.out.println("Error! Please restart the system.");
            e.printStackTrace();
        }
    }


}
