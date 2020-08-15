class A {
  static {
    System.out.println("a");
  }
  public A(){
    System.out.println("b");
  }

}
class B extends A{
  static {
    System.out.println("c");
  }
  public B(){
    System.out.println("d");
  }

}

public class Main {


  public static void main(String[] args) {
    A a=new B();
    a=new B();
    System.out.println("sss");
  }
}
