package portfolio_220626;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int sum = 0;
		
		if ( 1 <= n && n <= 10000 ) {
			for(int i=1; i<=n; i++) {
				sum += i;
			} 
		} else {
			System.out.println("잘못된 입력값입니다");
		}
		
		System.out.println(sum);
		
	}

}
