package portfolio_220703;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		int Case[][] = new int[T][2];
		int sum[] = new int[T];
		
		for(int i=0; i<Case.length; i++) {
			for(int j=0; j<Case[i].length; j++) {
				Case[i][j] = scan.nextInt();
			}
		}
		
		for(int i=0; i<Case.length; i++) {
			for(int j=0; j<Case[i].length; j++) {
				sum[i] += Case[i][j];
			}
		}
		
		for(int i=0; i<sum.length; i++) {
			System.out.println("Case #" + (i+1) + ": " + sum[i]);
		}
		
	}

}
