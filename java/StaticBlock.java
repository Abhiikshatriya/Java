class mobile {
    int price;
    static String name;
    String brand;

    public void show() {
        System.out.println(name + " " + brand + " " + price);
    }

    public mobile() {
        brand = " ";
        price = 200;
        System.out.println("in constructor block");
    }

    static {
        name = "smartphone";
        System.out.println(" in static block"); // used to intialize static variables
    }
}

public class StaticBlock {
    public static void main(String args[]) {
        mobile obj1 = new mobile();
        obj1.brand = "apple";
        obj1.price = 1500;
        // mobile obj2 = new mobile();
        obj1.show();

    }

}
