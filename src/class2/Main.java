package class2;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		int x = 0;
		int y = 0;
		Scanner scan = new Scanner(System.in);
		int z = 0;
		Robot r = new Robot(z);
		
		
		while(r.robot(z) != 0) {
			z = scan.nextInt();
			if(z == 1) {
				x = x + r.robot(z);
			}else if(z == 2) {
				x = x + (r.robot(z));
			}else if(z == 3) {
				y = y+r.robot(z);
			}else if(z == 4) {
				y = y+(r.robot(z));
			}else if(z == 9) {
				System.out.println("終了します。現在地("+x+","+y+")");
			}
			else {
				System.out.println("コマンドが違います");
			}
		}
		
		
	}

}
