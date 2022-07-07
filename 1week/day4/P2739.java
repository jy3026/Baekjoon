package day3;

import java.util.Scanner;

public class P2739 {
	public static void main(String[] args) {

		Scanner Scan = new Scanner(System.in);
		int N = Scan.nextInt();

		for(int i=1;i<10;i++)
		{
			System.out.println(N +" * " + i + " = " + N*i);
		}
		
	}
}
