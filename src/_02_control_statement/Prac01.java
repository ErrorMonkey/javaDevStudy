package _02_control_statement;

import java.util.Scanner;

public class Prac01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("나이를 입력하세요.");
        int age = sc.nextInt();
        int grade;
        if (age <= 7) {
            grade = 0;
        } else if (age <= 13) {
            grade = 1;
        } else if (age <= 16) {
            grade = 2;
        } else if (age <= 19) {
            grade = 3;
        } else {
            grade = 4;
        }

        String result = switch (grade) {
            case 0 -> "유아";
            case 1 -> "초등학생";
            case 2 -> "중학생";
            case 3 -> "고등학생";
            case 4 -> "성인";
            default -> "잘못된 입력입니다.";
        };
        System.out.println(result);

        // switch (grade) {
        // case 0:
        // System.out.println("유아입니다.");
        // break;
        // case 1:
        // System.out.println("초등학생입니다.");
        // break;
        // case 2:
        // System.out.println("중학생입니다.");
        // break;
        // case 3:
        // System.out.println("고등학생입니다.");
        // break;
        // case 4:
        // System.out.println("성인입니다.");
        // break;
        // default:
        // System.out.println("잘못된 입력입니다.");
        // break;
        //
        // }
    }
}
