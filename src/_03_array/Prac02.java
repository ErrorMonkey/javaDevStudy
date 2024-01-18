package _03_array;

import java.util.ArrayList;
import java.util.Scanner;

public class Prac02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> chatArr = new ArrayList<>();

        String inputText = "";

        while (!(inputText.equals("exit"))) {
            System.out.println("문자를 입력해주세요:");
            inputText = sc.nextLine();
            chatArr.add(inputText);
        }

        for (String chat : chatArr){
            System.out.println(chat);
        }
        sc.close();
    }
}
