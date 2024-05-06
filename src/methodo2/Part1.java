package methodo2;
//平均値
public class Part1 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		System.out.println(average(num1,num2));
	}
	
	public static int average(int n1, int n2) {
		int a = 0;
		a = (n1 + n2) / 2;
		return a;
	}

}
