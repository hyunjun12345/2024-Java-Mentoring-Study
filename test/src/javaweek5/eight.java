package javaweek5;

public class eight {
    public static void main(String[] args) {
        int [][] a = {{1,2}, {3,4,5}};

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]);
            }
        }
    }
}
