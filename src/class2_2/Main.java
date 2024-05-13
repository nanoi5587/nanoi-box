package class2_2;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		int x = 0;
		int y = 0;
		
		Scanner scan = new Scanner(System.in);
		int i = 0;
		Robot r = new Robot(x,y,i);
		SuperRobot sr = new SuperRobot(x,y,i);
		System.out.println("1～8を押してロボットを動かしてください");
		System.out.println("終了する場合は9を押してください");
		System.out.println("現在地を表示する場合は0を押してください");
		
		while(i != 9) {
			i = scan.nextInt();
			if(i == 1) {
				y = r.robot_North(i);
			}else if (i == 2) {
				y = r.robot_South(i);
			}else if(i == 3) {
				x = r.robot_East(i);
			}else if(i == 4) {
				x = r.robot_West(i);
			}else if(i == 5) {
				sr.superRobot_NE(i);
			}else if(i == 6) {
				sr.superRobot_NW(i);
			}else if(i == 7) {
				sr.superRobot_SE(i);
			}else if(i == 8) {
				sr.superRobot_SW(i);
			}else if(i == 9) {
				System.out.println("終了します");
			}else if(i == 0){
				r.robot_Now(x, y);
			}else {
				r.robot_None(i);
			}
		}
		
	}

}
