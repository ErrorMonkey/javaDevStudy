package _04_exeption;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Prac01 {

    public static void main(String[] args) {
        Prac01 prac01 = new Prac01();

        prac01.prac01();
        prac01.prac02();
        prac01.prac03();
    }

    public void prac01() {
        int[] arr = {1, 2, 3, 4};
        try {
            for (int i = 0; i <= 5; i++) {
                System.out.println(arr[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("인덱스를 벗어났습니다.");
        }
    }

    public void prac02() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("첫 번째 배열 크기를 입력하세요: ");
            int inputNumber = sc.nextInt();
            if (inputNumber <= 0) {
                throw new IllegalArgumentException("배열 크기는 1 이상이어야 합니다.");
            }
            int[] arr1 = new int[inputNumber];
            System.out.println(inputNumber + "개의 정수를 입력하세요: ");
            int sum = 0;
            for (int i = 0; i < arr1.length; i++) {
                arr1[i] = sc.nextInt();
                sum += arr1[i];
            }
            double average = (double) sum / arr1.length;
            System.out.println("배열 요소의 평균은: " + average);

        } catch (InputMismatchException err) {
            System.out.println(err.toString() + ": 잘못된 입력 형식입니다. 정수를 입력하세요.");
        } catch (IllegalArgumentException err) {
            System.out.println(err.getMessage());
        } catch (NegativeArraySizeException err) {
            System.out.println(err.toString() + ": 양수를 입력하세요.");
        } catch (OutOfMemoryError err) {
            System.out.println(err.toString() + ": 너무 큰 숫자를 입력했습니다.");
        }
    }

    public void prac03() {
//        ArrayList<Integer> arr1 = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("두 번째 배열 크기를 입력하세요: ");
        int arrSize = sc.nextInt();
        if (arrSize <= 0) {
            throw new IllegalArgumentException("배열 크기는 1 이상이어야 합니다.");
        }
        int[] arr = new int[arrSize];

        System.out.printf("배열 요소를 %d 개 입력하세요: ", arrSize).println();

        for (int i = 0; i < arrSize; i++) {
            arr[i] = sc.nextInt();
        }
        // 중복된 요소 찾기
        ArrayList<Integer> duplicates = findDuplicate(arr);

        // 중복된 요소 출력
        if (duplicates.isEmpty()) {
            System.out.println("중복된 요소가 없습니다.");
        } else {
            System.out.println("중복된 요소: " + duplicates);
        }
    }
    public static ArrayList<Integer> findDuplicate(int[] arr) {
        ArrayList<Integer> duplicates = new ArrayList<>();
        for (int i = 0; i < arr.length - 1; i++) {
            // 1 2 3 4 5
            // 1에 대해서 2, 3, 4, 5 => i = 0, j = 1 ~ length -1
            // 2에 대해서 3, 4, 5 중복 비교
            // 3에 대해서 4, 5
            // 4에 대해서 5
            for (int j = i + 1; j < arr.length; j++) {
                // 1 2 1 1
//                if (arr[i] == arr[j]) {
                if (arr[i] == arr[j] && !duplicates.contains(arr[i])) {
                    // 중복된 요소만 추가
                    duplicates.add(arr[i]);
                    // -> duplicates: 1
                }
            }
        }
        return duplicates;
    }
}
