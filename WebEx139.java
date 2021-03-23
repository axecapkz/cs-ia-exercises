public class WebEx139 {
    public static void main(String[] args) {
        double x = -32.2;
        boolean isPositive = (x > 0);
        //it will not work because it uses local boolean ==>  =true should be removed
        //if (isPositive = true) System.out.println(x + " is positive");
        if (isPositive) System.out.println(x + " is positive");
        else System.out.println(x + " is not positive");
    }
}
