package by.belhard.DR.fourInheritance;

public class Transport {
     String type;
     int year;
     int speed;

    public Transport(String type, int year, int speed) {
        this.type = type;
        this.year = year;
        this.speed = speed;
    }

    public void go(){
        System.out.println("\n"+type+" is going");
    }

    public void show(){
        System.out.print("Тип транспорта - "+type+" год выпуска - "+year);
    }

    public  void sound(){
        System.out.println();
    };

    @Override
    public String toString() {
        return "Transport{" +
                "type='" + type + '\'' +
                ", year=" + year +
                '}';
    }

}
