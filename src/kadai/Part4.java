package kadai;

public class Part4 {

	public static void main(String[] args) {
		int [][] seiseki = {{65,71},
				{84,83},
				{74,74},
				{90,90},
				{87,78},
				{93,95}};
		int kokugo_sum = 0;
		int suugaku_sum = 0;
		int count = 0;
		for(int i = 0;i<seiseki.length;i++) {
			kokugo_sum += seiseki[i][0];
			suugaku_sum += seiseki[i][1];
			count++;
		}
		System.out.println(kokugo_sum/count);
		System.out.println(suugaku_sum/count);
	}

}
