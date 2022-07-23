package day1;

import java.util.Scanner;

public class P10870 {

	    public static void main(String[] args) {
	    	Scanner Sc = new Scanner(System.in);
			int N = Sc.nextInt();
			
			System.out.println(Fibonacci(N));
			
			Sc.close();
		}
		
		public static int Fibonacci(int N)
		{
			if(N<=1)
			{
				return N;
			}
			return Fibonacci(N-1) + Fibonacci(N-2);
		}




}
