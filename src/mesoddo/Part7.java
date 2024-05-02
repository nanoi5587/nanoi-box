package mesoddo;

public class Part7 {

	public static void main(String[] args) {
		int x = 5;
		System.out.println(loop(x));
		
		int y = 3;
		System.out.println(loop(y));
	}
	
	public static int loop(int x) {
		int sum = 0;
		for(int i = x;i > 0 ; i--) {
			sum += i;
 		}
		return sum;
	}

}
