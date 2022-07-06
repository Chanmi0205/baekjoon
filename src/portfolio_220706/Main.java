package portfolio_220706;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();

        int Case[][] = new int[T][3];
        int num[][] = new int[T][2];
        
        for(int i=0; i<num.length; i++) {
        	for(int j=0; j<num[i].length; j++) {
        		num[i][j] = scan.nextInt();
        	}
        }
        
        for(int i=0; i<num.length; i++) {
        	for(int j=0; j<num[i].length; j++) {
        		Case[i][j] = num[i][j];
        	}
        }
        
        for(int i=0; i<Case.length; i++) {
        	for(int j=0; j<num[i].length; j++) {
        		Case[i][2] += num[i][j];
        	}
        }
        
        for(int i=0; i<Case.length; i++) {
        	for(int j=0; j<1; j++) {
        		System.out.print("Case #"+(i+1)+": " + Case[i][0] + " + " + Case[i][1] + " = " + Case[i][2]);
        	}
        	System.out.println();
        }
        
	}

}
