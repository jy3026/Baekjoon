package day1;

import java.util.Scanner;


public class P4673 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String A= scan.nextLine();
		
		String B[] = {"c=","c-","dz=","d-","lj","nj","s=","z="};

		
		for(int i=0;i<B.length;i++) {
			if(A.contains(B[i])) {
				A = A.replace(B[i], ".");
			}

		}
		System.out.println(A.length());
		
		
	}
}
