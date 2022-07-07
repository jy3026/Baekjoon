package day3;

import java.util.Scanner;

public class P1546 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		
		float a[] = new float[N];
		float b[] = new float[N];
		float max = -1000001;
		float c = 0;
		for(int i =0; i<N ; i++) {
			a[i] = scan.nextInt();
			if(max < a[i])
				max = a[i];
		}
		
		for(int i =0; i<N ; i++) {
			b[i]= a[i]/max*100;
			c += b[i];

		}
		System.out.println(c/N);
		
		
		
		
		
	}
}
