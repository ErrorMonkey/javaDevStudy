package _05_class._04_inheritance;

public class Prac01_Animal {
    String species;
    String name;
    int age;

    public void setAnimal(String species, String name, int age) {
        this.species = species;
        this.name = name;
        this.age = age;
    }

    public void getAnimal() {
        System.out.println("=== 동물 정보 ===");
        System.out.println("종: " + this.species);
        System.out.println("이름: " + this.name);
        System.out.println("나이: " + this.age);
        System.out.println();
    }

    public String[] getInfo() {
        String[] infoArr = {this.species, this.name};
        return infoArr;
    }

    public void makeSound() {
        System.out.println("동물은 소리를 낸다.");
    }

}
