package by.belhard.DR.fourInheritance;

public class Ship extends Transport {
    private String kurs;

    public Ship(String type, int year, int speed, String kurs) {
        super(type, year, speed);
        this.kurs = kurs;
    }

    @Override
    public void go() {
        super.go();
    }

    public void show() {
        System.out.print("Тип транспорта - " + type + " год выпуска - " + year + " курс " + kurs);
    }

    public void sound() {
        super.sound();
        System.out.println(type + " издает звук - бульбуль");
    }

    @Override
    public String toString() {
        return "Ship{" +
                "kurs='" + kurs + '\'' +
                ", type='" + type + '\'' +
                ", year=" + year +
                ", speed=" + speed +
                '}';
    }
}
