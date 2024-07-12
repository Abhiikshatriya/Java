public class Str {
    public static void main(String args[]) {
        String name = "Abhi";
        name = name + "ram";
        System.out.println("hello " + " " + name);
        String s1 = "Abhi";
        String s2 = "Abhi";
        System.out.println(s1 == s2);// it doesnt ceate duplictes just allocating addresses to refereses
    }

}
