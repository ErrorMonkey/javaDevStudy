package _05_class._05_abstract;

public class Prac01_Student {
    public static void main(String[] args) {
        Kim kim = new Kim();
        Baek baek = new Baek();
        kim.getInfo();
        baek.getInfo();
    }
}

abstract class Student {
    String name;
    String school;
    int age;
    int student_id;
    Student(String name, String school, int age, int id) {
        this.name = name;
        this.school = school;
        this.age = age;
        this.student_id = id;
    }
    abstract void todo();

    void getInfo() {
        System.out.println("=== " + this.name + " 학생의 정보 ===");
        System.out.println("학교: " + this.school);
        System.out.println("나이: " + this.age);
        System.out.println("학번: " + this.student_id);
        todo();
        System.out.println();
    }
}

class Kim extends Student {
    Kim() {
        super("김철수","ABC 고등학교",17, 20220101);
    }
    void todo() {
        System.out.println("점심은 김가네 김밥");
    }
}

class Baek extends Student {
    Baek() {
        super("백영희","XYZ 고등학교",18, 20210314);
    }
    void todo() {
        System.out.println("점심은 백종원 피자");
    }
}
