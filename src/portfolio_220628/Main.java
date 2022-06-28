package portfolio_220628;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int X = scan.nextInt();
		
		if ( 1 <= N && N <= 10000 && 1 <= X && X <= 10000 ) {
		} else {
			System.out.println("잘못된 입력값입니다.");
		}
		
		int arr[] = new int[N];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = scan.nextInt();
			if ( 1 <= arr[i] && arr[i] <= 10000 ) {
				continue;
			} else {
				System.out.println("잘못된 입력값입니다.");
			}
		}
		
		for(int i=0; i<arr.length; i++)
			if ( arr[i] < X ) 
				System.out.print(arr[i] + " ");
		
		
	}

}
