package class2;

public class Robot {
	private int z;
	
	public Robot (int z) {
		this.z = z;

	}
	
	public static int robot(int z) {
		if(z == 1) {
			return 1;
		}else if(z == 2) {
			return -1;
		}else if(z == 3) {
			return 1;
		}else if(z == 4) {
			return -1;
		}else if(z == 9) {
			return 0;
		}else {
			return 3;
		}
/*		switch(z) {
		case 1:
			return 1;
		case 2:
			return -1;
		case 3:
			return 1;
		case 4:
			return -1;
		case 9:
			return 0;
		}
		*/
	}
}
