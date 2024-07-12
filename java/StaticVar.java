class mobile {
    String brand;
    int price;
    static String name;

    public void show() {
        System.out.println(brand + " :" + price + " : " + name);
    }
}

public class StaticVar {
    public static void main(String args[]) {
        mobile obj1 = new mobile();
        mobile obj2 = new mobile();

        obj1.brand = "apple";
        obj1.price = 1500;
        mobile.name = "samrtphone";

        obj2.brand = "samsung";
        obj2.price = 1700;
        mobile.name = "samrtphone";
        obj1.name = "phone";
        obj1.show();
        obj2.show();

    }

}
// static means commmon sharable value by multiple objects
// **--> here value of obj1 reflect on value on obj2