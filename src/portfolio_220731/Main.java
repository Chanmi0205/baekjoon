package portfolio_220731;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		try {
			int A = scan.nextInt();
			int B = scan.nextInt();
			int C = scan.nextInt();

		int number = A*B*C;

		int sum[] = new int[10]; 
		int num[] = new int[(int)(Math.log10(number)+1)]; 
			
		for(int i=0; i<num.length; i++) {
			num[i] = number%10;
			number /= 10;
		}
		
		
		for(int i=0; i<num.length; i++ ) {
			for(int j=0; j<=sum.length; j++) {
				if ( num[i] == j ) { 
					sum[j] += 1;
					break;
				}
			}
		}
				
		for(int i=0; i<sum.length; i++) {
			System.out.println(sum[i]);
		}
		
		System.exit(0);
		
		}catch (Exception e) {
			System.out.println("예상치 못한 오류가 발생하였습니다.");
		}
			
	} 
}

