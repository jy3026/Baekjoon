package day1;

import java.util.Scanner;


public class P2908 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int A= scan.nextInt();
		int B= scan.nextInt();
		int C=0;
		int D=0;
		int F=0;
		while(A>0) {
			C = A%10;
			D = D+ C*100;
			C = A/10;
			A = A/10;
			
			C = A%10;
			D = D+ C*10;
			C = A/10;
			A = A/10;
			
			C = A%10;
			D = D+ C;
			C = A/10;
			A = A/10;
		}
		while(B>0) {
			C = B%10;
			F = F+ C*100;
			C = B/10;
			B = B/10;
			
			C = B%10;
			F = F+ C*10;
			C = B/10;
			B = B/10;
			
			C = B%10;
			F = F+ C;
			C = B/10;
			B = B/10;
		}
		if(D>F) {
			System.out.println(D);
		}
		else {
			System.out.println(F);
		}
		
	}
}
