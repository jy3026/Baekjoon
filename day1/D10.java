package day1;

import java.util.Scanner;

public class D10 {
	public static void main(String[] args) {
		int A,B;
		Scanner scan = new Scanner(System.in);
		
		A = scan.nextInt();
		B = scan.nextInt();
		

		System.out.println(A * (B%10));	
		System.out.println(A * ((B%100)/10) );	
		System.out.println(A * (B/100));
		System.out.println(A * B);

	}
}
