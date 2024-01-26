package _05_class._06_interface;

public class Prac02_Vehicle {
    public static void main(String[] args) {
        Car car = new Car("tesla", 10);
        Airplan airplan = new Airplan("ufo", 100);
        // Vehicle 이 더 상위 클래스라 서브 클래스는 형변환이 되어 들어감
        Vehicle[] vehicles = {car, airplan};
        System.out.println(vehicles[0].getClass());

        Flyable flyable = airplan;
        Airplan air = (Airplan) flyable;

        for (Vehicle vehicle : vehicles) {
            vehicle.move();

            // 상위 -> 하위: () 명시
            // 하위 -> 상위: 생략 가능
            if(vehicle instanceof Flyable) {
                ((Flyable) vehicle).fly(); // 형 변환(캐스팅)
            }
        }
    }
}

class Car extends Vehicle {
    Car(String name, int maxSpeed) {
        super(name, maxSpeed);
    }
    @Override
    void move() {
        System.out.println("도로를 따라 이동 중");
    }
}

class Airplan extends Vehicle implements Flyable {
    Airplan(String name, int maxSpeed) {
        super(name, maxSpeed);
    }

    @Override
    public void fly() {
        System.out.println("고도 10,000피트에서 비행 중");
    }

    @Override
    void move() {
        System.out.println("하늘을 날아가는 중");
    }
}

abstract class Vehicle {
    String name;
    int maxSpeed;

    Vehicle(String name, int maxSpeed) {
        this.name = name;
        this.maxSpeed = maxSpeed;
    }
    public String getName() {
        return name;
    }
    public int getMaxSpeed() {
        return maxSpeed;
    }
    abstract void move();
}

interface Flyable {
    public void fly();
}