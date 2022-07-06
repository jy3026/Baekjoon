package day3;

import java.io.*;
import java.util.Scanner;

public class P1110 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int num = N;
		int count = 0;
		

		
		while(true) {
			int num1 = num / 10;
			int num2 = num % 10;
			num = num2*10  + (num1+num2)%10;
			
			
			count +=1;
			
			if (N == num)
				break;
			
				
			
		}
		System.out.println(count);
	}
}
