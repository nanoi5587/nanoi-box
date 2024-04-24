package hairetu;
import java.util.Scanner;
import java.util.ArrayList;
public class Part5_2 {

	public static void main(String[] args) {
		var list = new ArrayList<Integer>();
		int total = 0;
		for(int i = 0; i < 10; i++) {
			Scanner scan = new Scanner(System.in);
			int x = scan.nextInt();
			total += x;
			if(total>100) {
				break;
			}
		}
		System.out.println("合計は：" + total);
	}

}
