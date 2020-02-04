package by.belhard.DR.Two.two;

public class ExTwo1 {
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
    }
}
