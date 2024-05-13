package class2_2;

public class SuperRobot extends Robot {
	public SuperRobot(int x,int y,int i) {
		super(x,y,i);
	}
	public void superRobot_NE(int i) {
		super.robot_East(i);
		super.robot_North(i);
		
	}
	public void superRobot_NW(int i) {
		super.robot_North(i);
		super.robot_West(i); 
	}
	
	public void superRobot_SE(int i) {
		super.robot_South(i);
		super.robot_East(i);
	}
	
	public void superRobot_SW(int i) {
		super.robot_South(i);
		super.robot_South(i);	
	}
	
	public static void superRobot_false(int x, int y) {
		if(x < -10 || x > 10 || y < -10 || y > 10) {
			System.out.println("これ以上進めません");
		}
	}
}
