package mesoddo;

public class Part3 {

	public static void main(String[] args) {
		System.out.println(dai(48,49));
		System.out.println(dai(75,49));
	}
	
	public static int dai(int x, int y) {
		if(x>y) {
			return x;
		}else {
			return y;
		}
		
	}

}
