package _05_class._05_abstract;

public class Square extends Shape {
    public Square(String color, String type, int width, int height) {
        super(color, type);
        this.width = width;
        this.height = height;
    }
    int width;
    int height;
    void draw() {
        System.out.println("사각형 그리기!");
    }
    @Override
    double getArea() {
        return width * height;
    }
}
