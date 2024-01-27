package _05_class._09_Collection._set;

public class Course {
    private int id;
    private String title;
    public Course(int id, String title) {
        this.id = id;
        this.title = title;
    }

    // id, title 값이 같으면 동일한 hashCode 리턴함
    // 참고. hashCode 란?
    // - hashCode: 객체의 메모리 주소를 기반으로 한 정수 값의 해시 코드
    // - hashCode() 메소드: Object 클래스에 정의되어 있으며, 객체의 해시 코드를 반환하는 역할
    // - 클래스에서 hashCode() 재정의: 객체의 내부 상태를 기반으로 한 고유한 해시 코드를 생성 가능

    @Override
    public int hashCode() {
        // title 은 String 이므로 hashCode() 메소드 사용
        // id 는 int 이므로 정수 값의 해시 코드에 더하기 연산
        return title.hashCode() + id;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Course target) {
            // int 는 프리미티브 벨류라서?
            // id 는 int 이므로 == 비교
            // string 은 레퍼런스 벨류라서? 아니면 String 이라서?
            // title 은 String 이므로 equals 로 비교
            return target.id == id && target.title.equals(title);
        } else {
            return false;
        }
    }
    @Override
    public String toString() {
        return "Course{" + "id=" + id + '\'' + ", title=" + title + '\'' + "}";
    }
}
