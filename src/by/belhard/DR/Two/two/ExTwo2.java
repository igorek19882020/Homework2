package by.belhard.DR.Two.two;

public class ExTwo2 {
    public static void main(String[] args) {
        int ar[] = new int[10];
        double result = 0;
        for (int i = 0; i < ar.length; i++) {
            ar[i] = (int) (Math.random() * (10 - 0 + 1));
            System.out.print(ar[i] + "\t");
            result += ar[i];
        }
        System.out.println("\n" + "Сумма всех значений массива = " + result);
        System.out.println("Среднее значение массива = " + result / ar.length);
        for (int i = 0; i < ar.length - 1; i++) {
            for (int j = i + 1; j < ar.length; j++) {
                if (ar[j] < ar[i]) {
                    int buf = ar[j];
                    ar[j] = ar[i];
                    ar[i] = buf;
                }
            }
        }
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + "\t");
        }
        double Md = (ar[10 / 2] + ar[((10 / 2) + 1)]) / 2;//Если это формула актуальная
        System.out.println("\n" + "Медиана = " + Md);
    }
}
