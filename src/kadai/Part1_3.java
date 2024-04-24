package kadai;

public class Part1_3 {
//三つの変数を準備し、一番大きい数字を表示するように作成
	public static void main(String[] args) {
		int a = 100;
		int b = 400;
		int c = 300;
		System.out.println("最大値：" + Math.max(Math.max(a, b),c));
	}

}
