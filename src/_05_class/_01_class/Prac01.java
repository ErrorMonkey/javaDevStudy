package _05_class._01_class;

import java.util.Scanner;
public class Prac01 {
    public static void main(String[] args) {
        Rectangle test = new Rectangle();
        test.getArea();
    }
}

class Rectangle {
    public int width;
    public  int height;
    public void getArea() {
        Scanner sc = new Scanner(System.in);
        System.out.println("사각형의 가로, 세로 길이를 띄어쓰기 기준으로 입력하세요.");
        width = sc.nextInt();
        height = sc.nextInt();
        System.out.println(width * height);
    }
}