package mesoddo;
import java.util.Scanner;
public class Part5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		hantei(x);
		
	}
	
	public static void hantei(int x) {
		if(x % 2 == 0 && x % 3 == 0) {
			System.out.println("2及び3の倍数です");
		}else if(x % 2 == 0) {
			System.out.println("2の倍数です");
		}else if(x % 3 == 0) {
			System.out.println("3の倍数です");
		}else {
			System.out.println("2及び3の倍数ではありません");
		}
	}

}
