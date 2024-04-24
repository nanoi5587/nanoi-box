package hairetu;
public class Part6 {

	public static void main(String[] args) {
		int[][] h = {{2,5},
				{25,6},
				{23,48},
				{36,7},
				{56,12}};
		
		int[][] x = new int[5][2];		//格納する二次元配列の宣言
	
		for(int i = 0; i < h.length;i++) {
			for(int j = 0; j < h[0].length; j++) {
				x[i][j] = h[i][j] * 2;
				System.out.println("[" + i + "][" + j + "]" + x[i][j]);
			}	
		}
	}

}
