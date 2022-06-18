package portfolio_220618;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		// N개의 정수
		int N = scanner.nextInt();
		int arr[] = new int[0];
		int test=0;
		
		try {
			if ( 1 <= N && N <= 1000000 ) { 
				arr = new int[N]; 
			} else {
				System.out.println("잘못된 입력값입니다.");
			}
			
			for(int i=0; i<arr.length; i++) {
				test = scanner.nextInt();
				if ( -1000000 <= test && test <= 1000000 ) {
					arr[i] = test;
				} else {
					System.out.println("잘못된 입력값입니다.");
					break;
				}
			}
			
			// 최대, 최소 저장할 변수
			if ( -1000000 <= test && test <= 1000000 ) {
				int max = Arrays.stream(arr).max().getAsInt();
				int min = Arrays.stream(arr).min().getAsInt();
			
				System.out.println(min + " " + max);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("예상치 못한 오류 발생");
		}
		
	}

}
