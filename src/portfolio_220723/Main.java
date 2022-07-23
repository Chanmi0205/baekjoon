package portfolio_220723;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int test = num2;
		int num[] = new int[3];
		
		for(int i=0; i<num.length; i++) {
			num[i] = test%10;
			test /= 10;
			System.out.println(num1 * num[i]);
		}
		
		System.out.println(num1 * num2);
		
	}

}
