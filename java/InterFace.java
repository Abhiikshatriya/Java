interface A {
    int age = 12;
    String name = "abhi"; // variables are final in interface we can't modify them.

    void show();

    void config();

}

interface X {
    void run();
}

class B implements A, X {

    public void show() {
        System.out.println("in show");
    }

    public void config() {
        System.out.println("in config");

    }

    public void run() {

    }

}

public class InterFace {
    public static void main(String args[]) {
        A obj;
        obj = new B();
        obj.show();
        obj.config();
        X obj1 = new B();
        obj1.run();
        // A.age=13; // we cant assign value to final var
        System.out.println(obj.age);
    }

}
