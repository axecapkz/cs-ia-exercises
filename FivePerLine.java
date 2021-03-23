public class FivePerLine {
    public static void main(String[] args) {
        int num1 = 1000;
        int num2 = 1500;
        int counter = 0;
        for (int i = 0; i < 250; i++) {
            System.out.println(num1 + " " + (num1 + 1) + "   " + (num2) + " " + (num2 + 1));
            num1 = num1 + 2;
            num2 = num2 + 2;
        }
        System.out.println("            " + 2000);

    }
}
