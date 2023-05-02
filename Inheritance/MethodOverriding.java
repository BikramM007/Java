package Inheritance;


class car{
    public void start(){
        System.out.println("Car started");
    }
    public void accelerate(){
        System.out.println("Car  is accelerate");
    }
    public void changeGear(){
        System.out.println("Car gear change");
    }
}
class LuxaryCar extends car{
    public void changeGear() {
        System.out.println("Automatic Gear");
    }
    public void openRoof() {
        System.out.println("Sun roof is open");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
            car c = new car();
            c.start();
            c.accelerate();
            c.changeGear();
    }
}
