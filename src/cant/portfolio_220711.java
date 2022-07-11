package cant;

import java.util.Scanner;

public class portfolio_220711 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int X = scan.nextInt();
		int i=0;
		
		if ( 1 <= X && X <= 10*6 )
		while(X!=1) {
			if( ((X-1)%3==0) ) {
				X--;
				i++;
			} else if ( X % 3 == 0 ) { 
				X /= 3;
				i++;
			} else if ( ((X-1)%2==0) ) {
				X--;
				i++;
			}
			else if ( X % 2 == 0 ) {
				X /= 2;
				i++;
			} else {
				X--;
				i++;
			}
		}
		
		System.out.println(i);
	}

}
