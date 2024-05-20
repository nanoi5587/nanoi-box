package class2_2;

public class Robot {
	private int x;
	private int y;
	
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Robot(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void robot_North() {
		this.y++;
	//	return y;
	}
	
	public void robot_South() {
		this.y--;
	}
	
	public void robot_East() {
		this.x++;
	}
	
	public void robot_West() {
		this.x--;
	}
	
	public static void robot_None() {
		System.out.println("コマンドが違います");
	}
	
	public void robot_Now() {
		System.out.println("現在：" + this.x + "," + this.y);
	}
}
