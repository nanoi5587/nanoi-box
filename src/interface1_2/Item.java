package interface1_2;

import interface1.ItemChar;
	
public class Item implements ItemChar{
	String name;
	int price;
	public Item() {
		this.setItemName(name);
		this.setItemPrice(price);
	}
	
	public String getItemName() {
		return name;
	}
	
	public  void setItemName(String name) {
		System.out.println("*" + name);
	//	this.name = name;
	}
	
	public int getItemPrice() {
		return price;
	}
	public void setItemPrice(int price) {
		System.out.println(price);
		//this.price = price;
	}
	public void printStatus() {
		System.out.println(name + " " + price);
	}
}
