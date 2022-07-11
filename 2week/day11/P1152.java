package day1;

import java.util.Scanner;


public class P1152 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String A = scan.nextLine();
		
		if(A.isEmpty() || A.equals(" ")) {
			System.out.println(0);
		} else {
			String[] word = A.trim().split(" ");
			System.out.println(word.length);
		}
	}
}
