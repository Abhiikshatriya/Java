class humans {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

public class ThisKey {

    public static void main(String args[]) {
        humans obj = new humans();
        obj.setAge(21);
        obj.setName("Abhi");
        System.out.println(obj.getName() + " " + obj.getAge());

    }
}
