package javaweek4;

public class eleven {
    public static void main(String[] args) {
        for (int i = 1; i < 20; i++) {
            System.out.println(i);
            if (i % 17 == 0) {
                break;
            }
        }

        int j = 1;
        while (j < 20) {
            System.out.println(j);
            if (j % 17 == 0) {
                break;
            }
        }
    }
}
