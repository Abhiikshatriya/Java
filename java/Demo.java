interface X {
    void run();
}

class B implements X {
    public void run() {
        System.out.println("hai");
    }

}

public class Demo {
    public static void main(String args[]) {

        B obj = new B();
        obj.run();
    }
}
