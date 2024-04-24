package kadai;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Part1_5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		int x1 = a + b;
		int x2 = a - b;
		int x3 = a * b;
		int x4 = a / b;
		
		System.out.println("和：" + x1 + "差：" + x2 + "積：" + x3 + "商：" + x4);
	}

}
