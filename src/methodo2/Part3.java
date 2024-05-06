package methodo2;
//2乗
public class Part3 {

	public static void main(String[] args) {
		int[] num = {4,10,7};
		pow(num);
	}
	
	public static void pow(int[] n) {
		for(int x = 0; x < n.length; x++) {
			System.out.println(n[x] * n[x]);
		}
	}

}
