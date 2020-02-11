package by.belhard.DR.fourInheritance;

public class Plane extends Transport {
    private String finalPoint;
    private double length;

    public Plane(String type, int year, int speed, String finalPoint, double length) {
        super(type, year, speed);
        this.finalPoint = finalPoint;
        this.length = length;
    }

    public void time() {
        System.out.println(type + " пролетит " + length + " км за " + length / speed + " ч");
    }

    @Override
    public void go() {
        super.go();
    }

    @Override
    public void show() {
        super.show();
    }

    public void sound() {
        super.sound();
        System.out.println(type + " издает звук- ууууууу");
    }

    @Override
    public String toString() {
        return " Plane{" +
                "finalPoint='" + finalPoint + '\'' +
                ", length=" + length +
                ", type='" + type + '\'' +
                ", year=" + year +
                ", speed= " + speed +
                '}';
    }
}
