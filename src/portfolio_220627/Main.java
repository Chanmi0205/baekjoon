package portfolio_220627;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int studentScore[] = new int[5];
		int Allscore = 0;
		
		for(int i=0; i<studentScore.length; i++) {
			studentScore[i] = scan.nextInt();
			if (0 <= studentScore[i] && studentScore[i] <= 100 && studentScore[i] % 5 == 0) {
				
				if ( studentScore[i] < 40 ) {
					Allscore += 40;
				} else if ( studentScore[i] >= 40 ) {
 				Allscore += studentScore[i];
				}
				
			} else {
				System.out.println("�߸��� �Է°��Դϴ�");
			}
		}
		
		System.out.println(Allscore / 5);
	}

}
