public class StrBuf {
    public static void main(String args[]) {
        StringBuffer sb = new StringBuffer("Abhi");
        sb.append("ram");
        sb.replace(0, 2, "jay");
        sb.delete(0, 5);
        sb.insert(0, "abhi");
        System.out.println(sb);

    }

}
