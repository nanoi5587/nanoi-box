package class2_2;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int i = 0;
		SuperRobot sr = new SuperRobot(0,0);
		System.out.println("1～8を押してロボットを動かしてください");
		System.out.println("終了する場合は9を押してください");
		System.out.println("現在地を表示する場合は0を押してください");
		
		while(i != 9) {
			i = scan.nextInt();
			if(i == 1) {
				sr.superRobot_false(1);
			}else if (i == 2) {
				sr.superRobot_false(2);
//				sr.robot_South();
				
			}else if(i == 3) {
				sr.superRobot_false(3);
				//sr.robot_East();
				
			}else if(i == 4) {
			//	sr.robot_West();
				sr.superRobot_false(4);
			}else if(i == 5) {
		//		sr.superRobot_NE();
				sr.superRobot_false(5);
			}else if(i == 6) {
	//			sr.superRobot_NW();
				sr.superRobot_false(6);
			}else if(i == 7) {
//				sr.superRobot_SE();
				sr.superRobot_false(7);
			}else if(i == 8) {
//				sr.superRobot_SW();
				sr.superRobot_false(8);
			}else if(i == 9) {
				System.out.println("終了します");
			}else if(i == 0){
				sr.robot_Now();
			}else {
				sr.robot_None();
			}
		}
		
	}

}
