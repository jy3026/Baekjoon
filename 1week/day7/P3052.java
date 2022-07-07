package day3;

import java.util.LinkedList;
import java.util.Scanner;

public class P3052 {
	public static void main(String[] args) {

		Scanner Scan = new Scanner(System.in);
		int A = Scan.nextInt();
		int B = Scan.nextInt();
		int C = Scan.nextInt();
		
		int D = A*B*C;
		
		int a[] = new int[10];
		
		LinkedList<Integer> stack = new LinkedList<Integer>();
        while(D > 0){
            stack.push(D % 10);
            D = D / 10;
        }
        while ((!stack.isEmpty())){
            int temp=stack.pop();
            
            a[temp] +=1;

        }
		
		for(int i=0;i<10;i++)
		{
			
			System.out.println(a[i]);

		}

		
	}
	

}
