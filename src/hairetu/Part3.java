package hairetu;
public class Part3 {

	public static void main(String[] args) {
		int[] num = {1,4,5,10,11,15,18,48,49,53};
		System.out.print("偶数：");
		for(int i = 0;i < num.length; i++) {
			if(num[i] % 2 == 0  ) {
				System.out.print(num[i] + " ");
			}
		}
		System.out.print("\n奇数：");
		for(int n = 0;n < num.length;n++) {
			if(num[n] % 2 != 0) {
				System.out.print(num[n] + " ");
			}
		}
		

	}

}
