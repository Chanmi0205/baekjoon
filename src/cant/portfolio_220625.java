package cant;

import java.util.Scanner;

public class portfolio_220625{
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		try {
		// N���� ����
		int N = scan.nextInt();
		
		if ( 1 <= N && N <= 100 ) {
			
			for(int i=0; i<N; i++) {
				for(int j=0; j<2*N-1; j++) {
					if ( i > j || i+j >= 9)
						System.out.print(" ");
					else 
						System.out.print("*");
				}
				System.out.println();
			}
		} else {
			System.out.println("�߸��� �Է°��Դϴ�.");
		}
		
	}	catch (Exception e) {
		// TODO: handle exception
		System.out.println("���� �߻�");
	}
  }
}
