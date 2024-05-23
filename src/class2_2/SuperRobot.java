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
	
	public void superRobot_false(int i) {
		int maxNum = 10;
		int minNum = -10;
		//北へ進むのチェック
		if(i ==1){
			if(super.getY()>=maxNum){
				System.out.println("これ以上進めません");
			}else {
				super.robot_North();
			}
		}//南へ進むチェック
		else if(i==2){
			if(super.getY()<=minNum){
				System.out.println("これ以上進めません");
			}else {
				super.robot_South();
			}
		}else if(i==3) {
			if(super.getX()>=maxNum) {
				System.out.println("これ以上進めません");
			}else {
				super.robot_East();
			}
		}else if(i==4) {
			if(super.getX()<=minNum) {
				System.out.println("これ以上進めません");
			}else {
				super.robot_West();
			}
		}else if(i==5) {
			if(super.getX()>=maxNum || super.getY()>=maxNum) {
				System.out.println("これ以上進めません");
			}else {
				superRobot_NE();
			}
		}else if(i==6) {
			if(super.getX()<=minNum || super.getY()>=maxNum) {
				System.out.println("これ以上進めません");
			}else {
				superRobot_NW();
			}
		}else if(i==7) {
			if(super.getX()>=maxNum || super.getY()<=minNum) {
				System.out.println("これ以上進めません");
			}else {
				superRobot_SE();
			}
		}else if(i==8) {
			if(super.getX()<=minNum || super.getY()<=minNum) {
				System.out.println("これ以上進めません");
			}else {
				superRobot_SW();
			}
		}
	}
}
	
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
/*		if(super.getX() >= maxNum){
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
}	*/

