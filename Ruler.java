public class Ruler {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        String r = "1";
        for (int i = 1; i <= n; i++)
            r = r + " " + i + " " + r;
        System.out.println(r);
    }
}
