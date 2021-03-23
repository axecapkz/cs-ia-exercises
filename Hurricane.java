//Write a program Hurricane.java that that takes the wind speed (in miles per hour)
// as an integer command-line argument and prints whether it qualifies as a hurricane,
// and if so, whether it is a Category 1, 2, 3, 4, or 5 hurricane.
// Below is a table of the wind speeds according to the Saffir-Simpson scale.

public class Hurricane {
    public static void main(String[] args) {
        int userInput = Integer.parseInt(args[0]);

        if (userInput < 74) System.out.println("Not a hurricane.");
        else if (userInput < 95) System.out.println("Category 1: Wind speed 74 mph - 95 mph");
        else if (userInput < 110) System.out.println("Category 2: Wind speed 96 mph - 110 mph");
        else if (userInput < 130) System.out.println("Category 3: Wind speed 111 mph - 130 mph");
        else if (userInput < 155) System.out.println("Category 4: Wind speed 131 mph - 155 mph");
        else System.out.println("Category 5: Wind speed 155 mph and above.");
    }
}

