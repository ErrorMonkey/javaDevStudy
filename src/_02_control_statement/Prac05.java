package _02_control_statement;

public class Prac05 {
    public static void main(String[] args) {

        Prac05 ol = new Prac05();

        ol.getArea(3);
        ol.getArea(3,9);
        ol.getArea(9.0,3.0);
    }
    public void getArea(int r) {
        System.out.printf("반지름이 %d인 원의 넓이: %.3f", r, r * r * Math.PI).println();
    }
    public void getArea(int x, int y) {
//        System.out.println("직사각형의 넓이: " + (x * y));
        System.out.printf("가로 %d, 세로 %d인 직사각형의 넓이: %d", x, y, x * y ).println();
    }
    public void getArea(double w, double h) {
//        System.out.println("삼각형의 넓이: " + ((x * y)/2));
        System.out.printf("가로 %.3f, 세로 %.3f인 직사각형의 넓이: %.3f", w, h, w * h / 2 ).println();
    }
}
