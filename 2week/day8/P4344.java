package day3;

import java.util.Scanner;

public class P4344 {
	public static void main(String[] args) {

		Scanner Scan = new Scanner(System.in);
		int c = Scan.nextInt();
		int n = 0;
		

		int sum = 0;
		float avg =0;
		
		float count = 0;
		float stu = 0;
		
		for(int i=0; i<c ; i++) {
			sum = 0;
			avg = 0;
			stu = 0;
			count = 0;
			
			n = Scan.nextInt();
			int a[] = new int[n];
			for(int j=0; j<n ; j++) {
				a[j] = Scan.nextInt();			
				sum += a[j];
				
			}
			avg = sum/n;
			
			for(int k=0; k<n ; k++) {
				if(a[k]> avg) {
					
					count += 1;
				}
			}
			
			stu = count/n * 100;
			System.out.printf("%.3f", stu);
			System.out.println("%");
						
		}

	}
}
