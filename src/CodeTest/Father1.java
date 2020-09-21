package CodeTest;

class AA {

    void fun1() {
        System.out.println("fun1 A");
    }

    void fun2() {
        System.out.println("fun2 A");
    }
}

class BB extends AA {
    void fun1() {
        System.out.println("fun1 B");
    }

    void fun2() {
        System.out.println("fun2 B");
    }
}

class C extends BB {

}

public class Father1 {
    public static void main(String[] args) {
        AA a = new BB();
        AA b = new C();
        a.fun1();
        b.fun2();

    }
}

