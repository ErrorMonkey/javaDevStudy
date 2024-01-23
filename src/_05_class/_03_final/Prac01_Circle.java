package _05_class._03_final;

import java.util.Scanner;

public class Prac01_Circle {
    static final double PI = 3.14592;
    private final double radius;
    Prac01_Circle(double r) {
        this.radius = r;
    }
    public double calculateArea() {
        return 2 * PI * radius;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("원의 반지름 입력: ");
        double r = sc.nextDouble();
        Prac01_Circle circle = new Prac01_Circle(r);
        System.out.println("원의 반지름: " + circle.radius);
        System.out.println("원의 넓이: " + circle.calculateArea());

    }
}
