package system;

import java.util.LinkedList;

//declare node
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

	//function to add order into a linked list
	public LinkedList<Node> addMenu(String newMenuName, int newQuantity, double newPrice) {

		//if the linked list is empty then add the order directly into linked list
		if (allOrder.isEmpty()) {
			Node node = new Node();
			node.menuName = newMenuName;
			node.quantity = newQuantity;
			node.price = newPrice;
			allOrder.add(node);
		} else {
			Node node = new Node();
			boolean detectRepeatation = false;

			//detect if the added food already exist in the linked list
			//in this case we just change the quantity of the selected food 
			//algorithm = added quantity of food + exists quantity of food = new quantity of food
			//          = remove the exists food's node then create and store in a new one
			for (int i = 0; i < allOrder.size(); i++) {
				//loop through the linked list to find the particular food
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
			// if the added food is not repeated then just add to the linked list directly
			if (!detectRepeatation) {
				node.menuName = newMenuName;
				node.quantity = newQuantity;
				node.price = newPrice;
				allOrder.add(node);

			}
		}
		return allOrder;
	}

	// subtract the quantity of selected food in the linked list
	public LinkedList<Node> removeMenu(String newMenuName, int newQuantity, double newPrice) {
		//if the selected food's quantity is one, then remove the food from the linked list
		if (newQuantity == 1) {
			for (int i = 0; i < allOrder.size(); i++) {
				//loop through the linked list to find the particular food
				if (allOrder.get(i).menuName.equals(newMenuName)) {
					allOrder.remove(i);
					break;
				}
			}
		} else {
			//if the selected food's quantity is more than 1, then just subtract the quantity of food by one
			//algorithm = find the particular food and subtract the quantity of food by one
			//          = remove the node of food, create and store in a new node
			Node node = new Node();
			for (int i = 0; i < allOrder.size(); i++) {
				//loop through the linked list to find the particular food
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
	
	//function to delete all of the orders
	public LinkedList<Node> deleteAll(LinkedList<Node> allOrder){
		allOrder.clear();
		return allOrder;
	}
	
	//get the number of node (orders) in linked list
	public int getNumberOfMenu() {
		int count = 0;
		Node temp = new Node();
		//if the linked list is empty
		if (allOrder.isEmpty()){
			return 0;
		}
		else{ // if the linked list have some orders, then count the number of node by for loop
			for (temp= allOrder.getFirst(); temp != null; temp=temp.next){
				count++;
			}
			return count;
		}
	}

	//get the name of the selected food
	public String getMenuName(int number) {
		return allOrder.get(number-1).menuName;
	}

	//get the price of the selected food
	public double getPrice(int number){
		return allOrder.get(number-1).price;
	}

	//get the quantity of the selected food
	public int getQuantity(int number){
		return allOrder.get(number-1).quantity;
	}

}
