package hw3week;
import java.util.Scanner;
public class hw3 {
    public static void main(String[] args) {
        int x,y;
        Scanner sc = new Scanner(System.in);
        x=sc.nextInt();
        y=sc.nextInt();

        if(x>0 && y>0){
            System.out.println("제 1사분면");
        }
        else if(x<0 && y>0){
            System.out.println("제 2사분면");
        }
        else if(x<0 && y<0){
            System.out.println("제 3사분면");
        }
        else if(x>0 && y<0){
            System.out.println("제 4사분면");
        }

    }

}
