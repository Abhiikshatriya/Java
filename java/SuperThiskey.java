class A {
    public A() {
        super();
        System.out.println("in A");
    }

    public A(int n) {
        super();
        System.out.println("in int A");
    }
}

class B extends A {
    public B() {
        super(); // super keyword is used to call the constructor which is in super class
        System.out.println("in B");
    }

    public B(int n) {
        this(); // this keyword is used to call the constructor which in same class
        System.out.println("in int B");
    }
}

public class SuperThiskey {
    public static void main(String args[]) {
        B obj = new B(5);
    }

}
