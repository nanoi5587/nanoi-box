package mesoddo;
import java.util.Scanner;
public class Part5_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		
		System.out.println(hantei(x));
	}
	
	public static String hantei(int x) {
		if(x % 2 == 0 && x % 3 == 0) {
			return "2及び3の倍数です";
		}else if(x % 2 == 0) {
			return "2の倍数です";
		}else if(x % 3 == 0) {
			return "3の倍数です";
		}else {
			return "2及び3の倍数ではありません";
		}
	}
}
