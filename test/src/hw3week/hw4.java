package hw3week;
import java.util.Scanner;
public class hw4 {
    public static void main(String[] args) {
        int myYear;
        Scanner sc = new Scanner(System.in);
        myYear = sc.nextInt();

        if (myYear % 4 == 0 && myYear % 100 != 0) {
            System.out.println("1");
        }
        else if (myYear % 400 == 0) {
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }
    }

}
