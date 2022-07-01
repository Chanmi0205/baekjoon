package portfolio_220701;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int number[] = new int[9];
		int max = 0, index = 0;
		
		for(int i=0; i<number.length; i++) {
			number[i] = scan.nextInt();
			if ( number[i] < 100 ) {
				continue;
			} else {
				System.out.println("잘못된 입력값입니다.");
			}
		}
		
		for(int i=0; i<number.length; i++) {
			if ( number[i] > max ) {
				max = number[i];
				index = i+1;
			}
		}
		
		System.out.println(max);
		System.out.println(index);
	}

}
