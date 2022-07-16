package day1;

import java.util.Scanner;

public class D1712 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		
		int count=1;
		
		while(A+(B*count)>=C*count) {
			count++;
			if(A<=B+C) {
				count = -1;
				break;
			}

		}
		
		System.out.println(count);
		
	}
}
