package _05_class._08_generic;

import java.util.ArrayList;

class CustomListGeneric<T> {
    ArrayList<T> list = new ArrayList<>();
    public void addElement(T element) {
        list.add(element);
    }
    public void removeElement(T element) {
        list.remove(element);
    }

    public T get(int i) {
        return list.get(i);
    }

    @Override
    public String toString() {
        return "CustomListGeneric = " + list;
    }
}

public class GenericEx {
    public static void main(String[] args) {
        CustomListGeneric<Integer> genericList1 = new CustomListGeneric<>();
        genericList1.addElement(1);
        genericList1.addElement(3);
        genericList1.addElement(6);
        System.out.println(genericList1.toString());

        Integer el = genericList1.get(1);

        CustomListGeneric<Character> genericList2 = new CustomListGeneric<>();
        genericList2.addElement('A');
        genericList2.addElement('C');
        System.out.println(genericList2.toString());
    }
}