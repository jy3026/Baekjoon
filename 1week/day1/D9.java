package day1;

import java.util.Scanner;

public class D9 {
	public static void main(String[] args) {
		int A,B,C;
		Scanner scan = new Scanner(System.in);
		
		A = scan.nextInt();
		B = scan.nextInt();
		C = scan.nextInt();
		
		int D = (A+B)%C;
		int F = ((A%C) + (B%C))%C;
		int G = (A*B)%C;
		int H = ((A%C) * (B%C))%C;
				
		System.out.println(D);
		System.out.println(F);
		System.out.println(G);
		System.out.println(H);
	}
}
