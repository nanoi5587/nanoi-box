package hairetu;

public class Part7 {

	public static void main(String[] args) {
		int[][] h = {{2,5},
				{25,6},
				{23,48},
				{36,7},
				{56,12}};
		int sum = 0;
		for(int i = 0; i<h.length; i++) {
			for(int j = 0; j < h[i].length; j++) {
				sum += h[i][j];
			}
		}
		System.out.println(sum);
	}

}
