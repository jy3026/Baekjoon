package day3;

import java.io.*;
import java.util.Scanner;

public class P2562 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		

		int a[] = new int[9];
		int max = -1000001;
		int count=0;
		
		for(int i=0; i<9;i++) {
			a[i] = scan.nextInt();
			
			if(max < a[i]) {
				max = a[i];
				count = i+1;
			}
			
			
			


		
		}
		System.out.println(max);
		System.out.println(count);
	}
}
