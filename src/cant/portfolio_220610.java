package cant;

import java.util.Scanner;

public class portfolio_220610 {
    public static void main(String[] args) {

        try {
        Scanner scanner = new Scanner(System.in);

        // 시
        int A = scanner.nextInt();

        // 분
        int B = scanner.nextInt();

        // 초
        int C = scanner.nextInt();

        // 요리하는데 필요한 시간
        Scanner scanner2 = new Scanner(System.in);
        int D = scanner2.nextInt();

        // 시 : A(0<=A<=23), 분 : B(0<=B<=59), 초 : C(0<=C<=59)
        if ( 0 <= A && A <= 23 && 0 <= B && B <= 59 && 0 <= C && C <= 59 && 0 <= D && D <= 500000 ) {

            // 초
            int second = D % 60;
            // 분
            int minute = D / 60;
            // 시 
            int hour = 0;
            if ( minute > 60 ) {
                hour = minute/60;
                minute %= 60;
            }

            A += hour;
            B += minute;
            C += second;

            // 초(60초를 넘은 경우) -> 분
            if ( C >= 60 ) {
                B = B + (C/60);
                C = C % 60;
            }

            // 분(60분이 넘은 경우) -> 시
            if ( B >= 60 ) {

                A = A + (B/60);
                B = B % 60;
            }

            if ( A == 24 ) 
                A = 0;

            // 시간(24시가 넘은 경우) 
            if ( A > 24 ) {
                A  = (A/24) + (A%24); 
            }

            System.out.println(A + " " + B + " " + C);
        } 

        else {
            System.out.println("잘못된 입력값입니다.");
        }

    } catch(Exception e) {
        System.out.println("오류 발생");
    }
  }

}

// 문제 : https://www.acmicpc.net/problem/2530
