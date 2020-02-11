package by.belhard.DR.fourInheritance;

public class Main {
    public static void main(String[] args) {

        Plane airbus = new Plane("Plane", 1991, 800, "Moscow", 8000);
        airbus.show();
        airbus.go();
        airbus.time();
        airbus.sound();
        System.out.println(airbus.toString());
    }
}
