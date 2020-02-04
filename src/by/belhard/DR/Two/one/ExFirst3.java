package by.belhard.DR.Two.one;

public class ExFirst3 {
    public static void main(String[] args) {
        int ar[] = new int[101];
        for (int i = 10; i <= 19; i++) {
            ar[i] = i;
            if (ar[i] % 5 == 0 || ar[i] % 7 == 0) {
                if (i % 5 == 0 && i % 7 == 0) {
                    continue;
                }
                System.out.print(ar[i] + " ");
            }
        }
        for (int i = 30; i <= 39; i++) {
            ar[i] = i;
            if (ar[i] % 5 == 0 || ar[i] % 7 == 0) {
                if (i % 5 == 0 && i % 7 == 0) {
                    continue;
                }
                System.out.print(ar[i] + " ");
            }
        }
        for (int i = 50; i <= 59; i++) {
            ar[i] = i;
            if (ar[i] % 5 == 0 || ar[i] % 7 == 0) {
                if (i % 5 == 0 && i % 7 == 0) {
                    continue;
                }
                System.out.print(ar[i] + " ");
            }
        }
        for (int i = 70; i <= 79; i++) {
            ar[i] = i;
            if (ar[i] % 5 == 0 || ar[i] % 7 == 0) {
                if (i % 5 == 0 && i % 7 == 0) {
                    continue;
                }
                System.out.print(ar[i] + " ");
            }
        }
        for (int i = 90; i <= 99; i++) {
            ar[i] = i;
            if (ar[i] % 5 == 0 || ar[i] % 7 == 0) {
                if (i % 5 == 0 && i % 7 == 0) {
                    continue;
                }
                System.out.print(ar[i] + " ");
            }
        }
    }
}
