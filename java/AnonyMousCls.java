class A {
    int age;

    public void show() {
        System.out.println("in Show");
    }
}

public class AnonyMousCls {
    public static void main(String args[]) {
        A obj = new A() {
            public void show() { // doesnt have cla name so it is called anonymous
                System.out.println("in new show");
            }
        };
        obj.show();
    }

}
