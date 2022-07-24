package portfolio_220724;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int count = 0;
		boolean test = false;
		
		int num[] = new int[N];
		
		for(int i=0; i<num.length; i++) {
			num[i] = scan.nextInt();
		}
		
		for(int i=0; i<num.length; i++) {
		
			for(int j=2; j<num[i]; j++) {
				if(num[i] % j == 0) {
					test = true;
					break;
				}
			}
			
			if ( test == true || num[i] == 1 ) {
				test = false;
			} else {
				count++;
			}	
			
		}
		
		System.out.println(count);
		
	}

}
