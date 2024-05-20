package class2_2;

public class SuperRobot extends Robot {
	public SuperRobot(int x,int y) {
		super(x,y);
	}
	public void superRobot_NE() {
		super.robot_East();
		super.robot_North();
	}
	public void superRobot_NW() {
		super.robot_North();
		super.robot_West(); 
	}
	
	public void superRobot_SE() {
		super.robot_South();
		super.robot_East();
	}
	
	public void superRobot_SW() {
		super.robot_South();
		super.robot_West();	
	}
	
	public void superRobot_false() {
		int maxNum = 11;
		int minNum = -11;
	
/*		numX = Math.max(minNum, super.getX());
		numX = Math.min(maxNum, super.getX());
		numX = super.getX();
		return numX;
	}
	public int 	superRobot_falseY() {
		int maxNum = 10;
		int minNum = -10;
		int numY = 0;
		
		numY = Math.max(minNum, super.getY());
		numY = Math.max(maxNum, super.getY());
		numY = super.getY();
		return numY;
	}*/
		if(super.getX() >= maxNum){
			if(super.getY() >= maxNum) {
				System.out.println("これ以上進めません");
				super.robot_West();
				super.robot_South();
			}else if(super.getY() <= minNum) {
				System.out.println("これ以上進めません");
				super.robot_North();
				super.robot_West();
			}else {
				System.out.println("これ以上進めません");
				super.robot_West();
			}
		}else if(super.getX() <= minNum) {
			if(super.getY() >= maxNum) {
				System.out.println("これ以上進めません");
				super.robot_East();
				super.robot_South();
			}else if(super.getY() <= minNum) {
				System.out.println("これ以上進めません");
				super.robot_East();
				super.robot_North();
			}else {
				System.out.println("これ以上進めません");
				super.robot_East();
			}
		}else if(super.getY() >= maxNum) {
			System.out.println("これ以上進めません");
			super.robot_South();
		}else if(super.getY() <= minNum) {
			System.out.println("これ以上進めません");
			super.robot_North();
		}
	}
}
