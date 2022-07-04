package day3;

import java.util.Scanner;

public class P10950 {
	public static void main(String[] args) {

		Scanner Scan = new Scanner(System.in);
		int n = Scan.nextInt();
		int total = 0;
		
		for(int i=1;i<=n;i++)
		{
			total = total + i ;

		}
		System.out.println(total);
	}
	

}
