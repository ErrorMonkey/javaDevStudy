package _05_class._09_Collection;

import java.util.*;

public class Prac02_Collection {
    public static void main(String[] args) {
        HashMap<String, Integer> inputMap = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("이름과 나이를 입력하세요. '종료'를 입력하면 종료됩니다.");
        while (true) {
            String name = sc.next();
            if (name.equals("종료")) break;
            System.out.println("입력된 이름: " + name);
            Integer age = sc.nextInt();
            System.out.println("입력된 나이: " + age);
            inputMap.put(name, age);
        }


        System.out.println("=== 입력 받은 이름과 나이 목록 ===");

        System.out.println("--- map 의 entrySet 으로 출력 ---");
        for (Map.Entry<String, Integer> entry : inputMap.entrySet()) {
            System.out.println("entry key: " + entry.getKey() + ", entry value: " + entry.getValue());
        }

        Iterator<Map.Entry<String, Integer>> inputEntrySet = inputMap.entrySet().iterator();
        System.out.println("--- entrySet + iterator 활용해서 출력 ---");
        while (inputEntrySet.hasNext()) {
            Map.Entry<String, Integer> input = inputEntrySet.next();
            String name = input.getKey();
            Integer age = input.getValue();
            System.out.printf("이름: %s, 나이: %d", name, age).println();
        }


    }
}
