package hairetu;

public class Part8 {

	public static void main(String[] args) {
		int[][] h = {{2,5},
				{25,6},
				{23,48},
				{36,7},
				{56,12}};
		
		System.out.print("偶数：");
		for(int i = 0;i<h.length;i++) {
			for(int j = 0;j<h[i].length;j++) {
				if(h[i][j] % 2 == 0) {
					System.out.print(h[i][j] + " ");
				}
			}
		}
		System.out.print("\n奇数：");
		for(int i = 0;i<h.length;i++) {
			for(int j = 0;j<h[i].length;j++) {
				if(h[i][j] % 2 != 0) {
					System.out.print(h[i][j] + " ");
				}
			}
		}
	}

}
