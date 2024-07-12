class A {
    public char[] marks;

    public int add(int n1, int n2) {
        return n1 + n2;
    }

    public void shows() {
    }
}

class B extends A {
    public int add(int n1, int n2) {
        return n1 + n2 + 1; // if 2 method names are same it takes local one(same class) is method
                            // overriding
    }
}

public class MethodOverrid {
    public static void main(String args[]) {
        B obj = new B();
        int r1 = obj.add(5, 4);
        System.out.println(r1);
    }
}
