package day3;

import java.io.*;
import java.util.Scanner;

public class P2439 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();

		
		for(int i=1;i<=N;i++)
		{

			
			for(int j=1;j<=N;j++) {
				
				if(j <= N-i) {
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
				

				
			}

			System.out.println(" ");
		}
		
	}
	

}
