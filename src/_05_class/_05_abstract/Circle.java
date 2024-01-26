package _05_class._05_abstract;

// 구체적인 클래스
public class Circle extends Shape {
    double radius;
    public Circle(String color, String type, double radius) {
        super(color, type);
        this.radius = radius;
    }
    void draw() {
        System.out.println("원 그리기!");
    }

    @Override
    double getArea() {
        return radius * radius * Math.PI;
    }
}
