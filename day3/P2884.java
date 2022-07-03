package day3;

import java.util.Scanner;

public class P2884 {
	public static void main(String[] args) {

		Scanner Scan = new Scanner(System.in);
		int A = Scan.nextInt();
		int B = Scan.nextInt();
		int C = Scan.nextInt();
		
		A += C / 60;
		B += C % 60;
		
		if(A>23) {
			A -= 24;
			
		}
		if(B>59) {
			A += 1;
			B -= 60;
		}
		
		System.out.println(A +" " + B);
		
	}
}
