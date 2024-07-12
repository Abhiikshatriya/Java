class A {
    public A() {
        System.out.println("objet created");
    }

    public void show() {
        System.out.println("in show");
    }
}

public class AnonymousObj {
    public static void main(String args[])

    {
        new A().show(); // it was an ananymous object we cant use multiple times
    }
}
