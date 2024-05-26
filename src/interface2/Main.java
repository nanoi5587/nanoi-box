package interface2;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		//System.out.print("口座名を入力してください：");
		//Scanner scan = new Scanner(System.in);
		int i = 0;
		int price = 0;
		
		Bank bank = new Bank();
		Scanner scan = new Scanner(System.in);
		while(i != 3) {
			System.out.println("入出金を行います。");
			System.out.println("入金：１　出金：2　終了：3");
			i = scan.nextInt();
			if(i == 1) {
				System.out.println("入金額を入力してください");
				Scanner scan_in = new Scanner(System.in);
				price = scan_in.nextInt();
				bank.setBankPrice(price);
			}else if(i == 2) {
				System.out.println("出金額を入力してください");
				Scanner scan_out = new Scanner(System.in);
				price = scan_out.nextInt();
				bank.getBankPrice(price);
			}else if(i == 3){
				bank.BankStatus();
			}else {
				System.out.println("コマンドが違います");
			}
		}
		//bank.BankStatus();
		//System.out.println(bank.getBankName());
		//System.out.println("口座番号："+bank.getBankNum());
	}

}
