package portfolio_220712;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<(N-1)-i; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	   }
	
}
