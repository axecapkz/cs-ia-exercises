public class Ordered {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int z = Integer.parseInt(args[2]);

        // checking numbers if they are in ascending or descending order
        boolean ad = (x < y && y < z) || (x > y && y > z);

        // will show result true or false
        System.out.println(ad);

    }
}
