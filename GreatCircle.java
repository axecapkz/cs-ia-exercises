@SuppressWarnings("ALL")
public class GreatCircle {
    public static void main(String[] args) {

        // converts inputs to Radians
        double x1 = Math.toRadians(Double.parseDouble(args[0]));
        double y1 = Math.toRadians(Double.parseDouble(args[1]));
        double x2 = Math.toRadians(Double.parseDouble(args[2]));
        double y2 = Math.toRadians(Double.parseDouble(args[3]));

        // calculate distance
        double d = Math
                .acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math
                        .cos(y1 - y2));

        // converts from Radians to Degrees
        d = Math.toDegrees(d);
        double distance = 60 * d;

        System.out.println("Distance to: " + distance + " nautical miles.");
    }
}
