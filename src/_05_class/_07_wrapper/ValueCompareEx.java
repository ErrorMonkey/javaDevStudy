package _05_class._07_wrapper;

// 포장 값 비교
// - 포장 객체 내부 값을 비교할 때 ==, != 연산자 불가능
// .equals() 메소드 이용
// 다만, 특정 범위에 포함되는 값은 포장 객체 끼리 공유된다(같은 참조값) 그래서 비교 연산자 사용 가능
// 대부분의 포장 클래스에는 "parse + 기본 타입" 명으로 된 static 메소드 존재 => 기본 타입으로 변환할 때 사용

public class ValueCompareEx {
    public static void main(String[] args) {
        // -128 ~ 127 이내 값을 갖는 경우
        Integer obj1 = 10;
        Integer obj2 = 10;
        System.out.printf("%d == %d : %b%n", obj1, obj2, obj1 == obj2); // true

    }
}
