package portfolio_220617;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		// �� �� A, B �Է¹ޱ�
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		
		if ( 0 < A && B < 10 ) {
			System.out.println(A-B);
		} else {
			System.out.println("���ǿ� ���� ���� �Է°��Դϴ�.");
		}
	}

}
