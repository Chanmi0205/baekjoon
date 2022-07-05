package portfolio_220705;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        // N보다 큰 5의 최소공배수
        int x = 0;
        int i = 0;
        boolean test = false;

        while( x < N ) {
                x += 5;
                i++;
        }

        while(N != x) {
            if( x > N ) {
                x -= 5;
                x += 3;
                i++;
            } else if ( x < N ) {
                x += 1;
                i = i + 2;
            } 
            i--;
        }

        Loop1:
        for(int a=0; a<=i; a++) {
            for(int b=0; b<=i; b++) {
                if( N == a*5 + b*3 ) {
                    test = true;
                    break Loop1;
                } else {
                    test = false;
                }
            }
        }

        if ( test == true ) {
            System.out.println(i);
        } else {
            System.out.println("-1");
        }

    }
}
