package javaweek5;
import java.util.Scanner;
public class five {
    public static void main(String[] args) {

        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            Scanner sc = new Scanner(System.in);
            array[i] = sc.nextInt();
        }

        for (int j = 0; j < array.length; j++) {
            if (array[j] >= 35 ){
                System.out.println(array[j]);
            }
        }
    }
}
