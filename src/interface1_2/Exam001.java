package interface1_2;

import interface1.Item;

public class Exam001 {
	public static void main(String[] args) {
		Item item = new Item();
		item.setItemName("pencil");
		item.setItemPrice(100);
		
		System.out.println("アイテム名は"+item.getItemName());
		System.out.println("アイテム価格は"+item.getItemPrice());
		
		item.printStatus();
	}
}
