package portfolio_220710;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// H½Ã MºÐ
		int H = scan.nextInt();
		int M = scan.nextInt();
		
		if( 0 <= H && H <= 23 && 0 <= M && M <= 59 ) {
			
			if ( M - 45 < 0 ) {
				H -= 1;
				M = M + 60 - 45;
			} else {
				M -= 45;
			}
			
			if ( H < 0 ) 
				H += 24;
			
		}
		
		System.out.println(H + " " + M);
	}

}
