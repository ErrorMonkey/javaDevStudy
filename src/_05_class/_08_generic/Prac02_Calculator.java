package _05_class._08_generic;

public class Prac02_Calculator {
    public static void main(String[] args) {
        Calculator<Integer> calculator1 = new Calculator<>(5, 10);
        System.out.println("Integer sum: " + calculator1.add());
        Calculator<Double> calculator2 = new Calculator<>(5.21, 7.156);
        System.out.println("Double sum: " + calculator2.add());
    }
}

class Calculator<T extends Number> {
    private T num1;
    private T num2;
    Calculator(T num1, T num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    public Double add() {
        // return Double result = this.num1.doubleValue() + this.num2.doubleValue();
        // Double wrapper 로 알아서 감싸서 반환하는 건가?
        return this.num1.doubleValue() + this.num2.doubleValue();
    }
}
