package mesoddo;

public class Part6 {

	public static void main(String[] args) {
		int tei = 3;
		int takasa = 6;
		System.out.println(triangle(tei,takasa));
	}
	
	public static int triangle(int tei, int takasa) {
		return tei * takasa / 2; 
	}

}
