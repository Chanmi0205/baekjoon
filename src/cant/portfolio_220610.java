package cant;

import java.util.Scanner;

public class portfolio_220610 {
    public static void main(String[] args) {

        try {
        Scanner scanner = new Scanner(System.in);

        // ��
        int A = scanner.nextInt();

        // ��
        int B = scanner.nextInt();

        // ��
        int C = scanner.nextInt();

        // �丮�ϴµ� �ʿ��� �ð�
        Scanner scanner2 = new Scanner(System.in);
        int D = scanner2.nextInt();

        // �� : A(0<=A<=23), �� : B(0<=B<=59), �� : C(0<=C<=59)
        if ( 0 <= A && A <= 23 && 0 <= B && B <= 59 && 0 <= C && C <= 59 && 0 <= D && D <= 500000 ) {

            // ��
            int second = D % 60;
            // ��
            int minute = D / 60;
            // �� 
            int hour = 0;
            if ( minute > 60 ) {
                hour = minute/60;
                minute %= 60;
            }

            A += hour;
            B += minute;
            C += second;

            // ��(60�ʸ� ���� ���) -> ��
            if ( C >= 60 ) {
                B = B + (C/60);
                C = C % 60;
            }

            // ��(60���� ���� ���) -> ��
            if ( B >= 60 ) {

                A = A + (B/60);
                B = B % 60;
            }

            if ( A == 24 ) 
                A = 0;

            // �ð�(24�ð� ���� ���) 
            if ( A > 24 ) {
                A  = (A/24) + (A%24); 
            }

            System.out.println(A + " " + B + " " + C);
        } 

        else {
            System.out.println("�߸��� �Է°��Դϴ�.");
        }

    } catch(Exception e) {
        System.out.println("���� �߻�");
    }
  }

}