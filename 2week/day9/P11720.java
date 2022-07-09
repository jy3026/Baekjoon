package day1;

import java.util.Scanner;

public class P11720 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n= scan.nextInt();
		
		int sum=0;
		
		String num = scan.next();
		

		for(int i =0;i<n;i++)
		{
			sum += num.charAt(i) - '0';
		}
		

		System.out.println(sum);
	}
}
