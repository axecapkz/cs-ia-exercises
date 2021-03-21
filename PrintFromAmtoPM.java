public class PrintFromAmtoPM {
    public static void main(String[] args) {
        
        for (int i = 0; i < 12; i++) {
            if (i == 0)
                System.out.println(i + ":00" + " Midnight");
            else
                System.out.println(i + ":00" + " AM");
        }
        for (int x = 0; x < 12; x++) {
            if (x == 0)
                System.out.println("12:00 Noon");
            else
                System.out.println(x + ":00" + " PM");

        }
    }
}
