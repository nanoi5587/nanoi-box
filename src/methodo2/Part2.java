package methodo2;
//三角形
public class Part2 {

	public static void main(String[] args) {
		triangleSize(4);
	}
	
	public static void triangleSize(int n) {
		for(int x = 0; x < n; x++) {
			for(int y = 0; y <= x; y++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	} 

}
