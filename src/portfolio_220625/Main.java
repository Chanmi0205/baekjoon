package portfolio_220625;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int sum = scan.nextInt();
		int bookPrice[] = new int[9];
		
		for(int i=0; i<bookPrice.length; i++) {
			bookPrice[i] = scan.nextInt();
			if ( bookPrice[i] <= 10000 )
				sum -= bookPrice[i];
			else
				System.out.println("���ǿ� ���� ���� å�� ������ �Է¹޾ҽ��ϴ�.");
		}
		
		System.out.println(sum);
  }
}
