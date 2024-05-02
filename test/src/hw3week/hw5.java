package hw3week;
import java.util.Scanner;
public class hw5 {
    public static void main(String[] args) {

        int firstNum, secondNum;
        Scanner sc = new Scanner(System.in);
        firstNum = sc.nextInt();
        secondNum = sc.nextInt();

        if (firstNum > secondNum) {
            System.out.println('>');
        } else if (firstNum < secondNum) {
            System.out.println('<');
        } else if (firstNum == secondNum) {
            System.out.println('=');
        }

    }
}