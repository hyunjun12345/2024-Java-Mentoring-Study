package homework4week;
import java.util.Scanner;
public class three {
    public static void main(String[] args) {

        int a , b ,  c;
        Scanner sc = new Scanner(System.in);
        c = sc.nextInt();

        for (int i = 1; i <= c; i++) {

            a = sc.nextInt();
            b = sc.nextInt();
            if( a < 10 && a> 0 && b < 10 && b> 0) {
                System.out.println("#case" + i + ":" + (a + b));
            }
            else
            {
                System.out.println("error404 : 계산 불가");
            }



        }
    }
}
