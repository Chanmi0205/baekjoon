package portfolio_220610;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 두 수 A, B 입력받기
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        // 두 수 비교하고 출력하기
        if ( A > B ) 
            System.out.println(">");

        if ( A < B )
            System.out.println("<");

        if ( A == B )
            System.out.println("==");

    }

}