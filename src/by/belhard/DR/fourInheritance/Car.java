package by.belhard.DR.fourInheritance;

public class Car extends Transport {
    private String model;

    public Car(String type, int year, int speed, String model) {
        super(type, year, speed);
        this.model = model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void go() {
        super.go();
    }

    public void show() {
        super.show();
        System.out.println(" марка - " + model + " скорость -" + speed);
    }

    public void sound() {
        super.sound();
        System.out.println(model + "издает звук - пжжжжжж");
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", speed=" + speed +
                ", type='" + type + '\'' +
                ", year=" + year +
                '}';
    }
}

