package portfolio_220610;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // �� �� A, B �Է¹ޱ�
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        // �� �� ���ϰ� ����ϱ�
        if ( A > B ) 
            System.out.println(">");

        if ( A < B )
            System.out.println("<");

        if ( A == B )
            System.out.println("==");

    }

}