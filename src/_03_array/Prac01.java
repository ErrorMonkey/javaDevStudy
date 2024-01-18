package _03_array;

import java.util.Scanner;

public class Prac01 {

  public static void main(String[] args) {
    System.out.println("5개의 정수를 입력하세요");
    Scanner sc = new Scanner(System.in);
    int[] arr = new int[5];

    int average = 0;
    for (int i : arr) {
      i = sc.nextInt();
      average += i;
    }

    System.out.println("평균은: " + (average / arr.length));
  }
}
