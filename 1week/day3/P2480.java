package day3;

import java.util.Scanner;

public class P2480 {
	public static void main(String[] args) {

		Scanner Scan = new Scanner(System.in);
		int A = Scan.nextInt();
		int B = Scan.nextInt();
		int C = Scan.nextInt();
		
		if(A==B && A==C && B==C)
		{
			System.out.println(10000+(A*1000));
		}
		else if( A==B || A==C) {
			System.out.println(1000+(A*100));
		}
		else if( A==B || B==C) {
			System.out.println(1000+(B*100));
		}
		else if(A==C || B==C) {
			System.out.println(1000+(C*100));
		}
		else {
			if(A>B && A>C)
			{
				System.out.println((A*100));
			}
			if(B>A && B>C)
			{
				System.out.println((B*100));
			}
			if(C>B && C>A)
			{
				System.out.println((C*100));
			}
		}
		
	}
}
