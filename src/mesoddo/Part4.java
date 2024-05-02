package mesoddo;
public class Part4 {

	public static void main(String[] args) {
		int x = 63;
		int y = 78;
		int z = 54;
		
		System.out.println(max(max(x,y),z));	
	}
	public static int max(int x, int y) {
		if(x>y) {
			return x;
		}else {
			return y;
		}
	}
	
}
