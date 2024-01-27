package _05_class._09_Collection;

import java.util.HashSet;
import java.util.Scanner;

public class Prac01_Collection {
    public static void main(String[] args) {
        HashSet<Integer> inputSet = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("정수를 입력하세요. -1을 입력하면 종료됩니다.");
        while (true) {
            int inputInt = sc.nextInt();
            System.out.println("정수 입력: " + inputInt);
            if (inputInt == -1) break;
            inputSet.add(inputInt);
        }

        System.out.println("중복 제거된 정수 목록: " + inputSet);

    }
}
