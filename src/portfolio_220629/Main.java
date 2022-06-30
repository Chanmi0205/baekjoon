package portfolio_220629;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		
		if ( 1<= N && N <= 100000 )
			for(int i=1; i<=N; i++) 
				System.out.println(i);
	}

}