package homework4week;
import java.util.Scanner;

public class one {
    public static void main(String[] args) {

        int a , b , i , j = 1;

        Scanner sc = new Scanner(System.in);
        i = sc.nextInt();
        while (j <= i){

            j++;
            a = sc.nextInt();
            b = sc.nextInt();

            if( a < 10 && a> 0 && b < 10 && b> 0) {
                System.out.print((a + b));
                System.out.println();
            }
            else
            {
                System.out.println("계산 불가");
            }

        }


    }
}
