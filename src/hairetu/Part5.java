package hairetu;
import java.util.Scanner;
public class Part5 {

	public static void main(String[] args) {
		int total = 0;
		for(int i=0;i < 10;i++  ) {
			Scanner scan = new Scanner(System.in);
			int x = scan.nextInt();
			total += x;
			if(total>100) {
				System.out.println("100を超えました");
				break;
			}
		}
		System.out.println(total);
	}

}
