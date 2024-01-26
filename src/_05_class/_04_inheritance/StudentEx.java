package _05_class._04_inheritance;

public class StudentEx {
    public static void main(String[] args) {
        Student std1 = new Student("김새싹", 20);

//        // Case 1. 부모, 자식 클래스의 필드가 public 인 경우
//        // Person(부모) 클래스로부터 상속 받은 필드 값 읽기
//        System.out.println(std1.name);
//        System.out.println(std1.age);
//
//        // 자식 클래스 필드 값 읽기
//        System.out.println(std1.campus); // null
//
//        // Person 으로 부터 상속 받은 메소드 호출
//        std1.say();
//        std1.eat("바나나");
//
//        // student 필드 접근
//        std1.setCampus("용산");
//        System.out.println(std1.campus);

        //
        // Case 2. 부모, 자식 클래스의 필드가 private 인 경우
        // Person 으로부터 상속 받은 필드 읽기
        System.out.println(std1.getName());
        System.out.println(std1.getAge());

        // Student 필드 읽기
        System.out.println(std1.getCampus());

        // Person 으로부터 상속 받은 메소드 호출
        std1.say();

        // Student 로부터 상속 받은
        std1.setCampus("새싹 용산");
        System.out.println(std1.getCampus());


    }
}
