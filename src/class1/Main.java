package class1;

public class Main {

	public static void main(String[] args) {
		int i = 10;
		int j = 3;
		int[] num = {3,8,7};
		
		Cal cal = new Cal(i,j,num);
		System.out.println((i + "+" + j + "=" + cal.add(i, j)));
		System.out.println((i + "-" + j + "=" + cal.sub(i, j)));
		System.out.println("[3,8,7]の平均値：" + cal.avg(num));
		System.out.println("[3,8,7]の最大値：" + cal.max(num));
		System.out.println("[3,8,7]の最小値：" + cal.min(num));
		cal.sort(num);
		
		
	}
}
