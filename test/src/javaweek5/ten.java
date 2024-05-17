package javaweek5;
import java.util.Scanner;
public class ten {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int b = sc.nextInt();
       int c,d;
       int[] a = new int[b];
       for (int i = 0; i < b; i++) {
           a[i] = sc.nextInt();
       }
       for (int i = 0; i < b; i++) {
           if (a[i] < a[i+1]) {
               c = a[i+1];
           }
       }
        for (int i = 0; i < b; i++) {
            if (a[i] > a[i+1]) {
                c = a[i+1];
            }
        }
       System.out.println(c);

    }
}
