package _05_class._04_inheritance;

public class Prac01_Animal {
    String species;
    String name;
    int age;
    public void makeSound() {
        System.out.println("동물은 소리를 낸다.");
    }
    public void walking(String walkingSound) {
        System.out.println(this.name + "가 " + walkingSound + " 걸어간다.");
    }
}
