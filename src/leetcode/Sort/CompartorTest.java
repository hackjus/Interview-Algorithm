package leetcode.Sort;

import java.util.Arrays;
import java.util.Comparator;

class ComparatorTest {
    public static void main(String[] args) {
        Dog[] dogs = new Dog[]{
                new Dog("老旺财", 10),
                new Dog("小旺财", 3),
                new Dog("二旺财", 5),
        };
        // Comparator 排序
        Arrays.sort(dogs,(Dog d1,Dog d2)->d1.getAge()-d2.getAge());
        for (Dog d : dogs) {
            System.out.println(d.getName() + "：" + d.getAge());
        }
    }
}
class DogComparator implements Comparator<Dog> {
    @Override
    public int compare(Dog o1, Dog o2) {
        return o1.getAge() - o2.getAge();
    }
}
class Dog {
    private String name;
    private int age;
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
}