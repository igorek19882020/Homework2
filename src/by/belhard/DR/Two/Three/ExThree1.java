package by.belhard.DR.Two.Three;

import java.util.Arrays;

public class ExThree1 {
    public static void main(String[] args) {
        int n = 3;
        int a1[][] = new int[n][];
        int k = 5;

        for (int i = 0; i < n; i++) {
            a1[i] = new int[i + 1];
        }
        for (int i = 0; i < a1.length; i++) {
            for (int j = 0; j < a1[i].length; j++) {
                a1[i][j] = k;
                k *= 2;
                System.out.print(a1[i][j] + " ");
            }
            System.out.println();
        }
    }
}