package _05_class._04_inheritance;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Prac02_Vehicle {
    public static void main(String[] args) {
        Car car = new Car("hyundai","sonata",2024,false);
        Bus bus = new Bus("kia", "bongo", 2017, 6);

        car.getVegicleInfo();
        car.startUp();
        car.working();

        bus.getVegicleInfo();
        bus.startUp();
        bus.working();
    }
}
class Vehicle {
    String brand;
    String model;
    int year;
    public void setVehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
    public void getVegicleInfo() {
        System.out.println("===" + this.getClass().getSimpleName() + " 정보 ===");
        System.out.printf(this.getClass().getSimpleName() + " = {brand: \"%s\", model: \"%s\", year: \"%d\"}", brand, model, year).println();
    }
    public void startUp() {
        System.out.println("시동을 걸었습니다.");
    }
    public void working () {
        System.out.println("차량이 작동합니다.");
    }
}

class Car extends Vehicle {
    boolean convertible;
    public Car(String brand, String  model, int year, boolean convertible) {
        this.setVehicle(brand, model, year);
        this.convertible = convertible;
    }
    @Override
    public void working () {
        System.out.println("직장까지 운전합니다.");
    }
}

class Bus extends Vehicle {
    int passengerCapacity;
    public Bus(String brand, String  model, int year, int passengerCapacity) {
        this.setVehicle(brand, model, year);
        this.passengerCapacity = passengerCapacity;
    }
    @Override
    public void working() {
        System.out.println("승객을 운송합니다.");
    }
}
