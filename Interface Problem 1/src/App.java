class Vehicle {
    int speed;
    Vehicle(){

    }
    Vehicle(int x) {
        speed = x;
    }

    public void applybreak() {
        speed--;
    }

    public void speedup() {
        speed++;
    }
}

class Bicycle extends Vehicle {
    String name;
    int gear;

    public Bicycle(String bname, int bgear) {
        name = bname;
        gear = bgear;
    }

    public void show() {
        System.out.println("Bicycle name: " + name);

        System.out.println("Bicycle gear: " + gear);

    }
}

class Car extends Vehicle {
    String name;
    int gear;

    public Car(String cname, int cgear) {
        name = cname;
        gear = cgear;
    }

    public void show() {
        System.out.println("Car name: " + name);

        System.out.println("Car gear: " + gear);

    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Bicycle ob1 = new Bicycle("Phoenix", 5);
        ob1.show();
        Car ob2 = new Car("BMW", 5);
        ob2.show();
        ob1.speed = 25;
        System.out.println("Bicycle speed: " + ob1.speed);
        ob1.speedup();
        System.out.println("Bicycle speed: " + ob1.speed);
        ob1.applybreak();
        System.out.println("Bicycle speed: " + ob1.speed);
        ob2.speed = 25;
        System.out.println("Car speed: " + ob2.speed);
        ob2.speedup();
        System.out.println("Car speed: " + ob2.speed);
        ob2.applybreak();
        System.out.println("Car speed: " + ob2.speed);

    }
}
