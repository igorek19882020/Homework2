package by.belhard.DR.Three.three;



public class Main {
    public static void main(String[] args) {
        Plane b = new Plane("Boeing","пассажирский", 925, 200, 18500);
        b.show();
        double time1 = b.time(15000);
        System.out.println("Самолет"+  "b пролетит 15000 км за - " + time1);
        b.fly("Ил-96 ",900);

    }
}
