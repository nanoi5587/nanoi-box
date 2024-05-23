package interface1;

public class Item implements ItemChar {
	String name;
	int price;
	/*Item(String name,int price) {
		this.name = name;
		this.price = price;
	}
	public Item() {
	}*/
	public String getItemName() {
		return this.name;
	}
	
	public  void setItemName(String name) {
//		System.out.println(name);
		this.name = name;
	}
	
	public int getItemPrice() {
		return this.price;
	}
	public void setItemPrice(int price) {
		//System.out.println(price);
		this.price = price;
	}
	public void printStatus() {
		System.out.println(name + " " + price);
	}
}