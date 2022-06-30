package portfolio_220630;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		
		if(1 <= N && N <= 100)
			for(int i=0; i<N; i++) {
				for(int j=N; j>i; j--) {
					System.out.print("*");
				}
				System.out.println();
			}
	}

}
