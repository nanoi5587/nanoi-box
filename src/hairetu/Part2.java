package hairetu;
import java.util.Arrays;

public class Part2 {

	public static void main(String[] args) {
		int[] num = {1,2,3,4,5,6,7,8,9,10};
		System.out.println(Arrays.toString(num));
		for(int i = 0, m = num.length -1;i < m; i++, m--) {
			int count = num[i];
			num[i] = num[m];
			num[m] = count;
			
		}
		System.out.println(Arrays.toString(num));
	}

}
