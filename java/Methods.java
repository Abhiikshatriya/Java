class computer {
    public void PlayAsong() {
        System.out.println("playing music");
    }

    public String getApen(int cost) {
        if (cost >= 10)
            return "pen";
        return "nothing";
    }
}

public class Methods {
    public static void main(String args[]) {
        computer obj = new computer();
        obj.PlayAsong();
        String str = obj.getApen(1);
        System.out.println(str);
    }

}
