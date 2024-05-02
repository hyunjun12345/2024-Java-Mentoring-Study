package homework4week;

import java.util.Scanner;

public class five {
    public static void main(String[] args) {

        int a ;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if (a <= 100 && a >= 0)
        {
            for (int n = 1; n <= a; n++) {
                for (int k = n; k < a; k++) {
                    System.out.print(" ");
                }

                for (int j = 0; j < n; j++) {
                    System.out.print("*");
                }
                System.out.println();

            }

        }

        else
        {
            System.out.println("0과 100 사이로 입력해주세요");
        }
    }
}
