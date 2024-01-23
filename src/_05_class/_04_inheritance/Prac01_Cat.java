package _05_class._04_inheritance;

public class Prac01_Cat extends Prac01_Animal{
    Prac01_Cat(String species, String name, int age) {
        this.species = species;
        this. name = name;
        this.age = age;
        this.makeSound("냐옹~");
    }
}
