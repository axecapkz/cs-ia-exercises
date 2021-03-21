public class PrintFromAmtoPM {
    public static void main(String[] args) {
        boolean midnight = false;

        for (int i = 0; i < 12; i++) {
            if (i == 0)
                System.out.println(i + ":00" + " Midnight");
            else if (i < 12)
                System.out.println(i + ":00" + " AM");
            else if (i == 12)
                System.out.println("Noon");
            else if (i > 12)
                System.out.println(i + ":00" + " PM");
        }
    }
}
