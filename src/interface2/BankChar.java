package interface2;

public interface BankChar {
	public String getBankName();			//口座名を返却する
	public String getBankNum();				//口座番号を返却する
	public void getBankPrice(int price);	//口座の出勤を行う
	public void setBankPrice(int price);	//口座の入金を行う
	public void BankStatus();				//口座名、口座番号、残高を表示する
}
