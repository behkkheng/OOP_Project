package system;

import java.util.LinkedList;

import javax.swing.JOptionPane;

import java.awt.Toolkit;

class Node{
	String menuName;
	int quantity = 0;
	double price;
	Node next;
}

public class Order {
	private LinkedList<Node> allOrder;

	public Order(LinkedList<Node> allOrder) {
		this.allOrder = allOrder;
	}

	public LinkedList<Node> deleteAll(LinkedList<Node> allOrder){
		allOrder.clear();
		return allOrder;
	}

	public LinkedList<Node> addMenu(String newMenuName, int newQuantity, double newPrice) {

		if (allOrder.isEmpty()) {
			Node node = new Node();
			node.menuName = newMenuName;
			node.quantity = newQuantity;
			node.price = newPrice;
			allOrder.add(node);
		} else {
			Node node = new Node();
			boolean detectRepeatation = false;

			for (int i = 0; i < allOrder.size(); i++) {
				if (allOrder.get(i).menuName.equals(newMenuName)) {
					int quantity = allOrder.get(i).quantity + newQuantity;
					allOrder.remove(i);
					node.quantity = quantity;
					node.price = newPrice;
					node.menuName = newMenuName;
					allOrder.add(i, node);
					detectRepeatation = true;
					break;
				}
			}
			if (!detectRepeatation) {
				node.menuName = newMenuName;
				node.quantity = newQuantity;
				node.price = newPrice;
				allOrder.add(node);

			}
		}
		return allOrder;
	}

	public LinkedList<Node> removeMenu(String newMenuName, int newQuantity, double newPrice) {
		if (newQuantity == 1) {
			for (int i = 0; i < allOrder.size(); i++) {
				if (allOrder.get(i).menuName.equals(newMenuName)) {
					allOrder.remove(i);
					break;
				}
			}
		} else {
			Node node = new Node();
			for (int i = 0; i < allOrder.size(); i++) {
				if (allOrder.get(i).menuName.equals(newMenuName)) {
					int quantity = newQuantity - 1;
					allOrder.remove(i);
					node.quantity = quantity;
					node.price = newPrice;
					node.menuName = newMenuName;
					allOrder.add(i, node);
					break;
				}
			}
		}
		return allOrder;
	}

	public int getNumberOfMenu() {
		int count = 0;
		Node temp = new Node();
		if (allOrder.isEmpty()){
			return 0;
		}
		else{
			for (temp= allOrder.getFirst(); temp != null; temp=temp.next){
				count++;
			}
			return count;
		}
	}

	public String getMenuName(int number) {
		return allOrder.get(number-1).menuName;
	}

	public double getPrice(int number){
		return allOrder.get(number-1).price;
	}

	public int getQuantity(int number){
		return allOrder.get(number-1).quantity;
	}

	public double getTotalAmount(int number){
		return getPrice(number-1)*getQuantity(number-1);
	}
}
