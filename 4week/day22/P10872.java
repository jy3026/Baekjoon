package day1;

import java.util.Scanner;

public class P10872 {
	 public static int Factorial(int p) {
	        if (p < 2) {
	            return 1;
	        } else {
	            return p * Factorial(p - 1);
	        }
	    }
	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);

	        String inputNum = scan.nextLine();
	        int useNum = Integer.parseInt(inputNum);

	        System.out.println(Factorial(useNum));


	        }


}
