class humans {
    private int age;
    private String name;

    public humans() { // default constructor
        age = 12;
        name = "Abhi";
    }

    public humans(int a, String n) { // parameterized constructor
        age = a;
        name = n;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class ConStructor {
    public static void main(String args[]) {
        humans obj = new humans();
        humans obj1 = new humans(55, "ram");
        System.out.println(obj.getName() + " " + obj.getAge());
        System.out.println(obj1.getAge() + " " + obj1.getName());

    }

}
