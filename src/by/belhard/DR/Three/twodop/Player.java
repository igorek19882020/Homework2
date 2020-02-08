package by.belhard.DR.Three.twodop;

import java.util.Scanner;

public class Player {
    public void r() {
        double x = 0;
        double y = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите координату x ");
        x = sc.nextDouble();
        System.out.println("Введите координату y ");
        y = sc.nextDouble();
        System.out.println("Текущee положение Player:(" + (x + "," + y) + ")");
    }

    public void Q() {
        double x = 0;
        double y = 0;
        double x1 = 0;
        double y1 = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите координату x ");
        x = sc.nextDouble();
        System.out.println("Введите координату y ");
        y = sc.nextDouble();
        System.out.println("Введите координату x1 ");
        x1 = sc.nextDouble();
        System.out.println("Введите координату y1 ");
        y1 = sc.nextDouble();
        double S = Math.sqrt((x1 - x) * (x1 - x) + (y1 - y) * (y1 - y));
        System.out.println("Player проделал путь равный = " + S);
    }
}
