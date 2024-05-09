package class2_2;

public class Robot {
	private int x;
	private int y;
	private int i;
	
	public Robot(int x, int y, int i) {
		this.i = i;
		this.x = x;
		this.y = y;
	}
	
	public int robot_North(int i) {
		y++;
		return y;
	}
	
	public int robot_South(int i) {
		return y--;
	}
	
	public int robot_East(int i) {
		return x++;
	}
	
	public int robot_West(int i) {
		return x--;
	}
	
	public static void robot_None(int i) {
		System.out.println("コマンドが違います");
	}
	
	public static void robot_Now(int x, int y) {
		System.out.println("現在：" + x + "," + y);
	}
}
