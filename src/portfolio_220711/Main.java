package portfolio_220711;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		
		if ( 1 <= N && N <= 1000 ) {
			
			int num[] = new int[N];
			
			for(int i=0; i<num.length; i++) {
				num[i] = scan.nextInt();
			}
			
			Arrays.sort(num);
			
			for(int i=0; i<num.length; i++) {
				System.out.println(num[i]);
			}
			
		}
		
	}

}