package by.belhard.DR.Three.two;

import java.util.Scanner;

public class Player {

    public void s() {

        double x = 0;
        double y = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите координату x ");
        x = sc.nextDouble();
        System.out.println("Введите координату y ");
        y = sc.nextDouble();
        System.out.println("Текущая координата х - " + x + " Текущая координата y - " + y);
    }

}
