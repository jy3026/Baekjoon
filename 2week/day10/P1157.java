package day1;

import java.util.Scanner;


public class P1157 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String A = scan.next();
		
		
		int max = -1000001;
		
		int C[] = new int[26];
		
		for (int i=0;i<A.length();i++)
		{
			if(65<= A.charAt(i) && A.charAt(i) <= 90) {
				C[A.charAt(i)-65]++;
			}
			else {
				C[A.charAt(i)-97]++;
			}
			
		}
		
		char ch ='?';
		
		for (int j=0; j<26;j++) {
			if(max < C[j]) {
				max = C[j];
				ch = (char) (j+65);
			}
			else if (C[j] == max) {
				ch='?';
			}
		}
	
		System.out.print(ch);
		
	}
}
