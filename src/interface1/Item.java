package interface1;

public class Item implements ItemChar {
	String name;
	int price;
	Item(String name,int price) {
		this.name = name;
		this.price = price;
	}
	public Item() {
	}
	public String getItemName() {
		return name;
	}
	
	public  void setItemName(String name) {
		System.out.println(name);
	}
	
	public int getItemPrice() {
		return price;
	}
	public void setItemPrice(int price) {
		System.out.println(price);
	}
	public void printStatus() {
		System.out.println(name + " " + price);
	}
}