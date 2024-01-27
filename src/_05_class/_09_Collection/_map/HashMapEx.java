package _05_class._09_Collection._map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx {
    public static void main(String[] args) {
        // 키 id, 값은 name 인 HashMap 예제

        // Map 컬렉션 생성
        Map<Integer, String> map = new HashMap<>();

        // 객체 저장
        map.put(1001, "김철수");
        map.put(1002, "이영희");
        map.put(1003, "박민지");
        map.put(1004, "강영수");

        // 전체 객체 수
        int size = map.size();
        System.out.printf("총 %d 명의 학생이 있습니다. %n%n", size);

        // 키로 값을 얻기
        int key = 1003;
        String value = map.get(key);
        System.out.printf("%d 번에 해당하는 학생은 %s 입니다. %n%n", key, value);

        // 키와 값으로 구성된 모든 Map.Entry 객체를 Set 에 담아 리턴
        Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
        System.out.println(entrySet);

        // import java.util.Map;
        // Map 생략하고 쓸 시에는 import 해줘야 함
        // Iterator<Entry<Integer, String>> entryIterator = entrySet.iterator();
        Iterator<Map.Entry<Integer, String>> entryIterator = entrySet.iterator();
        while (entryIterator.hasNext()) {
            Map.Entry<Integer, String> entry = entryIterator.next();
            Integer mapKey = entry.getKey();
            String mapValue = entry.getValue();
            System.out.printf("%s 학생은 %d 번 입니다.", mapValue, mapKey).println();
        }

        // 키 Set 컬렉션을 얻고, 반복해서 키와 값 얻기
        Set<Integer> keySet = map.keySet();
        System.out.println(keySet);

        // 주어진 키와 일치하는 entry 삭제
        String deleteValue = map.remove(key);
        System.out.printf("%s 학생이 삭제됐습니다.", deleteValue).println();
    }
}
