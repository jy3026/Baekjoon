package day3;

import java.io.*;
import java.util.Scanner;

public class P10818 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int a[] = new int[N];
		int max = -1000001;
		int min = 1000001;
		
		for(int i =0; i<a.length;i++) {
			a[i] = scan.nextInt();
			
			
			if(max < a[i]) {
				max = a[i];
			}
			if(min > a[i]) {
				min = a[i];
			}

		
		}
		System.out.print(min +" " + max);
	}
}
