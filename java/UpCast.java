class A {
    public void show1() {
        System.out.println("in show1");
    }
}

class B extends A {

    public void show2() {
        System.out.println("in show2");
    }

}

public class UpCast {
    public static void main(String args[]) {
        A obj = new B(); // UPCast
        obj.show1();
        B obj1 = (B) obj; // DownCast
        obj1.show2();
    }

}
