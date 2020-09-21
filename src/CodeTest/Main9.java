package CodeTest;

class A {
    static {
        System.out.println("super");
    }

    public static int value = 49;
}

class B extends A {

    static {
        System.out.println("subclass");
    }
}

public class Main9 {


    public static void main(String[] args) {
//        System.out.println(Father.value);
//        new Main9().countBits(5);
        float a = 0;
        int b = 0;
        System.out.println(a == b);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 10000000; j++) {
                a++;
                b++;
            }
            System.out.println("__" + (a == b));
        }
    }
}
