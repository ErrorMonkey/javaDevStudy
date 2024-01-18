package _02_control_statement;

import java.util.Scanner;

public class Prac04 {
    public static void main(String[] args) {

        Prac04 mtd = new Prac04();

        Scanner sc = new Scanner(System.in);
        System.out.println("숫자 두 개를 입력하세요");
        double first = sc.nextDouble();
        double second = sc.nextDouble();

        mtd.calc(first, second);
        sc.close();

    }
    public void calc(double x, double y) {
        // 소수점 한 자리만 보여준다
        System.out.printf("덧셈 결과: %.1f", x + y).println();
        System.out.println("뺄셈 결과: " + (x - y));
        System.out.println("나눗셈 결과: " + (x / y));
        System.out.println("곱셈 결과: " + (x * y));
    };


}
