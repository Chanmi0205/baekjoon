package portfolio_220617;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		// 두 수 A, B 입력받기
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		
		if ( 0 < A && B < 10 ) {
			System.out.println(A-B);
		} else {
			System.out.println("조건에 맞지 않은 입력값입니다.");
		}
	}

}
