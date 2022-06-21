package portfolio_220611;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		// N값 입력받기
		int N = scanner.nextInt();
		
		if ( 1 <= N && N <= 9 ) {
			for(int i=1; i<=9; i++) {
				System.out.println(N + " * " + i + " = " + N*i);
			}
		} else {
			System.out.println("잘못된 입력값입니다.");
		}
	}

}