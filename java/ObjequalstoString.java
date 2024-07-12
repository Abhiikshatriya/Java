class Laptop {
    String brand;
    int price;

    public String toString() {
        return price + " " + brand;
    }

    public boolean equals(Laptop that) {

        return this.brand.equals(that.brand) && this.price == that.price;

    }

}

public class ObjequalstoString {
    public static void main(String args[]) {
        Laptop obj = new Laptop();
        obj.price = 1500;
        obj.brand = "samsung";

        Laptop obj1 = new Laptop();
        obj1.price = 1500;
        obj1.brand = "samsung";
        boolean result = obj.equals(obj1);
        System.out.println(result);
    }

}
