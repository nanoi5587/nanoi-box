package class1;
import java.util.Arrays;
public class Cal {
	private int x;
	private int y;
	private int[] z;
	
	public Cal(int x, int y, int[] z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	public static int add(int x, int y) {
		return x + y;
	}
	public static int sub(int x, int y) {
		return x - y;
	}
	public static int avg(int[] z) {
		int total = 0;
		for(int x = 0; x < z.length; x++) {
			total = total + z[x];
		}
		return total / z.length;
	}
	public static int max(int[] z) {
		int max = 0;
		for(int x = 0; x < z.length; x++) {
			if(max < z[x]) {
				max = z[x];
			}
		}
		return max;
	}
	public static int min(int[] z) {
		int min = z[0];
		for(int x = 0; x < z.length; x++) {
			if(min > z[x]) {
				min = z[x];
			}
		}
		return min;
	}
	
	public static void sort(int[] z) {
		Arrays.sort(z);
		System.out.println("[3,8,7]の昇順：" + Arrays.toString(z));
	}
		
}
