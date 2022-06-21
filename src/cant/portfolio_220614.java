package cant;
import java.util.Scanner;

public class portfolio_220614 {
    public static void main(String[] args) {

        String name[] = new String[50];

        name[0] = "joonas";
        name[1] = "beakjoon";

        Scanner scan = new Scanner(System.in);
//        int Grade = scan.nextInt();

        String test = scan.nextLine();

        for(int i=0; i<name.length; i++) {
            if ( name[i].equals(test) ) {
                System.out.println(test + "??!");
            }
        }
    }

}
