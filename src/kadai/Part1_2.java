package kadai;

public class Part1_2 {
//1～100まで3の倍数を表示
	public static void main(String[] args) {
		int s = 1;
		for(int i = 1;s<99;i++) {
			s = i * 3;
			System.out.print(s + " ");
		}
	}

}
