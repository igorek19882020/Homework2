package by.belhard.DR.Two.one;

public class ExFirst1 {
    public static void main(String[] args) {
        int ar[] = new int[101];
        for (int i = 1; i <= 100; i++) {
            ar[i] = i;
            if (ar[i] % 3 == 0 & ar[i] % 7 == 0) {
                System.out.print(ar[i]+" ");
            }
        }
    }

}
