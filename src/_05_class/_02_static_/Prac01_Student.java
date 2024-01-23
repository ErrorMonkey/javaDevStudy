package _05_class._02_static_;

import java.util.ArrayList;
import java.util.Scanner;

public class Prac01_Student {
    private static int totalStudents = 0;
    public static ArrayList<Prac01_Student> students = new ArrayList<>();
    private String name;
    private int student_id;
    private int grade;
    public void setStudent(String name, int id, int grade) {
        this.name = name;
        this.student_id = id;
        this.grade = grade;
        totalStudents++;
    }
    public void getStudent() {
        System.out.println("=== 학생 정보 ===");
        System.out.println("이름: " + this.name);
        System.out.println("학번: " + this.student_id);
        System.out.println("학년: " + this.grade);
    }
    public Prac01_Student() {
        this.name = "";
        this.student_id = 0;
        this.grade = 0;
    }
    public static void displayInfo() {
        for (Prac01_Student student : students) {
            student.getStudent();
        }
        System.out.println("======");
        System.out.println("총 학생 수는: " + totalStudents);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n=== 이름, 학번, 학년을 입력하세요. ===");
            String name = sc.next();
            if (name.equals("0")) {
                break;
            }
            int id = sc.nextInt();
            int grade = sc.nextInt();

            Prac01_Student student = new Prac01_Student();
            student.setStudent(name, id, grade);
            Prac01_Student.students.add(student);
        }
        Prac01_Student.displayInfo();
        sc.close();
    }
}
