/*for getting private values
class human {
    private int age = 10;
    private String name = "Abhi";

    public int getAge() {

        return age;
    }

    public String getName() {
        return name;
    }
}

public class EnCap {
    public static void main(String args[]) {
        human obj = new human();
        // obj.age = 15;
        // obj.name = "Abhi";
        // System.out.println(obj.age);
        System.out.println(obj.getAge() + "  " + obj.getName());

    }

}
*/
// for setting values in private
class human {
    private int age;
    private String name;

    public int setAge(int a) {
        age = a;
        return a;
    }

    public String setName(String n) {
        name = n;
        return n;
    }
}

public class EnCap {
    public static void main(String args[]) {
        human obj = new human();
        // obj.age = 15;
        // obj.name = "Abhi";
        // System.out.println(obj.age);
        System.out.println(obj.setAge(20) + "  " + obj.setName("abhiram"));

    }

}