package _01_basic_syntax;

public class DataTypes {
    public static void main(String[] args) {
        char name1; // o
        // int 2name; // 숫자 첫 글자 불가능
        int name2;
        int _te$t; //
        // char for; // 예약어 사용 불가

//      Primitive Type
        System.out.println("--- 기본형 ---");
        //  정수형 변수 선언
        int x = 10;
        long y = 1000000000000000L; // long 타입은 뒤에 'L' 또는 'l'을 붙여야 함
        short z = 32767;
        byte b = 127;

        //  실수형 변수 선언
        float a = 3.14f; // float 타입은 뒤에 'F' 또는 'f'를 붙여야 함
        double c = 2.71245;

        //  문자형 변수 선언
        char ch = 'A';

        //  논리형 변수 선언
        boolean bool = true;

        //  변수 출력
        System.out.println("정수형 변수: " + x + ", " + y + ", " + z + ", " + b);
        System.out.println("실수형 변수: " + z + ", " + c);
        System.out.println("문자형 변수: " + ch );
        System.out.println("논리형 변수: " + bool );

        /////////////////////////
        //  Reference Type
        System.out.println("--- 참조형 ---");

        //  String 참조형 변수 선언과 초기화
        //  - Java 에서 String 타입은 특별함. 참조형이지만, 기본형처럼 사용함. (분변 객체)
        //  - 기본 자료형은 "==" 연산자를 통해 비교하지만, String 객체간 비교는 .equals() 메소드 사용
        String greeting = "Hello, World!";

        //  배열 (Array) 참조형 변수 선언과 초기화
        int[] nums = {1,2,3,4,5};

        //  클래스 (Class) 참조형 변수 선언과 초기화
        _01_basic_syntax.Person person = new _01_basic_syntax.Person("Jhon", 30);

        //  출력
        System.out.println("String 변수" + greeting);
        //  ver. 일반 for 문
        System.out.print("배열 변수: ");
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }
        //  ver. forEach 문
        for(int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("Person 객체: " + person.getName() + ", " + person.getAge());

    }
}

// 클래스
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {return name;}
    public int getAge() {return age;}

}