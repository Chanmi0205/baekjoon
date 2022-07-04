package cant;

import java.util.Scanner;

public class portfolio_220704 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		long A = scan.nextInt();
		long B = scan.nextInt();
		long C = scan.nextInt();
		
		if ( A < 2147483647 &&  B < 2147483647 &&  C < 2147483647 ) {
		System.out.println((long) Math.pow(A, B)%C);
		} else { 
			System.out.println("잘못된 입력값입니다.");
		}
	}

}
