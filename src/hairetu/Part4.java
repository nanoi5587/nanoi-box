package hairetu;
import java.util.Scanner;
import java.util.ArrayList;
public class Part4 {

	public static void main(String[] args) {
		var list = new ArrayList<Integer>();
		for(int i = 0; i < 10; i++) {
			Scanner scan = new Scanner(System.in);
			System.out.print(":");
			int x = scan.nextInt();
			list.add(x);
			System.out.print(list);
		}

	}
}
