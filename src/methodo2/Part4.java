package methodo2;
//配列平均
public class Part4 {

	public static void main(String[] args) {
		int[] num = {4,10,7};
		average(num);
	}
	
	public static void average(int[] n) {
		int total = 0;
		for(int x = 0; x < n.length; x++) {
			total = total + n[x]; 
		}
		System.out.println(total/n.length);
	}

}
