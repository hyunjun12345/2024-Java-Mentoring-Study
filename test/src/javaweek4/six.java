package javaweek4;

public class six {
    public static void main(String[] args) {

        while(true){
            int num = (int)(Math.random()*10) +1;
            System.out.println(num);
            if(num == 7){
                break;
            }
        }
    }
}
