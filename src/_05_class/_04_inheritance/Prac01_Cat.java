package _05_class._04_inheritance;

public class Prac01_Cat extends Prac01_Animal{
    String species = "고양이";
    String name = "장군";
    int age = 6;
    public Prac01_Cat() {
        this.setAnimal(species,name, age);
    }
    @Override
    public void makeSound() {
        System.out.println(this.name + ": 냐옹~ 냐옹~");
    }
//    Prac01_Cat cat = new Prac01_Cat();
//        cat.getAnimal();
//        cat.makeSound();
    public static void main(String[] args) {
        Prac01_Cat cat = new Prac01_Cat();
        cat.getAnimal();
        cat.makeSound();
        String[] testArr = cat.getInfo();
        for(String test : testArr ) {
            System.out.println(test);
        }
    }
}
