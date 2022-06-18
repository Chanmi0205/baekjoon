package portfolio_220618;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		// N���� ����
		int N = scanner.nextInt();
		int arr[] = new int[0];
		int test=0;
		
		try {
			if ( 1 <= N && N <= 1000000 ) { 
				arr = new int[N]; 
			} else {
				System.out.println("�߸��� �Է°��Դϴ�.");
			}
			
			for(int i=0; i<arr.length; i++) {
				test = scanner.nextInt();
				if ( -1000000 <= test && test <= 1000000 ) {
					arr[i] = test;
				} else {
					System.out.println("�߸��� �Է°��Դϴ�.");
					break;
				}
			}
			
			// �ִ�, �ּ� ������ ����
			if ( -1000000 <= test && test <= 1000000 ) {
				int max = Arrays.stream(arr).max().getAsInt();
				int min = Arrays.stream(arr).min().getAsInt();
			
				System.out.println(min + " " + max);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("����ġ ���� ���� �߻�");
		}
		
	}

}
