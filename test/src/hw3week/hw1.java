package hw3week;

import java.util.Scanner;

public class hw1 {
    public static void main(String[] args) {
        int grade;

        Scanner sc = new Scanner(System.in);
        grade = sc.nextInt();

        if (grade >= 90 && grade <= 100) {
            System.out.println("A");
        }
        else if (grade >= 80 && grade < 90) {
            System.out.println("B");
        }
        else if (grade >= 70 && grade < 80) {
            System.out.println("C");
        }
        else if (grade >= 60 && grade < 70) {
            System.out.println("D");
        }
        else if (grade < 60 && grade >= 0) {
            System.out.println("F");
        }
        else{
            System.out.println("다시 입력해주세요");
        }
    }
}
