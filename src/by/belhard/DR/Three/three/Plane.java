package by.belhard.DR.Three.three;

public class Plane {
    String name;
    String purpose;
    int speed;
    int maxseats;
    int maxs;


    public Plane(String name, String purpose, int speed, int maxseats, int maxs) {
        this.name = name;
        this.purpose = purpose;
        this.speed = speed;
        this.maxseats = maxseats;
        this.maxs = maxs;
    }



    public void show() {
        System.out.println("Модель - " + name + "\n" + "Назначение- " + purpose + "\n" + "Макс. скорость(км/ч)- " + speed + "\n" + "Вместимость - " + maxseats + "\n" + "Макс.дальность полета(км)- " + maxs);
    }

    public double time(double s) {
        return maxs / speed;
    }

    public void fly() {
        System.out.println("Самолет" + name + " находится в полете");
    }

    public void fly(String name, int speed) {
        System.out.println("Самолет "+name+"летит со скоростью "+speed+" км/ч");
    }

}
