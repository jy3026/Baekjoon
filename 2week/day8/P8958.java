package day3;

import java.util.Scanner;

public class P8958 {
	public static void main(String[] args) {

		Scanner Scan = new Scanner(System.in);
		int n = Scan.nextInt();
		int total = 0;
		int plus = 1;
		String A[] = new String[n];
		char B;
		String C = "";
		

		for(int i=0;i<n;i++)
		{
			A[i] = Scan.next();
			C = A[i];
			for(int j = 0; j < C.length(); j++) {
				B = C.charAt(j);
				
				if(B=='O')
				{
					total += plus;
					plus++;
				}
				if(B=='X')
				{
					plus = 1;
				}
				
			}
			System.out.println(total);
			total = 0;
			plus = 1;
			
		}

	}
	

}
