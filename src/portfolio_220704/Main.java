package portfolio_220704;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		int money = 0;
		int max = 0;
		
		if ( A > max ) {
			max = A;
		}
		
		if ( B > max ) {
			max = B;
		}
	
		if ( C > max ) {
			max = C;
		}
		
		if( A == B && B == C ) {
			money = 10000 + A * 1000;
		} else if ( A == B || B == C ) {
			money = 1000 + B * 100;
		} else if ( A == B || A == C ) {
			money = 1000 + A * 100;
		} else { 
			money = max * 100;	
		}	
		
		System.out.println(money);
		
	
	}

}
