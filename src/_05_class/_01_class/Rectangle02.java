package _05_class._01_class;

import java.util.ArrayList;
import java.util.Scanner;

public class Rectangle02 {
    private static int count = 0;
    private int width;
    private int height;
    public void setWidth(int w) {
        this.width = w;
    }
    public void setHeight(int h) {
        this.height = h;
    }
    public int getWidth() {
        return this.width;
    }
    public int getHeight() {
        return this.height;
    }
    public int getRectArea() {
        return width * height;
    }
    public static int getCount() {
        return count;
    }

    public Rectangle02(int w, int h) {
        setWidth(w);
        setHeight(h);
        count++;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Rectangle02> rectArr = new ArrayList<>();

        while (true) {
            System.out.println("가로, 세로 길이를 띄어쓰기 해서 입력: ");
            int w = sc.nextInt();
            int h = sc.nextInt();
            if (w == 0 && h == 0) break;

            Rectangle02 inputRect = new Rectangle02(w, h);
            rectArr.add(inputRect);
        }
        for (Rectangle02 rect : rectArr) {
            System.out.println("가로 길이는: " + rect.getWidth());
            System.out.println("세로 길이는: " + rect.getHeight());
            System.out.println("넓이는: " + rect.getRectArea());
            System.out.println("=============================");
        }
        System.out.println("Rectangle 인스턴스의 개수는: " + Rectangle02.getCount());
        sc.close();
    }

}
