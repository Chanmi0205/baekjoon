package cant;

import java.util.Scanner;

public class portfolio_220622 {
	public static void main(String[] args) {
		
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        
        if ( text.length() < 1000000 ) {
        	int num = 0;
        	String textLength[] = text.split(" ");
        	System.out.println(textLength.length);
        	
        } else {
        	System.out.println("���ѵ� ���ڿ��� ���̸� �Ѿ����ϴ�.");
        }
	} 
}