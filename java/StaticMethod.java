class mobile {
    int price;
    String brand;
    static String name;

    public void show() {
        System.out.println(brand + " " + price + " " + name);
    }

    public static void show1(mobile obj) {
        System.out.println(obj.brand + " " + obj.price + " " + name);
    }
}

public class StaticMethod {
    public static void main(String args[]) {
        mobile obj1 = new mobile();
        mobile obj2 = new mobile();
        obj1.price = 1500;
        obj1.brand = "apple";
        obj1.name = "smartphone";
        obj2.price = 1700;
        obj2.brand = "samsung";
        obj2.name = "smartphone";
        // obj1.name = "phone";
        obj1.show();
        obj2.show();
        mobile.show1(obj1);

    }
}