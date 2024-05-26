package interface2;
import java.util.Random;
import java.util.Scanner;
public class Bank implements BankChar {
	String koza_num;
	String koza_name;
	int price = 50000;
	
	
	public String getBankName() {
		System.out.print("口座名を入力してください：");
		Scanner scan = new Scanner(System.in);
		koza_name = scan.next();
		return this.koza_name;
	}
	
	public String getBankNum() {
		int koza_numRam =(int) Math.ceil(Math.random() * 1000000);
		koza_num = Integer.toString(koza_numRam);
		
		return koza_num;
	}
	
	public void getBankPrice(int price_out) {
		this.price = price;
		if(price < price_out) {
			System.out.println("残高が足りません！");
		}else {
			price = price - price_out;
		}
	}
	
	public void setBankPrice(int price_in) {
		this.price = price;
		price = price + price_in;
	}
	
	public void BankStatus() {
		System.out.println("口座名：" + getBankName() +" "+ "口座番号：" + getBankNum() + " " + "残高：" + this.price);
	}
}
