package day3;

import java.util.Scanner;

public class P2577 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int a;
		int b[] = new int[10];
		
		int count=0;

		for(int i=0;i<10;i++) {
			
			a = scan.nextInt();
			b[i] = a%42;
		}
			
		for(int j=0;j<10;j++) {
			int res=0;
			for(int k=j+1;k<10;k++) {
				if(b[k] == b[j]) {
					res++;
				}
			}
			if(res==0)
				count++;
		
			}
			
		
		
		System.out.println(count);
		
	}
}
