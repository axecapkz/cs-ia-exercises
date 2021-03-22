public class AllEqual {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int z = Integer.parseInt(args[2]);

        if (x == y && y == z)
            System.out.println(
                    "Inputs are equal" + "\nx = " + x + "\ny = " + y + "\nz = " + z);
        else
            System.out.println(
                    "Inputs are not equal" + "\nx = " + x + "\ny = " + y + "\nz = " + z);
    }

}

