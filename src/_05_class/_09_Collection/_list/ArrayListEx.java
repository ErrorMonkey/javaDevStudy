package _05_class._09_Collection._list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {
    public static void main(String[] args) {
        // ArrayList 컬렉션 생성
        List<Book> books = new ArrayList<>();

        // 객체 추가
        books.add(new Book("신세계로","기시 유스케"));
        books.add(new Book("아웃","기리노 나쓰오"));
        books.add(new Book("이해","테드 창"));
        books.add(new Book("영원의 끝","아이작 아시모프"));
        System.out.println(books);

        // 리스트 개수 얻기
        int size = books.size();
        System.out.printf("총 %d 권의 책이 존재합니다. %n%n", size);

        // 특정 인덱스 객체 가져오기
        Book thirdBook = books.get(2);
        System.out.println(thirdBook);

        // 인덱스로 특정 객체 삭제
        books.remove(2);

        // 반복문으로 모든 객체 하나씩 가져오기
        for (Book book : books) {
            System.out.println(book);
        }

        // 모든 객체 삭제
        System.out.println("객체가 비어 있나요? " + books.isEmpty());
        books.clear();
        System.out.println("객체가 비어 있나요? " + books.isEmpty());

    }
}
