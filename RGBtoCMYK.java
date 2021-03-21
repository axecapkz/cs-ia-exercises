public class RGBtoCYMK {
    public static void main(String[] args) {

        // integers declaration

        int red = Integer.parseInt(args[0]);
        int green = Integer.parseInt(args[1]);
        int blue = Integer.parseInt(args[2]);

        System.out.println("Red = " + red);
        System.out.println("Green = " + green);
        System.out.println("Blue = " + blue);

        // doubles declaration

        double white, cyan, magenta, yellow, black;

        // applying formula to convert RGB to CMYK

        white = Math.max(red / 255.0, Math.max(blue / 255.0, green / 255.0));
        cyan = (white - (red / 255.0)) / white;
        magenta = (white - (green / 255.0)) / white;
        yellow = (white - (blue / 255.0)) / white;
        black = 1.0 - white;

        System.out.println("Cyan = " + cyan);
        System.out.println("Magenta = " + magenta);
        System.out.println("Yellow = " + yellow);
        System.out.println("Black = " + black);
    }
}
