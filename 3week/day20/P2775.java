package day1;

import java.util.Scanner;


public class P2775 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int[][] result = new int[T][2];
		
		for(int i=0; i<T; i++)
		{
			result[i][0] = sc.nextInt();
			result[i][1] = sc.nextInt();
		}
		
		int[][] apt = new int[15][15];
		for(int i = 1; i < apt.length; i++) {
			apt[0][i] = i;
		}
	
		for(int i = 1; i < apt.length; i++) {
			for(int j = 1; j < apt.length; j++) {
				apt[i][j] = apt[i][j-1] + apt[i-1][j];
			}
		}
		
		for(int i = 0; i < result.length; i++) {
			System.out.println(apt[result[i][0]][result[i][1]]);
		}
	}
}
