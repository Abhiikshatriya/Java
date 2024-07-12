class Calci {
    public final void show() {
        System.out.println("BY Abhi");
    }

    public void add(int a, int b) {
        System.out.println(a + b);
    }
}

class AdvCalci extends Calci {                    // it protects from method overriding
    /*
     * public void show() {
     * System.out.println("BY Ram");
     * }
     */
}

public class Final {
    public static void main(String args[]) {
        Calci obj = new Calci();
        obj.show();
        obj.add(5, 6);

    }

}
