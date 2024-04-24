package hairetu;

public class Part6_2 {

	public static void main(String[] args) {
		int[][] h = {{2,5},
				{25,6},
				{23,48},
				{36,7},
				{56,12}};
		
		int[][] x = new int[5][2];
		
		x[0][0]=h[4][0] * 2;
		System.out.print(x[0][0]);
	}

}
