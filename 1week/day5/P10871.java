package day3;

import java.io.*;
import java.util.Scanner;

public class P10871 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int X = scan.nextInt();
		
		for(int i=0;i<N;i++){
			int A = scan.nextInt();
			
			if(A<X)
				System.out.print(A + " ");
			
			
			
		}
	}
}
